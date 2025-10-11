import java.util.ArrayList;
import java.util.List;

class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String msg) {
        super(msg);
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

class OperacaoNaoPermitidaException extends Exception {
    public OperacaoNaoPermitidaException(String msg) {
        super(msg);
    }
}

// =====================
class Conta {
    private String numero;
    private String titular;
    private double saldo;
    private double limiteDiario = 500.00;
    private double totalSacadoHoje = 0.00;
    private List<String> historico = new ArrayList<>();

    public Conta(String numero, String titular, double saldoInicial) throws ValorInvalidoException {
        if (saldoInicial < 0) {
            throw new ValorInvalidoException("Saldo inicial inválido!");
        }
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        historico.add("Conta aberta com saldo inicial: R$" + saldoInicial);
    }

    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito inválido!");
        }
        saldo += valor;
        historico.add("Depósito: R$" + valor);
    }

    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException, OperacaoNaoPermitidaException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque inválido!");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        if ((totalSacadoHoje + valor) > limiteDiario) {
            throw new OperacaoNaoPermitidaException("Limite diário de saque excedido!");
        }

        saldo -= valor;
        totalSacadoHoje += valor;
        historico.add("Saque: R$" + valor);
    }

    public void transferir(Conta destino, double valor)
            throws ValorInvalidoException, SaldoInsuficienteException, OperacaoNaoPermitidaException {
        if (destino == this) {
            throw new OperacaoNaoPermitidaException("Não é permitido transferir para a mesma conta!");
        }
        this.sacar(valor);
        destino.depositar(valor);
        historico.add("Transferência enviada para conta " + destino.getNumero() + ": R$" + valor);
        destino.historico.add("Transferência recebida da conta " + this.numero + ": R$" + valor);
    }

    public String extratoSimples() {
        StringBuilder sb = new StringBuilder();
        sb.append("Extrato da conta ").append(numero)
          .append(" - Titular: ").append(titular).append("\n");
        for (String op : historico) {
            sb.append(op).append("\n");
        }
        sb.append("Saldo atual: R$").append(saldo).append("\n");
        return sb.toString();
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}

// =====================
class Banco {
    private List<Conta> listaDeContas = new ArrayList<>();

    public void abrirConta(String numero, String titular, double saldoInicial) {
        try {
            Conta conta = new Conta(numero, titular, saldoInicial);
            listaDeContas.add(conta);
            System.out.println("Conta criada com sucesso para " + titular + "!");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao abrir conta: " + e.getMessage());
        }
    }

    public Conta buscar(String numero) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void transferirEntre(String numOrigem, String numDestino, double valor) {
        Conta origem = buscar(numOrigem);
        Conta destino = buscar(numDestino);

        if (origem == null || destino == null) {
            System.out.println("Conta(s) não encontrada(s)!");
            return;
        }

        try {
            origem.transferir(destino, valor);
            System.out.println("Transferência realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro na transferência: " + e.getMessage());
        }
    }
}

// =====================
public class SistemaBancario {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criação de contas
        banco.abrirConta("001", "Alice", 1000);
        banco.abrirConta("002", "Bruno", 300);

        // Busca das contas
        Conta c1 = banco.buscar("001");
        Conta c2 = banco.buscar("002");

        try {
            // Depósito válido
            c1.depositar(200);

            // Saque dentro do limite
            c1.sacar(400);

            // Transferência válida
            banco.transferirEntre("001", "002", 100);

            // Tentativa de saque acima do limite diário
            c1.sacar(200);
            c1.sacar(350); // Deve lançar exceção de limite

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Impressão dos extratos
        System.out.println("\n=== EXTRATOS ===");
        System.out.println(c1.extratoSimples());
        System.out.println(c2.extratoSimples());
    }
}
