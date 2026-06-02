# 🚀 Projeto 06: Programação Genérica com Templates em C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do sexto laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi explorar os conceitos de **Programação Genérica** em C++, utilizando **templates de classes** para criar estruturas reutilizáveis e independentes de tipos específicos.

Durante o projeto foi implementada uma classe genérica capaz de armazenar pares de valores de qualquer tipo compatível com os operadores necessários, permitindo realizar comparações e exibições sem duplicação de código.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Compilador:** `g++` (GNU Compiler Collection)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Técnica Aplicada:** Programação Genérica (*Generic Programming*)
* **Sistema de Build:** Makefile
* **Ambiente de Desenvolvimento:** GitHub Codespaces / Visual Studio Code
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### 🧩 Programação Genérica

A Programação Genérica permite desenvolver algoritmos e estruturas de dados independentes de tipos específicos, tornando o código mais reutilizável e flexível.

Em vez de criar versões diferentes da mesma classe para `int`, `double`, `string` e outros tipos, é possível utilizar um único modelo (*template*) capaz de trabalhar com qualquer tipo compatível.

Exemplo:

```cpp
template <class T>
class Par
{
    ...
};
```

Nesse caso, o compilador gera automaticamente versões especializadas da classe para cada tipo utilizado durante a compilação.

---

### 🏗️ Templates de Classe

Os templates permitem parametrizar uma classe através de tipos genéricos.

Durante este laboratório foi utilizada a seguinte estrutura:

```cpp
template <class T>
class Par
```

Isso possibilita criar objetos como:

```cpp
Par<int> numeros;
Par<double> valores;
Par<std::string> palavras;
```

mantendo exatamente a mesma implementação.

---

### ⚖️ Comparação Lexicográfica

Foi implementado um sistema de comparação baseado em precedência entre os elementos do par.

A lógica segue os seguintes critérios:

1. Compara o primeiro valor.
2. Caso sejam iguais, compara o segundo valor.
3. Retorna o resultado da comparação.

Esse tipo de estratégia é amplamente utilizado em estruturas de dados ordenadas e algoritmos de busca.

---

### 🔄 Reutilização de Código

Um dos principais objetivos dos templates é eliminar duplicação de código.

Sem templates seria necessário criar diversas versões da mesma classe:

```cpp
ParInt
ParDouble
ParString
```

Com programação genérica, uma única implementação atende todos os cenários.

---

## 💻 Parte Desenvolvida

### 📦 Classe Genérica `Par<T>`

**Descrição:** Desenvolvimento de uma classe template responsável por armazenar dois valores de um mesmo tipo e realizar operações de exibição e comparação.

**Declaração Principal:**

```cpp
template <class T>
class Par
```

**Atributos Privados:**

* `primeiroValor`
* `segundoValor`

Ambos definidos utilizando o tipo genérico `T`.

---

### 🏗️ Construtor Parametrizado

**Método Implementado:**

```cpp
Par(T primeiroValor, T segundoValor)
```

**Responsabilidade:**

Inicializar os dois elementos armazenados pelo objeto.

**Destaque Técnico:** Utilização do tipo genérico para permitir inicialização independente do tipo de dado utilizado.

---

### 🖨️ Método de Saída

**Método Implementado:**

```cpp
void saida()
```

**Responsabilidade:**

Exibir os elementos do par no formato:

```text
[primeiroValor, segundoValor]
```

**Exemplo:**

```text
[4, 6]
[4.3, 2.1]
[one, two]
```

**Destaque Técnico:** Utilização do operador de inserção em fluxo (`<<`) sobrecarregado pelos tipos utilizados.

---

### ⚖️ Comparação entre Pares

**Método Implementado:**

```cpp
char compararCom(Par& outroPar)
```

**Responsabilidade:**

Comparar dois objetos da classe e retornar:

* `<` quando o objeto atual for menor.
* `=` quando ambos forem iguais.
* `>` quando o objeto atual for maior.

**Critério de Comparação:**

1. Primeiro valor.
2. Segundo valor (apenas em caso de empate).

**Destaque Técnico:** Implementação de comparação lexicográfica utilizando operadores relacionais fornecidos pelo tipo genérico.

---

### 🔍 Exibição de Comparações

**Método Implementado:**

```cpp
void mostrarComparacao(Par& outroPar)
```

**Responsabilidade:**

Exibir o resultado da comparação entre dois pares.

Exemplo:

```text
[4, 6] > [3, 5]
```

**Destaque Técnico:** Reutilização dos métodos já implementados, promovendo maior modularidade e redução de duplicação de código.

---

## 🧠 Estrutura do Projeto

Uma possível organização para o projeto é:

```text
Projeto06/
│
├── Par.h
├── main.cpp
├── Makefile
│
└── main
```

Como se trata de uma classe template, normalmente toda sua implementação permanece no arquivo de cabeçalho (`.h`), permitindo que o compilador gere as especializações necessárias durante a compilação.

---

## 🚀 Como Executar o Projeto

Para compilar e executar o programa, é necessário possuir um compilador compatível com o padrão C++17.

### 1. Clonar o Repositório

Clona apenas a pasta específica deste projeto.

```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto6" >> .git/info/sparse-checkout
git pull origin main
```

---

### 2. Compilar o Projeto

Utilizando o Makefile desenvolvido para o laboratório:

```bash
make
```

O comando irá gerar automaticamente o executável:

```text
main
```

na raiz do projeto.

---

### 3. Executar o Programa

```bash
./main
```

---

## 📋 Saída Esperada

Ao executar o programa fornecido pelo laboratório, o resultado esperado é:

```text
[4, 6] > [3, 5]
[4.3, 2.1] = [4.3, 2.1]
[one, two] < [three, four]
```

Demonstrando que a mesma implementação funciona corretamente para:

* Números inteiros (`int`)
* Números de ponto flutuante (`double`)
* Cadeias de caracteres (`std::string`)

---

## 🎯 Resultados Obtidos

Ao final deste laboratório foi possível consolidar conceitos importantes da programação moderna em C++, incluindo:

* Programação Genérica.
* Templates de Classes.
* Reutilização de código.
* Comparação lexicográfica.
* Polimorfismo em tempo de compilação.
* Utilização de tipos parametrizados.
* Modularização de projetos.
* Automação da compilação com Makefiles.

Esses conceitos são amplamente utilizados na implementação da Biblioteca Padrão do C++ (STL), estruturas de dados genéricas, containers, algoritmos reutilizáveis e bibliotecas de alto desempenho utilizadas em aplicações profissionais.