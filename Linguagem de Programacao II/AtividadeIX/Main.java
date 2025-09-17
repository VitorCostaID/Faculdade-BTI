import java.util.ArrayList;
import java.util.List;

// Classe Abstrata Aeronave
abstract class Aeronave {
    private String modelo;
    private int capacidadePassageiros;
    private int anoFabricacao;

    public Aeronave(String modelo, int capacidadePassageiros, int anoFabricacao) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirInfo() {
        System.out.println("--- Informações da Aeronave ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    public abstract void decolar();
}

// 2. Subclasse Aviao
class Aviao extends Aeronave {
    public Aviao(String modelo, int capacidadePassageiros, int anoFabricacao) {
        super(modelo, capacidadePassageiros, anoFabricacao);
    }

    @Override
    public void decolar() {
        System.out.println("O avião " + getModelo() + " está decolando da pista.");
    }
}

// Subclasse Helicoptero
class Helicoptero extends Aeronave {
    private String tipoRotor;

    public Helicoptero(String modelo, int capacidadePassageiros, int anoFabricacao, String tipoRotor) {
        super(modelo, capacidadePassageiros, anoFabricacao);
        this.tipoRotor = tipoRotor;
    }

    // Getter e Setter
    public String getTipoRotor() {
        return tipoRotor;
    }

    public void setTipoRotor(String tipoRotor) {
        this.tipoRotor = tipoRotor;
    }

    @Override
    public void decolar() {
        System.out.println("O helicóptero " + getModelo() + " com rotor " + tipoRotor + " está decolando verticalmente.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de Rotor: " + tipoRotor);
    }
}

// Classe Passageiro
class Passageiro {
    private String nome;
    private int idade;
    private String destino;

    public Passageiro(String nome, int idade, String destino) {
        this.nome = nome;
        this.idade = idade;
        this.destino = destino;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDestino() {
        return destino;
    }

    public void embarcar() {
        System.out.println("O passageiro " + nome + " com destino a " + destino + " está embarcando.");
    }
}

// Classe Piloto
class Piloto {
    private String nome;
    private String cargo;
    private int experienciaAnos;

    public Piloto(String nome, String cargo, int experienciaAnos) {
        this.nome = nome;
        this.cargo = cargo;
        this.experienciaAnos = experienciaAnos;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }

    public void exibirInfo() {
        System.out.println("--- Informações do Piloto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Experiência: " + experienciaAnos + " anos");
    }

    public void comandarVoo() {
        System.out.println("O piloto " + nome + " está comandando o voo.");
    }
}

// Classe Rota
class Rota {
    private String origem;
    private String destino;
    private double distancia;
    private double duracaoEstimadaHrs;

    public Rota(String origem, String destino, double distancia, double duracaoEstimadaHrs) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.duracaoEstimadaHrs = duracaoEstimadaHrs;
    }

    // Getters
    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getDuracaoEstimadaHrs() {
        return duracaoEstimadaHrs;
    }

    public void exibirRota() {
        System.out.println("--- Informações da Rota ---");
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Duração Estimada: " + duracaoEstimadaHrs + " horas");
    }

    public void calcularTempoRestante(double tempoDecorrido) {
        double tempoRestante = duracaoEstimadaHrs - tempoDecorrido;
        if (tempoRestante > 0) {
            System.out.println("Tempo restante para o destino: " + tempoRestante + " horas.");
        } else {
            System.out.println("O voo já chegou ao seu destino.");
        }
    }
}

// Classe Aeroporto
class Aeroporto {
    private String nome;
    private String localizacao;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void receberAeronave(Aeronave aeronave) {
        System.out.println("O aeroporto " + nome + " está recebendo a aeronave " + aeronave.getModelo() + ".");
    }

    public void liberarDecolagem(Aeronave aeronave) {
        System.out.println("O aeroporto " + nome + " está liberando a decolagem para a aeronave " + aeronave.getModelo() + ".");
    }

    public void abastecerAeronave(Aeronave aeronave) {
        System.out.println("O aeroporto " + nome + " está abastecendo a aeronave " + aeronave.getModelo() + ".");
    }
}

// Classe FrotaAerea
class FrotaAerea {
    private List<Aeronave> aeronaves;

    public FrotaAerea() {
        this.aeronaves = new ArrayList<>();
    }

    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
        System.out.println("Aeronave " + aeronave.getModelo() + " adicionada à frota.");
    }

    public void exibirFrota() {
        System.out.println("\n--- Informações da Frota ---");
        if (aeronaves.isEmpty()) {
            System.out.println("A frota está vazia.");
        } else {
            for (Aeronave aeronave : aeronaves) {
                aeronave.exibirInfo();
                System.out.println("-------------------------");
            }
        }
    }
}

// (Main)
public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Aviao aviao1 = new Aviao("Boeing 747", 450, 2015);
        Helicoptero helicoptero1 = new Helicoptero("Bell 407", 7, 2020, "Convencional");
        
        Piloto piloto1 = new Piloto("Carlos Silva", "Comandante", 15);
        Passageiro passageiro1 = new Passageiro("Ana Souza", 32, "Paris");
        
        Rota rota1 = new Rota("São Paulo", "Paris", 9400, 11.5);
        Aeroporto aeroportoGuarulhos = new Aeroporto("Aeroporto de Guarulhos", "São Paulo");
        
        FrotaAerea frota = new FrotaAerea();
        frota.adicionarAeronave(aviao1);
        frota.adicionarAeronave(helicoptero1);

        // --- Simulação do Gerenciamento da Frota ---
        System.out.println("\n" + "=".repeat(40));
        System.out.println("      Iniciando a Simulação de Voo");
        System.out.println("=".repeat(40) + "\n");

        frota.exibirFrota();

        piloto1.exibirInfo();
        rota1.exibirRota();
        
        System.out.println("\n--- Procedimentos de Voo ---");
        aeroportoGuarulhos.receberAeronave(aviao1);
        passageiro1.embarcar();
        piloto1.comandarVoo();
        aeroportoGuarulhos.liberarDecolagem(aviao1);
        aviao1.decolar();
        
        System.out.println("\n--- Voo em Andamento ---");
        rota1.calcularTempoRestante(5.0);
        
        System.out.println("\n--- Procedimentos de Pouso ---");
        Aeroporto aeroportoParis = new Aeroporto("Aeroporto Charles de Gaulle", "Paris");
        aeroportoParis.receberAeronave(aviao1);
        aeroportoParis.abastecerAeronave(aviao1);
        
        System.out.println("\n--- Teste do Helicóptero ---");
        helicoptero1.exibirInfo();
        helicoptero1.decolar();
    }
}