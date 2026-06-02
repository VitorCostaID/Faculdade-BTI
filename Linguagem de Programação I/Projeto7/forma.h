#ifndef FORMA_H
#define FORMA_H

#include "vetor2d.h"
#include "desenhavel.h"

class Forma : public Desenhavel {
    protected:
        Vetor2D centro;
        
    public:
        virtual double area() const { return 0.0; }
        virtual double perimetro() const { return 0.0; }
        virtual Vetor2D getCentro() const = 0;

        virtual ~Forma() = default;
    };

#endif