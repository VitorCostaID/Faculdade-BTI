# 🚀 Projeto 08: Containers da STL e Estruturas de Dados em C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/STL-Containers-orange.svg?style=for-the-badge" alt="STL">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do oitavo laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi explorar estruturas de dados fornecidas pela **Standard Template Library (STL)** do C++, utilizando containers amplamente empregados no desenvolvimento profissional de software.

Durante o projeto foram implementadas aplicações utilizando:

* `std::vector`
* `std::map`
* `std::stack`

Além disso, foram praticados conceitos importantes como leitura de arquivos, processamento de texto, ordenação de dados, busca em coleções e utilização de parâmetros posicionais pela linha de comando.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Bibliotecas STL:** `vector`, `map`, `stack`, `algorithm`, `fstream`, `sstream`
* **Compilador:** `g++` (GNU Compiler Collection)
* **Sistema de Build:** Makefile
* **Ambiente de Desenvolvimento:** GitHub Codespaces / Visual Studio Code
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### 📦 Standard Template Library (STL)

A STL é uma das bibliotecas mais importantes do C++, oferecendo estruturas de dados e algoritmos altamente otimizados e reutilizáveis.

Neste laboratório foram explorados três containers fundamentais:

* `std::vector`
* `std::map`
* `std::stack`

Cada um deles possui características específicas voltadas para diferentes cenários de utilização.

---

### 📋 Vetores Dinâmicos (`std::vector`)

O `std::vector` é um container dinâmico capaz de armazenar uma quantidade variável de elementos.

Principais vantagens:

* Crescimento automático de memória.
* Acesso rápido por índice.
* Integração com algoritmos da STL.
* Facilidade para percorrer coleções de dados.

Foi utilizado para armazenar e manipular listas de números fornecidas pelo usuário.

---

### 🗂️ Estruturas Associativas (`std::map`)

O `std::map` permite armazenar pares chave-valor de forma ordenada.

Características:

* Chaves únicas.
* Ordenação automática.
* Busca eficiente.
* Ideal para contagem e indexação de dados.

Foi utilizado para contabilizar a frequência de palavras em arquivos de texto.

---

### 📚 Pilhas (`std::stack`)

A pilha é uma estrutura de dados baseada no princípio:

**LIFO — Last In, First Out**

O último elemento inserido é o primeiro a ser removido.

Operações principais:

* `push()` — Inserção
* `pop()` — Remoção
* `top()` — Consulta do topo

Foi utilizada para implementar uma calculadora baseada em Notação Polonesa Reversa (RPN).

---

### 💻 Parâmetros de Linha de Comando

O laboratório também explorou a utilização de argumentos passados diretamente durante a execução dos programas.

Exemplo:

```bash
./programa arquivo.txt
```

Por meio dos parâmetros:

```cpp
int main(int argc, char* argv[])
```

foi possível receber arquivos e expressões matemáticas diretamente pela linha de comando.

---

## 💻 Partes Desenvolvidas

### 📊 Parte 1 — Estatísticas com `std::vector`

**Diretório:** `P1`

**Executável:** `estatistica`

**Descrição:**

Desenvolvimento de uma aplicação responsável por armazenar uma quantidade dinâmica de números inteiros positivos e calcular estatísticas básicas sobre os dados fornecidos pelo usuário.

**Funcionalidades Implementadas:**

* Leitura de números até valor de parada.
* Armazenamento utilizando `std::vector<int>`.
* Cálculo da quantidade de elementos.
* Cálculo da média aritmética.
* Identificação do menor valor.
* Identificação do maior valor.
* Ordenação crescente dos dados.
* Busca por valor específico.

**Destaque Técnico:** Utilização combinada de `std::vector` e algoritmos da STL como `sort()` e `find()` para processamento eficiente dos dados.

---

### 📝 Parte 2 — Frequência de Palavras com `std::map`

**Diretório:** `P2`

**Executável:** `frequencia`

