# 🚀 Projeto 03: Recursividade em C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do terceiro laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi compreender e aplicar o conceito de **recursividade** na linguagem C++, explorando a construção de funções capazes de resolver problemas através de chamadas sucessivas a si mesmas até alcançar um caso base.

Durante o laboratório, foram implementados algoritmos recursivos para resolução de problemas matemáticos clássicos, incluindo soma de dígitos, conversão de números decimais para binário e verificação de números primos.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Compilador:** `g++` (GNU Compiler Collection)
* **Sistema de Build:** Makefile
* **Ambiente de Desenvolvimento:** GitHub Codespaces / Visual Studio Code
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### 🔄 Recursividade

A recursividade é uma técnica de programação em que uma função chama a si mesma para resolver um problema menor da mesma natureza até atingir uma condição de parada, conhecida como **caso base**.

Uma implementação recursiva normalmente é composta por:

* **Caso Base:** condição que encerra as chamadas recursivas.
* **Passo Recursivo:** chamada da função utilizando uma versão reduzida do problema original.

A utilização dessa abordagem permite criar algoritmos mais elegantes para problemas que possuem estrutura naturalmente recursiva.

---

### 🧩 Divisão de Problemas

Os exercícios desenvolvidos demonstram como decompor um problema complexo em subproblemas menores:

* Separação de dígitos de um número utilizando divisão inteira e operador módulo.
* Conversão decimal-binária baseada em divisões sucessivas por 2.
* Verificação de primalidade através de testes recursivos de divisibilidade.

---

### ⚙️ Modularização

Além da implementação recursiva, foi reforçado o conceito de modularização de código através da separação entre:

* Arquivos de cabeçalho (`.h`)
* Arquivos de implementação (`.cpp`)
* Arquivos de compilação automatizada (`Makefile`)

Essa organização aumenta a manutenção e reutilização do código.

---

## 💻 Projetos Desenvolvidos

### 🔢 1. Soma dos Dígitos (`Parte-01`)

**Descrição:** Desenvolvimento de uma função recursiva capaz de calcular a soma dos dígitos de um número inteiro positivo.

Exemplo:

* 123 → 1 + 2 + 3 = 6
* 12345 → 1 + 2 + 3 + 4 + 5 = 15

**Arquivo Principal:** `P1/main.cpp`

**Destaque Técnico:** Utilização da divisão inteira (`n / 10`) para reduzir progressivamente o problema e do operador módulo (`n % 10`) para extrair o último dígito em cada chamada recursiva.

---

### 💻 2. Conversão Decimal para Binário (`Parte-02`)

**Descrição:** Implementação de um algoritmo recursivo para converter um número decimal em sua representação binária equivalente.

Exemplo:

* 7 → 111
* 10 → 1010

**Arquivos:**

* `P2/main.cpp`
* `P2/dec2bin.cpp`
* `P2/dec2bin.h`

**Destaque Técnico:** Aplicação do método clássico de conversão decimal-binária utilizando divisões sucessivas por 2 e reconstrução do resultado durante o retorno das chamadas recursivas.

---

### 🧮 3. Verificação de Número Primo (`Parte-03`)

**Descrição:** Desenvolvimento de uma função recursiva para determinar se um número inteiro positivo é primo.

Exemplo:

* 2 → Primo
* 4 → Não Primo
* 7 → Primo

**Arquivo Principal:** `P3/main.cpp`

**Destaque Técnico:** Implementação de testes recursivos de divisibilidade, reduzindo progressivamente os divisores candidatos até determinar se existe algum divisor além de 1 e do próprio número.

---

## 🚀 Como Executar o Projeto

Para compilar e executar os programas deste laboratório, é necessário possuir um compilador compatível com o padrão C++17.

### 1. Clonar o Repositório

Clona apenas a pasta específica deste projeto.

```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto3" >> .git/info/sparse-checkout
git pull origin main
```

---

### 2. Compilar os Programas

#### Parte 01

```bash
g++ -Wall -std=c++17 -o main main.cpp
```

#### Parte 02

Utilizando o Makefile fornecido:

```bash
make
```

#### Parte 03

Utilizando o Makefile desenvolvido para o projeto:

```bash
make
```

---

### 3. Executar as Aplicações

#### Parte 01

```bash
./main
```

#### Parte 02

```bash
./main
```

#### Parte 03

```bash
./main
```

---

## 🎯 Resultados Obtidos

Ao final deste laboratório foi possível consolidar os fundamentos da recursividade em C++, compreendendo:

* Construção de casos base e chamadas recursivas.
* Manipulação matemática de números utilizando divisão inteira e módulo.
* Conversão entre diferentes representações numéricas.
* Implementação de algoritmos matemáticos utilizando recursão.
* Organização e modularização de projetos em múltiplos arquivos.
* Utilização de Makefiles para automatizar o processo de compilação.

Esses conceitos servem como base para estruturas de dados mais avançadas, algoritmos de busca, árvores, grafos e diversos problemas clássicos da Ciência da Computação.