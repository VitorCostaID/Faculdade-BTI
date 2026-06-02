#ifndef PAR_H
#define PAR_H

#include <iostream>
#include <string>
using namespace std;

template <class T>
class Par {
private:
    T primeiroValor;
    T segundoValor;

public:
    Par(T a, T b);
    void saida() const;
    char compararCom(const Par& outroPar) const;
    void mostrarComparacao(const Par& outroPar) const;
};

template <class T>
Par<T>::Par(T a, T b) {
    primeiroValor = a;
    segundoValor = b;
}

template <class T>
void Par<T>::saida() const {
    cout << "[" << primeiroValor << ", " << segundoValor << "]";
}

template <class T>
char Par<T>::compararCom(const Par<T>& outroPar) const {
    if (primeiroValor < outroPar.primeiroValor) return '<';
    if (primeiroValor > outroPar.primeiroValor) return '>';
    if (segundoValor < outroPar.segundoValor) return '<';
    if (segundoValor > outroPar.segundoValor) return '>';
    return '=';
}

template <class T>
void Par<T>::mostrarComparacao(const Par<T>& outroPar) const {
    this->saida();
    cout << " " << this->compararCom(outroPar) << " ";
    outroPar.saida();
    cout << endl;
}

#endif
