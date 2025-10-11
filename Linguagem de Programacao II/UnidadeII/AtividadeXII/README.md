# Atividade 12: Sistema Bancário Básico

## Descrição da Atividade

Implemente um pequeno sistema bancário que simule **operações básicas entre contas**. O sistema deve validar os valores informados e utilizar **exceções personalizadas** para tratar erros de forma apropriada.

As operações principais são:

* **Abertura de conta**;
* **Depósito**;
* **Saque**;
* **Transferência** entre contas.

---

## Requisitos Mínimos

1.  Criar uma classe `Conta` com os atributos: `numero`, `titular` e `saldo`.

2.  Implementar os métodos:
    * `depositar(double valor)`
    * `sacar(double valor)`
    * `transferir(Conta destino, double valor)`

3.  Criar exceções personalizadas:
    * `ValorInvalidoException` — para valores menores ou iguais a zero;
    * `SaldoInsuficienteException` — para saques ou transferências acima do saldo;
    * `OperacaoNaoPermitidaException` — para operações inválidas (como transferir para a mesma conta).

4.  Criar a classe `Banco` com as operações:
    * `abrirConta(String numero, String titular, double saldoInicial)`;
    * `buscar(String numero)`;
    * `transferirEntre(String numOrigem, String numDestino, double valor)`;

---

## Tarefas Propostas

1.  Adicione um **limite diário de saque** (ex.: R$500,00). Se o limite for excedido, lance `OperacaoNaoPermitidaException`.

2.  Crie um método `extratoSimples()` em `Conta` que retorne uma `String` com informações de operações realizadas.

3.  Implemente uma **simulação** com 2 ou 3 contas e teste **cenários de sucesso e falha**.