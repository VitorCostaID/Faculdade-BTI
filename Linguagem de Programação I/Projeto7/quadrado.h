#ifndef QUADRADO_H
#define QUADRADO_H

#include "forma.h"
#include <iostream>

class Quadrado : public Forma {
private:
    int lado;

public:
    Quadrado() : lado(0) {}
    Quadrado(int lado, int centroX);

    double area() const override;
    double perimetro() const override;
    Vetor2D getCentro() const override;
    void desenhar() const override;

    friend std::ostream& operator<<(std::ostream& os, const Quadrado& q);
};

#endif