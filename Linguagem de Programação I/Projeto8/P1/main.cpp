#include "vetor.h"
#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> listaNumeros;

    preencherNumeros(listaNumeros);

    std::sort(listaNumeros.begin(), listaNumeros.end());

    imprimirQuantidade(listaNumeros);
    imprimirMedia(listaNumeros);
    imprimirMenor(listaNumeros);
    imprimirMaior(listaNumeros);
    numerosOrdenados(listaNumeros);

    int valor;
    std::cout << "Digite um número para verificar se está na lista: ";
    std::cin >> valor;
    verificarExistencia(listaNumeros, valor);

    return 0;
}