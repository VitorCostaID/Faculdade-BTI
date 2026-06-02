#include "forma.h"
#include "vetor2d.h"

virtual int Forma::area() const{
    return 0.0;
}

virtual int perimetro() const{
    return 0.0;
}

virtual Vetor2D getCentro() const{
    return 0.0;
}

int Vector2D::getX() const { return x; }
int Vector2D::getY() const { return y; }

void Vector2D::setX(int x) { this->x = x; }
void Vector2D::setY(int y) { this->y = y; }