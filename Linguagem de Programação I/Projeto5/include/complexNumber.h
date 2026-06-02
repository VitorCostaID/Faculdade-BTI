#ifndef COMPLEXNUMBER_H
#define COMPLEXNUMBER_H

#include <iostream>

using namespace std;

class ComplexNumber {
    private:
        double a;
        double b;

    public:
        ComplexNumber(double a, double b);  

        ComplexNumber operator+(const ComplexNumber& other) const;
        ComplexNumber operator-(const ComplexNumber& other) const;
        ComplexNumber operator*(const ComplexNumber& other) const;

        ComplexNumber operator-() const;
        ComplexNumber operator!() const;

        friend std::ostream& operator<<(std::ostream& os, const ComplexNumber& num);

};

#endif