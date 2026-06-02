#include "paralelepipedo.h"
#include <cmath>


double Paralelepipedo::getAresta1(){
    return m_aresta1;
}

double Paralelepipedo::getAresta2(){
    return m_aresta2;
}

double Paralelepipedo::getAresta3(){
    return m_aresta3;
}
        
double Paralelepipedo::area(){
    return (2 * m_aresta1 * m_aresta2) + (2 * m_aresta1 * m_aresta3) + (2 * m_aresta2 * m_aresta3);
}

double Paralelepipedo::volume(){
    return (m_aresta1 * m_aresta2 * m_aresta3);
}

int Paralelepipedo::total = 0;

Paralelepipedo::Paralelepipedo(double aresta1, double aresta2, double aresta3)
    : m_aresta1(aresta1), m_aresta2(aresta2), m_aresta3(aresta3)

{
    total++;
}

int Paralelepipedo::getTotal(){
    return total;
}