#include "vetor.h"
#include <iostream>
#include <algorithm>

void preencherNumeros(std::vector<int>& vetor) {
    int num = 0;
    std::cout << "Digite números inteiros (-1 para sair): ";
    while (true) {
        std::cin >> num;
        if (num == -1) break;
        vetor.push_back(num);
    }
}

void imprimirQuantidade(const std::vector<int>& vetor) {
    std::cout << "Quantidade de números: " << vetor.size() << std::endl;
}

void imprimirMedia(const std::vector<int>& vetor) {
    if (vetor.empty()) {
        std::cout << "Lista vazia.\n";
        return;
    }

    double soma = 0;
    for (int i = 0; i < vetor.size(); i++) {
        soma += vetor[i];
    }
    std::cout << "Média: " << (soma / vetor.size()) << std::endl;
}

void imprimirMaior(const std::vector<int>& vetor) {
    if (!vetor.empty())
        std::cout << "Maior valor: " << vetor.back() << std::endl;
}

void imprimirMenor(const std::vector<int>& vetor) {
    if (!vetor.empty())
        std::cout << "Menor valor: " << vetor.front() << std::endl;
}

void numerosOrdenados(const std::vector<int>& vetor) {
    std::cout << "Números ordenados:";
    for (int i = 0; i < vetor.size(); i++) {
        std::cout << " " << vetor[i];
    }
    std::cout << std::endl;
}

void verificarExistencia(const std::vector<int>& vetor, int x) {
    if (std::binary_search(vetor.begin(), vetor.end(), x))
        std::cout << "O número " << x << " está na lista.\n";
    else
        std::cout << "O número " << x << " não está na lista.\n";
}