# 🚀 Projeto 04: Introdução à Orientação a Objetos em C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do quarto laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi introduzir os conceitos fundamentais da **Programação Orientada a Objetos (POO)** em C++, utilizando a modelagem de sólidos geométricos tridimensionais como estudo de caso.

Durante o projeto foram implementadas classes responsáveis por representar diferentes formas geométricas espaciais, aplicando conceitos de encapsulamento, modularização, atributos estáticos, construtores parametrizados e métodos de cálculo de área e volume.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Compilador:** `g++` (GNU Compiler Collection)
* **Bibliotecas:** `<cmath>`
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Ambiente de Desenvolvimento:** GitHub Codespaces / Visual Studio Code
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### 🏗️ Programação Orientada a Objetos

A Programação Orientada a Objetos é um paradigma baseado na organização do software em objetos que representam entidades do mundo real. Cada objeto encapsula dados e comportamentos relacionados ao seu domínio.

Durante este laboratório foram explorados conceitos fundamentais como:

* Classes e Objetos
* Encapsulamento
* Construtores Parametrizados
* Métodos Públicos
* Atributos Privados
* Métodos Getters e Setters
* Atributos Estáticos
* Modularização de Código

---

### 🔒 Encapsulamento

Os atributos das classes foram definidos como privados, garantindo que os dados internos das estruturas geométricas sejam acessados e modificados apenas por meio de métodos públicos controlados.

Essa prática aumenta a segurança, manutenção e reutilização do código.

---

### 📦 Modularização

Cada classe foi separada em:

* Arquivo de Cabeçalho (`.h`)
* Arquivo de Implementação (`.cpp`)

Essa organização segue padrões utilizados em projetos profissionais e facilita a manutenção do software conforme sua complexidade cresce.

---

### 📊 Membros Estáticos

Foi implementado um contador estático em cada classe para registrar a quantidade total de instâncias criadas ao longo da execução do programa.

Os atributos estáticos pertencem à classe e não aos objetos individuais, permitindo o compartilhamento de informações globais entre todas as instâncias.

---

## 💻 Partes Desenvolvidas

### 🧊 1. Classe Cubo

**Descrição:** Implementação da classe responsável por representar um cubo através do tamanho de sua aresta.

**Classe:** `Cubo`

**Atributos Privados:**

* `double aresta`
* Contador estático de instâncias

**Métodos Implementados:**

* Construtor parametrizado
* Getters e Setters
* `area()`
* `volume()`
* `getTotal()`

**Destaque Técnico:** Aplicação das fórmulas geométricas para cálculo da área superficial e volume do cubo utilizando operações matemáticas encapsuladas em métodos próprios.

---

### 🌐 2. Classe Esfera

**Descrição:** Modelagem de uma esfera utilizando o valor do raio como atributo principal.

**Classe:** `Esfera`

**Atributos Privados:**

* `double raio`
* Contador estático de instâncias

**Métodos Implementados:**

* Construtor parametrizado
* Getters e Setters
* `area()`
* `volume()`
* `getTotal()`

**Destaque Técnico:** Utilização da constante matemática π através da biblioteca `<cmath>` para cálculo preciso da área da superfície e do volume da esfera.

---

### 📦 3. Classe Paralelepípedo

**Descrição:** Implementação de uma estrutura orientada a objetos capaz de representar um paralelepípedo retangular.

**Classe:** `Paralelepipedo`

**Atributos Privados:**

* `double aresta1`
* `double aresta2`
* `double aresta3`
* Contador estático de instâncias

**Métodos Implementados:**

* Construtor parametrizado
* Getters e Setters
* `area()`
* `volume()`
* `getTotal()`

**Destaque Técnico:** Cálculo da área total a partir da soma das áreas de todas as faces e cálculo do volume por meio da multiplicação das três dimensões da figura.

---

## 🧠 Estrutura do Projeto

O projeto foi organizado utilizando modularização externa, separando cada classe em arquivos independentes:

```text
Projeto04/
│
├── Cubo.h
├── Cubo.cpp
│
├── Esfera.h
├── Esfera.cpp
│
├── Paralelepipedo.h
├── Paralelepipedo.cpp
│
├── main.cpp
└── Makefile
```

Essa estrutura facilita a manutenção, expansão e reutilização dos componentes desenvolvidos.

---

## 🚀 Como Executar o Projeto

Para compilar e executar os programas deste laboratório, é necessário possuir um compilador compatível com o padrão C++17.

### 1. Clonar o Repositório

Clona apenas a pasta específica deste projeto.

```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto4" >> .git/info/sparse-checkout
git pull origin main
```

---

### 2. Compilar o Projeto

Utilizando o Makefile disponibilizado:

```bash
make
```

Ou manualmente:

```bash
g++ -Wall -std=c++17 *.cpp -o main
```

---

### 3. Executar a Aplicação

```bash
./main
```

---

## 🎯 Resultados Obtidos

Ao final deste laboratório foi possível consolidar os conceitos iniciais de Programação Orientada a Objetos em C++, compreendendo:

* Criação e utilização de classes.
* Instanciação de objetos.
* Encapsulamento de dados.
* Uso de construtores parametrizados.
* Implementação de métodos de acesso (*getters* e *setters*).
* Utilização de atributos e métodos estáticos.
* Modularização através de arquivos de cabeçalho e implementação.
* Aplicação prática da POO para modelagem de entidades do mundo real.

Esses conhecimentos servem como base para tópicos mais avançados da orientação a objetos, incluindo herança, polimorfismo, abstração e padrões de projeto utilizados no desenvolvimento profissional de software.
