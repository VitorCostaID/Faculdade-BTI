#include <iostream>

int main()
{
    float valor1 = 0, valor2 = 0, valor3 = 0;
    float media = 0;

    std::cout << "Entre com primeiro valor: ";
    std::cin >> valor1;
    std::cout << "Entre com segundo valor: ";
    std::cin >> valor2;
    std::cout << "Entre com terceiro valor: ";
    std::cin >> valor3;
    

    media = (valor1 + valor2 + valor3) / 3;

    std::cout << "Média: " << media;

    return 0;

}