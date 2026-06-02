#ifndef VETOR2D_H
#define VETOR2D_H

class Vetor2D {
private:
    int x, y;

public:
    Vetor2D() : x(0), y(0) {}
    Vetor2D(int x, int y) : x(x), y(y) {}

    int getX() const { return x; }
    int getY() const { return y; }

    void setX(int x) { this->x = x; }
    void setY(int y) { this->y = y; }
};

#endif