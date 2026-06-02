# 🚀 Projeto 07: Herança, Classes Abstratas e Interfaces em C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do sétimo laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi aprofundar os conceitos fundamentais da **Programação Orientada a Objetos (POO)** através da utilização de **herança**, **classes abstratas**, **interfaces** e **polimorfismo** em C++.

Durante o projeto foi desenvolvida uma hierarquia de classes para modelagem de formas geométricas bidimensionais, permitindo representar, calcular propriedades geométricas e desenhar objetos utilizando caracteres ASCII diretamente no terminal.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Compilador:** `g++` (GNU Compiler Collection)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Sistema de Build:** Makefile
* **Ambiente de Desenvolvimento:** GitHub Codespaces / Visual Studio Code
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### 🧬 Herança

A herança é um dos pilares da Programação Orientada a Objetos, permitindo que classes derivadas reutilizem atributos e comportamentos definidos em classes base.

Neste laboratório, as classes `Quadrado` e `Retangulo` foram construídas a partir da classe abstrata `Forma`, herdando sua interface comum e especializando seus comportamentos.

---

### 🎭 Polimorfismo

O polimorfismo permite que diferentes tipos de objetos sejam manipulados através de uma interface comum.

Por meio de métodos virtuais, uma referência para `Forma` pode apontar para diferentes tipos concretos, executando automaticamente a implementação correta em tempo de execução.

Exemplo conceitual:

```cpp
Forma* forma = new Quadrado(10);
forma->desenhar();
```

Mesmo sendo tratada como uma `Forma`, a implementação utilizada será a de `Quadrado`.

---

### 🏗️ Classes Abstratas

Uma classe abstrata serve como modelo para outras classes, definindo comportamentos comuns que deverão ser implementados pelas classes derivadas.

Neste projeto, a classe `Forma` atua como uma abstração para diferentes figuras geométricas.

Ela define métodos genéricos como:

* `area()`
* `perimetro()`
* `getCentro()`

sendo este último declarado como método virtual puro.

---

### 🔌 Interfaces

Interfaces permitem definir contratos que devem ser obrigatoriamente implementados pelas classes que as herdam.

Foi criada a interface:

```cpp
class Desenhavel
```

responsável por exigir a implementação do método:

```cpp
virtual void desenhar() const = 0;
```

garantindo que toda forma geométrica possa ser representada visualmente.

---

### 📍 Composição de Objetos

O projeto também utilizou composição através da classe `Vetor2D`, responsável por representar coordenadas no plano cartesiano.

Essa estrutura foi utilizada para determinar o centro geométrico das formas implementadas.

---

## 💻 Partes Desenvolvidas

### 📍 1. Classe Vetor2D

**Descrição:** Implementação de uma estrutura responsável por representar posições em um plano bidimensional.

**Classe:** `Vetor2D`

**Atributos Privados:**

* `int x`
* `int y`

**Métodos Implementados:**

* Construtor padrão
* Construtor parametrizado
* Getters e Setters

**Destaque Técnico:** Encapsulamento das coordenadas cartesianas e reutilização da classe como componente de outras estruturas geométricas.

---

### 🔌 2. Interface Desenhavel

**Descrição:** Criação de uma interface responsável por definir o comportamento de desenho das formas geométricas.

**Método Declarado:**

```cpp
virtual void desenhar() const = 0;
```

**Destaque Técnico:** Aplicação do conceito de contrato de implementação através de métodos puramente virtuais.

---

### 🏗️ 3. Classe Abstrata Forma

**Descrição:** Desenvolvimento de uma classe base abstrata para representar características comuns entre diferentes figuras geométricas.

**Métodos Implementados:**

```cpp
virtual double area() const;
virtual double perimetro() const;
virtual Vetor2D getCentro() const = 0;
```

**Destaque Técnico:** Utilização combinada de métodos virtuais convencionais e métodos virtuais puros para definir uma hierarquia flexível e extensível.

