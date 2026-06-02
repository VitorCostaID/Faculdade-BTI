#include "quadrado.h"

Quadrado::Quadrado(int lado, int centroX) : lado(lado) {
    centro.setX(centroX);
    centro.setY(0);
}

double Quadrado::area() const {
    return lado * lado;
}

double Quadrado::perimetro() const {
    return 4 * lado;
}

Vetor2D Quadrado::getCentro() const {
    return Vetor2D(lado / 2, lado / 2);
}

void Quadrado::desenhar() const {
    for (int i = 0; i < lado; ++i) {
        for (int j = 0; j < lado; ++j) {
            if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1)
                std::cout << "* ";
            else
                std::cout << "  ";
        }
        std::cout << '\n';
    }
}

std::ostream& operator<<(std::ostream& os, const Quadrado& q) {
    os << "Quadrado com lado " << q.lado;
    return os;
}