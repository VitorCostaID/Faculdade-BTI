#include "retangulo.h"

double Retangulo::area() const {
    return largura * altura;
}

double Retangulo::perimetro() const {
    return 2 * (largura + altura);
}

Vetor2D Retangulo::getCentro() const {
    return Vetor2D(largura / 2, altura / 2);
}

void Retangulo::desenhar() const {
    for (int i = 0; i < altura; ++i) {
        for (int j = 0; j < largura; ++j) {
            if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1)
                std::cout << "* ";
            else
                std::cout << "  ";
        }
        std::cout << '\n';
    }
}

std::ostream& operator<<(std::ostream& os, const Retangulo& r) {
    os << "Retangulo com altura " << r.altura << " e largura " << r.largura;
    return os;
}