---

### ⬜ 4. Classe Quadrado

**Descrição:** Implementação de uma forma geométrica quadrada derivada da classe `Forma`.

**Atributos Privados:**

* `int lado`

**Métodos Implementados:**

* `area()`
* `perimetro()`
* `getCentro()`
* `desenhar()`

**Fórmulas Aplicadas:**

Área:

A=l^2

Perímetro:

P=4l

**Destaque Técnico:** Implementação completa dos métodos herdados para permitir a instanciação de objetos concretos.

---

### ▭ 5. Classe Retangulo

**Descrição:** Implementação de uma forma geométrica retangular derivada da classe `Forma`.

**Atributos Privados:**

* `int largura`
* `int altura`

**Métodos Implementados:**

* `area()`
* `perimetro()`
* `getCentro()`
* `desenhar()`

**Fórmulas Aplicadas:**

Área:

A=b\times h

Perímetro:

P=2(b+h)

**Destaque Técnico:** Aplicação de herança e polimorfismo para reutilização da estrutura definida pela classe base.

---

### 🎨 6. Representação Gráfica em ASCII

**Descrição:** Implementação do método `desenhar()` para exibir formas geométricas diretamente no terminal utilizando caracteres ASCII.

Exemplo simplificado de saída:

```text
* * * * *
*       *
*       *
* * * * *
```

**Destaque Técnico:** Conversão das propriedades geométricas em representações visuais textuais, permitindo visualização da forma sem utilização de bibliotecas gráficas.

---

## 🧠 Estrutura do Projeto

Uma possível organização do projeto é:

```text
Projeto07/
│
├── include/
│   ├── Vetor2D.h
│   ├── Desenhavel.h
│   ├── Forma.h
│   ├── Quadrado.h
│   └── Retangulo.h
│
├── src/
│   ├── Vetor2D.cpp
│   ├── Forma.cpp
│   ├── Quadrado.cpp
│   └── Retangulo.cpp
│
├── main.cpp
├── Makefile
│
└── main
```

Essa organização facilita a manutenção, modularização e expansão da hierarquia de classes.

---

## 🚀 Como Executar o Projeto

Para compilar e executar o programa, é necessário possuir um compilador compatível com o padrão C++17.

### 1. Clonar o Repositório

Clona apenas a pasta específica deste projeto.

```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto7" >> .git/info/sparse-checkout
git pull origin main
```

---

### 2. Compilar o Projeto

Utilizando o Makefile desenvolvido para o laboratório:

```bash
make
```

---

### 3. Executar o Programa

```bash
./main
```

---

## ⭐ Funcionalidades Extras Implementadas

### Sobrecarga do Operador de Saída

Foi implementada a sobrecarga do operador `<<` para facilitar a exibição de objetos das classes derivadas.

Exemplo:

```cpp
Retangulo ret(10, 5);
std::cout << ret << std::endl;
```

Saída possível:

```text
Retangulo com altura 10 e largura 5.
```

---

### Expansão da Hierarquia de Formas

Além das formas obrigatórias, a arquitetura criada permite a adição de novas figuras geométricas como:

* Triângulo
* Círculo
* Elipse
* Trapézio
* Polígonos regulares

sem necessidade de alterações na interface principal do sistema.

---

## 🎯 Resultados Obtidos

Ao final deste laboratório foi possível consolidar conceitos avançados de Programação Orientada a Objetos em C++, incluindo:

* Herança.
* Classes abstratas.
* Interfaces.
* Métodos virtuais.
* Métodos virtuais puros.
* Polimorfismo dinâmico.
* Sobrescrita de métodos.
* Composição de objetos.
* Modularização em múltiplos arquivos.
* Sobrecarga de operadores.

Esses conceitos são amplamente utilizados em motores gráficos, frameworks, bibliotecas de interface gráfica, sistemas CAD, jogos digitais e aplicações corporativas que demandam arquiteturas extensíveis e desacopladas.
