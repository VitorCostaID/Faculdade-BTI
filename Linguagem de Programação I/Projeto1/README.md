# 🚀 Projeto 01: Preparação de Ambiente e Fundamentos de C++

<p align="center">
  <img src="https://img.shields.io/badge/C++-17-blue.svg?style=for-the-badge&logo=c%2B%2B" alt="C++17">
  <img src="https://img.shields.io/badge/Status-Concluído-success.svg?style=for-the-badge" alt="Status Concluído">
</p>

## 📝 Sobre o Projeto

Este repositório contém o desenvolvimento do primeiro laboratório prático da disciplina de Linguagem de Programação 1. O objetivo principal foi a ambientação com o ecossistema de desenvolvimento em nuvem utilizando **GitHub Classroom** e **GitHub Codespaces**, além de dar os primeiros passos com a linguagem **C++**, compreendendo a manipulação de tipos de dados primitivos, controle de fluxo e formatação de dados de entrada e saída ($I/O$).

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem de Programação:** C++ (Padrão ISO C++17)
* **Compilador:** `g++` (GNU Compiler Collection)
* **Ambiente de Desenvolvimento (IDE):** GitHub Codespaces (Ambiente virtual baseado em VS Code)
* **Controle de Versão:** Git & GitHub

---

## 📚 Conceitos Aprendidos

### 🔬 Sistema de Tipagem no C++
O C++ é uma linguagem **fortemente e estaticamente tipada**, o que exige que cada variável tenha seu tipo explicitado no momento da declaração. Durante este laboratório, foram revisados e aplicados os seguintes tipos primitivos:

* `int`: Armazenamento de números inteiros.
* `char`: Armazenamento de caracteres individuais (codificação ASCII).
* `double`: Números de ponto flutuante com dupla precisão.
* `float`: Números de ponto flutuante de precisão simples.
* `bool`: Valores lógicos booleanos (`true` ou `false`).

---

## 💻 Projetos Desenvolvidos

### 🧮 2. Média Aritmética (`media.cpp`)
**Descrição:** Desenvolvimento de um programa para capturar três notas inteiras fornecidas pelo usuário, calcular a média aritmética e formatar a saída com precisão de duas casas decimais.

* **Arquivo:** `media.cpp`

---

### 📊 2. Controle de Fluxo e Porcentagem (`fluxo.cpp`)
**Descrição:** Aplicação que recebe dois números estruturando uma validação robusta: o primeiro valor deve ser obrigatoriamente menor ou igual ao segundo. Caso a regra seja violada, o programa repete a solicitação usando uma estrutura de repetição. Ao final, calcula o percentual representativo do primeiro valor em relação ao segundo.

* **Arquivo:** `fluxo.cpp`
* **Destaque Técnico:** Implementação de laço `while` para validação de entrada de dados e prevenção de erros de divisão por zero.

---

## 🚀 Como Executar o Projeto

Para compilar e rodar os códigos desenvolvidos neste laboratório, você precisará de um compilador que suporte o padrão C++17. Siga os passos abaixo no terminal:

### 1. Clonar o Repositório
Clona apenas a pasta específica deste projeto
```bash
git remote add -f origin https://github.com/VitorCostaID/Faculdade-BTI.git
git config core.sparseCheckout true
echo "Linguagem de Programacao II/Projeto1" >> .git/info/sparse-checkout
git pull origin main
```

### 2. Compilar os Programas
Utilize as flags recomendadas para segurança (-Wall ativa alertas de boas práticas) e definição do padrão (-std=c++17).

Compilar a média
```
g++ -Wall -std=c++17 -o media media.cpp
```

Compilar o fluxo
```
g++ -Wall -std=c++17 -o fluxo fluxo.cpp
```

### 3. Executar as Aplicações

Rodando a média
```
./media
```
Rodando o fluxo
```
./fluxo
```