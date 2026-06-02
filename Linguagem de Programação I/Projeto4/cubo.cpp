#include "cubo.h"
#include <cmath>

void Cubo::setCubo(double aresta){
    m_aresta = aresta;
}

double Cubo::getAresta(){
    return m_aresta;
}

double Cubo::area() {
    return 6 * pow(m_aresta, 2);
}

double Cubo::volume() {
    return pow(m_aresta, 3);
}

int Cubo::total = 0;

Cubo::Cubo(double aresta)
    : m_aresta(aresta)
{
    total++;
}

int Cubo::getTotal(){
    return total;
}