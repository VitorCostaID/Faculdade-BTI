#include "../include/complexNumber.h"
#include <cmath>
#include <iomanip>


ComplexNumber ComplexNumber::operator+(const ComplexNumber& other) const {
    return ComplexNumber(a + other.a, b + other.b);
}

ComplexNumber ComplexNumber::operator-(const ComplexNumber& other) const {
    return ComplexNumber(a - other.a, b - other.b);
}

ComplexNumber ComplexNumber::operator*(const ComplexNumber& other) const {
    double real = (a * other.a) - (b * other.b);
    double imaginario = (a * other.b) + (b * other.a);
    return ComplexNumber(real, imaginario);
}

ComplexNumber ComplexNumber::operator-() const {
    return ComplexNumber(-a, -b);
}

ComplexNumber ComplexNumber::operator!() const {
    return ComplexNumber(sqrt(pow(a, 2) + pow(b, 2)), 0.0);
}

std::ostream& operator<<(std::ostream& os, const ComplexNumber& num) {
    os << num.a;
    if (num.b != 0.0) {
        if (num.b > 0) {
            os << "+" << num.b << "i";
        } else {
            os << num.b << "i";
        }
    }
    return os;
}

ComplexNumber::ComplexNumber(double a, double b)
    : a(a), b(b)
{

}