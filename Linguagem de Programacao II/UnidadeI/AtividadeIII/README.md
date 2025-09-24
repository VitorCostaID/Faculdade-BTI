# 1 – Loja de Livros

Enunciado:
Uma livraria deseja informatizar o controle de seus livros. Cada livro deve ter um título,
um ano de publicação e um preço.

O sistema deve permitir:
1. Criar livros informando título, ano e preço no momento da criação (construtor com
parâmetros).
2. Alterar o preço de um livro com um método setPreco(double preco), garantindo
que o valor não seja negativo.
3. Exibir as informações completas de cada livro com um método exibirInfo().

```
Tarefa:
Implemente a classe Livro de acordo com os requisitos e no método main crie pelo menos
dois objetos da classe, altere o preço de um deles e mostre as informações na tela.
```

# 2 – Conta Bancária

Enunciado:
Um banco precisa de um sistema simples para representar contas de clientes. Cada conta
deve ter um saldo, mas este atributo não pode ser acessado diretamente (encapsulamento).

O sistema deve permitir:
1. Criar uma conta com saldo inicial através de um construtor.
2. Depositar valores positivos usando um método depositar(double valor).
3. Sacar valores, desde que o saldo seja suficiente, usando um método sacar(double
valor).
4. Consultar o saldo atual de forma controlada com getSaldo().

```
Tarefa:
Implemente a classe Conta com os métodos descritos e no main crie uma conta, faça alguns
depósitos e saques e exiba o saldo após cada operação
```