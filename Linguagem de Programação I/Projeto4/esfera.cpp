#include "esfera.h"
#include <cmath>


void Esfera::setEsfera(double raio){
    m_raio = raio;
}

double Esfera::getRaio(){
    return m_raio;
}

double Esfera::area(){
    return 4 * M_PI * pow(m_raio, 2);
}

double Esfera::volume(){
    return (4/3) * M_PI * pow(m_raio, 3);
}

int Esfera::total = 0;

Esfera::Esfera(double raio)
    : m_raio(raio)
{
    total++;
}

int Esfera::getTotal(){
    return total;
}