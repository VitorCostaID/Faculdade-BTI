# Atividade 05

* Objetivo

Desenvolver uma aplicação simples em Java que demonstre os princípios de
herança, uso da palavra-chave super e sobrescrita de métodos em sub-
classes.

*Estrutura de Classes*

1. Pessoa
• Atributo: nome
• Método: apresentar()

2. Aluno (subclasse de Pessoa)
• Atributo: matricula
• Sobrescreve apresentar()

3. Professor (subclasse de Pessoa)
• Atributo: disciplina
• Sobrescreve apresentar()

4. Funcionario (subclasse de Pessoa)
• Atributo: cargo
• Sobrescreve apresentar()

## Regras de Implementação

1. Todas as subclasses devem chamar o construtor da superclasse por meio
da instrução super(...).

2. O método apresentar() de cada subclasse deve:
• Reaproveitar a lógica herdada de Pessoa via super.apresentar().
• Acrescentar informações específicas de cada tipo (matrícula, dis-
ciplina ou cargo).

3. No método main, devem ser criados objetos individuais de Aluno, Professor
e Funcionario.

4. O programa deve exibir no console o resultado de cada chamada ao
método apresentar()

