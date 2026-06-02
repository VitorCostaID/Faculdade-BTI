#include <iostream>
#include "dec2bin.h"

int main() {

    int dec;
    std::cout << "Entre com um número decimal: ";
    std::cin >> dec;

    int bin = dec2bin(dec);

    std::cout << "O número " << dec << " em binário é " << bin << std::endl;

    return 0;

}