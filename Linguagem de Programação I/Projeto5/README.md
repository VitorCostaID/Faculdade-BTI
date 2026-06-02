# 🚀 Projeto 05: Sobrecarga de Operadores e Números Complexos em C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do quinto laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi aprofundar os conceitos de **Programação Orientada a Objetos (POO)** por meio da implementação de uma classe capaz de representar e manipular números complexos, utilizando recursos avançados da linguagem C++, especialmente a **sobrecarga de operadores**.

Durante o projeto foram implementadas operações matemáticas fundamentais envolvendo números complexos, incluindo soma, subtração, multiplicação, negação e cálculo de módulo, utilizando a sintaxe natural dos operadores da linguagem.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Compilador:** `g++` (GNU Compiler Collection)
* **Bibliotecas:** `<cmath>`, `<iostream>`
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Sistema de Build:** Makefile
* **Ambiente de Desenvolvimento:** GitHub Codespaces / Visual Studio Code
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### ⚙️ Sobrecarga de Operadores

A sobrecarga de operadores permite redefinir o comportamento dos operadores da linguagem para tipos definidos pelo programador.

Essa funcionalidade torna o código mais intuitivo e próximo da notação matemática tradicional.

Exemplos:

```cpp
ComplexNumber z3 = z1 + z2;
ComplexNumber z4 = z1 * z2;
ComplexNumber z5 = -z1;
```

Em vez de utilizar métodos como:

```cpp
z1.somar(z2);
z1.multiplicar(z2);
z1.negar();
```

---

### 🧩 Modelagem de Números Complexos

Um número complexo é representado pela expressão:

z=a+bi

Onde:

* `a` representa a parte real.
* `b` representa a parte imaginária.
* `i` representa a unidade imaginária, definida por:

i^2=-1

A classe desenvolvida encapsula essas duas componentes e fornece operações matemáticas através de operadores sobrecarregados.

---

### 🏗️ Encapsulamento e Abstração

A classe `ComplexNumber` foi responsável por abstrair toda a lógica matemática relacionada aos números complexos.

Essa abordagem permite que o restante do programa utilize operações complexas através de uma interface simples e intuitiva.

---

### 🖨️ Sobrecarga de Streams

Foi implementada a sobrecarga do operador de inserção em fluxo (`<<`), permitindo que objetos da classe sejam enviados diretamente para a saída padrão.

Exemplo:

```cpp
std::cout << numeroComplexo;
```

Essa técnica é amplamente utilizada em bibliotecas profissionais e torna a impressão de objetos mais elegante e reutilizável.

---

## 💻 Parte Desenvolvida

### 🔢 Sistema de Operações com Números Complexos

**Descrição:** Desenvolvimento de uma classe orientada a objetos capaz de representar números complexos e realizar operações matemáticas utilizando sobrecarga de operadores.

**Classe Principal:** `ComplexNumber`

**Construtor Implementado:**

```cpp
ComplexNumber(double a, double b);
```

**Atributos Privados:**

* Parte real (`a`)
* Parte imaginária (`b`)

---

### ➕ Operador de Adição

Implementação da operação:

(a+bi)+(c+di)=(a+c)+(b+d)i

**Destaque Técnico:** Sobrecarga do operador `+` para permitir a soma direta entre dois objetos da classe.

---

### ➖ Operador de Subtração

Implementação da operação:

(a+bi)-(c+di)=(a-c)+(b-d)i

**Destaque Técnico:** Sobrecarga do operador `-` binário para realizar a diferença entre dois números complexos.

---

### ✖️ Operador de Multiplicação

Implementação da operação:

(a+bi)(c+di)=(ac-bd)+(ad+bc)i

**Destaque Técnico:** Aplicação da álgebra dos números complexos através da sobrecarga do operador `*`.

---

### 🔄 Operador de Negação

Implementação da operação unária:

-(a+bi)=-a-bi

**Destaque Técnico:** Utilização da versão unária do operador `-`, permitindo inverter simultaneamente os sinais das partes real e imaginária.

---

### 📏 Operador de Módulo

Implementação do cálculo do módulo de um número complexo:

|z|=\sqrt{a^2+b^2}

**Destaque Técnico:** Utilização da biblioteca `<cmath>` para cálculo da raiz quadrada através da função `sqrt()`.

---

### 🖨️ Operador de Saída

Implementação da sobrecarga do operador:

```cpp
operator<<
```

Responsável por exibir os números complexos no formato:

```text
a+bi
```

Exemplos:

```text
4+6i
-2-2i
-5+10i
```

---

## 🧠 Estrutura do Projeto

O projeto foi organizado seguindo a arquitetura proposta pelo laboratório:

```text
Projeto05/
│
├── include/
│   └── ComplexNumber.h
│
├── src/
│   └── ComplexNumber.cpp
│
├── main.cpp
│
├── Makefile
│
└── bin/
    └── complexo
```

Essa estrutura separa claramente a interface pública da implementação, seguindo boas práticas adotadas em projetos profissionais.

---

## 🚀 Como Executar o Projeto

Para compilar e executar o programa, é necessário possuir um compilador compatível com o padrão C++17.

### 1. Clonar o Repositório

Clona apenas a pasta específica deste projeto.

```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto5" >> .git/info/sparse-checkout
git pull origin main
```

---

### 2. Compilar o Projeto

Utilizando o Makefile disponibilizado:

```bash
make
```

O executável será gerado automaticamente na pasta:

```text
bin/
```

---

### 3. Executar o Programa

#### Soma

```bash
./bin/complexo + 1 2 3 4
```

Saída:

```text
4+6i
```

---

#### Subtração

```bash
./bin/complexo - 1 2 3 4
```

Saída:

```text
-2-2i
```

---

#### Multiplicação

```bash
./bin/complexo '*' 1 2 3 4
```

Saída:

```text
-5+10i
```

---

#### Negação

```bash
./bin/complexo - 1 2
```

Saída:

```text
-1-2i
```

---

#### Módulo

```bash
./bin/complexo '!' 1 2
```

Saída:

```text
2.23607
```

---

## 🎯 Resultados Obtidos

Ao final deste laboratório foi possível consolidar conhecimentos importantes da linguagem C++, incluindo:

* Sobrecarga de operadores binários e unários.
* Sobrecarga do operador de inserção em fluxo (`<<`).
* Modelagem matemática através de classes.
* Encapsulamento e abstração de dados.
* Utilização de bibliotecas matemáticas da STL.
* Organização de projetos em múltiplos diretórios.
* Compilação automatizada utilizando Makefiles.

Esses conceitos são amplamente utilizados no desenvolvimento de bibliotecas, motores gráficos, sistemas científicos, aplicações financeiras e projetos de software que demandam estruturas matemáticas customizadas e interfaces intuitivas.