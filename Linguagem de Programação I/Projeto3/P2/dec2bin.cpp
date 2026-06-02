#include "dec2bin.h"

int dec2bin(int decimal) {

    if (decimal == 0){
        return 0;
    }
    else if (decimal == 1){
        return 1;
    }
    else {
        return (decimal % 2) + dec2bin(decimal / 2) * 10; 
    }
    
}