**Descrição:**

Implementação de um sistema de análise textual capaz de contabilizar quantas vezes cada palavra aparece em um arquivo fornecido pelo usuário.

**Funcionalidades Implementadas:**

* Leitura de arquivos utilizando `ifstream`.
* Separação de palavras.
* Contagem automática de ocorrências.
* Armazenamento em estrutura associativa.
* Exibição ordenada alfabeticamente.

**Estrutura Utilizada:**

```cpp
std::map<std::string, int>
```

**Destaque Técnico:** Aproveitamento da ordenação automática do `std::map`, eliminando a necessidade de algoritmos extras de ordenação.

---

### 🧮 Parte 3 — Calculadora RPN com `std::stack`

**Diretório:** `P3`

**Executável:** `calculadora_rpn`

**Descrição:**

Desenvolvimento de uma calculadora baseada em Notação Polonesa Reversa (Reverse Polish Notation), utilizando uma pilha para processar expressões matemáticas.

Exemplo:

```text
3 4 + 2 *
```

Resultado:

```text
14
```

**Funcionalidades Implementadas:**

* Leitura da expressão pela linha de comando.
* Processamento utilizando `std::stack<double>`.
* Operações básicas:

  * Soma (`+`)
  * Subtração (`-`)
  * Multiplicação (`*`)
  * Divisão (`/`)
* Exibição do resultado final.

**Destaque Técnico:** Aplicação prática de estruturas LIFO para avaliação de expressões matemáticas sem necessidade de análise de precedência.

---

## 🧠 Estrutura do Projeto

```text
Projeto08/
│
├── P1/
│   ├── main.cpp
│   ├── Makefile
│   └── estatistica
│
├── P2/
│   ├── main.cpp
│   ├── Makefile
│   ├── frequencia
│   └── data/
│
├── P3/
│   ├── main.cpp
│   ├── Makefile
│   └── calculadora_rpn
│
└── README.md
```

A organização separa claramente cada problema abordado, facilitando manutenção e testes independentes.

---

## 🚀 Como Executar o Projeto

### 1. Clonar o Repositório

Clona apenas a pasta específica deste projeto.

```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto8" >> .git/info/sparse-checkout
git pull origin main
```

---

### 2. Compilar os Programas

#### Parte 1

```bash
cd P1
make
```

---

#### Parte 2

```bash
cd P2
make
```

---

#### Parte 3

```bash
cd P3
make
```

---

## ▶️ Exemplos de Execução

### Estatística

```bash
./estatistica
```

Entrada:

```text
5
8
3
10
-1
```

Saída:

```text
Quantidade de números: 4
Média: 6.5
Menor valor: 3
Maior valor: 10
Números ordenados: 3 5 8 10
```

---

### Frequência de Palavras

```bash
./frequencia data/entrada1.txt
```

Saída:

```text
cachorro: 3
gato: 2
passarinho: 1
```

---

### Calculadora RPN

```bash
./calculadora_rpn "3 4 + 2 *"
```

Saída:

```text
Resultado: 14
```

---

```bash
./calculadora_rpn "10 2 8 * + 3 -"
```

Saída:

```text
Resultado: 23
```

---

## 🎯 Resultados Obtidos

Ao final deste laboratório foi possível consolidar conhecimentos essenciais sobre a STL e estruturas de dados fundamentais em C++, incluindo:

* Utilização de containers da STL.
* Manipulação de vetores dinâmicos.
* Estruturas associativas chave-valor.
* Implementação de pilhas.
* Ordenação e busca de elementos.
* Processamento de arquivos texto.
* Leitura de parâmetros de linha de comando.
* Utilização de algoritmos prontos da STL.
* Organização modular de projetos utilizando Makefiles.

Esses conceitos são amplamente utilizados em sistemas de análise de dados, motores de busca, compiladores, aplicações financeiras, processamento de texto e praticamente qualquer software moderno desenvolvido em C++.