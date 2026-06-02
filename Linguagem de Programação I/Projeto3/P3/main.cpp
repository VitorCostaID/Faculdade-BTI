#include <iostream>
#include "seprimo.h"

int main()
{   
    int numero = -1;

    std::cout << "Entre com um número inteiro positivo: ";
    std::cin >> numero;

    std::cout << "O número " << numero << (sePrimo(numero) == true ? " é primo\n" : " não é primo\n");

    return 0;
}