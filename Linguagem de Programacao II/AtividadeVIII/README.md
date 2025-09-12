# Atividade 08

## Objetivo

Implementar, em Java, um sistema simples de biblioteca que utiliza classes abstratas e herança para representar diferentes tipos de materiais.

---

## Especificações

1.  **Classe Abstrata `Material`**
    * Representa qualquer material da biblioteca.
    * Deve possuir:
        * Atributo `titulo` (String).
        * Método abstrato `prazoDevolucaoDias()` que retorna o prazo máximo de devolução em dias (int).
        * Método `getTitulo()` que retorna o título do material (String).

2.  **Subclasses Concretas**
    * `Livro`: prazo de devolução = 14 dias.
    * `Revista`: prazo de devolução = 7 dias.
    * `DVD`: prazo de devolução = 3 dias.

3.  **Classe Principal `BibliotecaSimples`**
    * Criar um objeto de cada tipo (`Livro`, `Revista`, `DVD`).
    * Exibir no console o título de cada material e o respectivo prazo de devolução.

---

## Exemplo de Saída Esperada

Java: Como Programar - Prazo: 14 dias
Revista de Tecnologia - Prazo: 7 dias
Filme de Programação - Prazo: 3 dias