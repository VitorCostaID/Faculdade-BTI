// Altere as importações para funcionar corretamente com sua organização de código.
#include "quadrado.h"
#include "retangulo.h"
#include <iostream>

int main() {

    Quadrado quad(10, 10);
    std::cout << "Area: " << quad.area() << std::endl;
    std::cout << "Perimetro: " << quad.perimetro() << std::endl;
    std::cout << "Centro: (" << quad.getCentro().getX() << ", "<< quad.getCentro().getY() << ")" << std::endl;
    std::cout << std::endl;
    quad.desenhar();

    std::cout << std::endl;

    Retangulo ret(11, 5);
    std::cout << "Area: " << ret.area() << std::endl;
    std::cout << "Perimetro: " << ret.perimetro() << std::endl;
    std::cout << "Centro: (" << ret.getCentro().getX() << ", "<< ret.getCentro().getY() << ")" << std::endl;
    std::cout << std::endl;
    ret.desenhar();

    return 0;
}