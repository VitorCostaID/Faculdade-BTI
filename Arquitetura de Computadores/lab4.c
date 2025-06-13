#include <stdio.h>

int a(int a){
    a += 1;
    return b(a);
}

int b(int b){
    b += 1;
    return c(b);
}

int c(int c){
    c += 1;
    return d(c);
}

int d(int d){
    d += 1;
    return e(d);
}

int e(int e){
    return e + 1;
}

int main(){
    int n1 = 10;
    int n2 = 20;

    n1 = a(n1);

    printf("%d", n1);

    return 0;
}


