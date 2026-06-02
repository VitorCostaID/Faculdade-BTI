#ifndef RETANGULO_H
#define RETANGULO_H

#include "forma.h"
#include <iostream>

class Retangulo : public Forma {
private:
    int largura, altura;

public:
    Retangulo() : largura(0), altura(0) {}
    Retangulo(int largura, int altura) : largura(largura), altura(altura) {}

    double area() const override;
    double perimetro() const override;
    Vetor2D getCentro() const override;
    void desenhar() const override;

    friend std::ostream& operator<<(std::ostream& os, const Retangulo& r);
};

#endif