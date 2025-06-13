#include <stdio.h>

int main(){
    int res; 
    scanf("%d", &res); 

    int max1 = 40;
    int min1 = 20;
    
    int s1 = 0;
    int t1 = 1;
    int t2, t3;

    t2 = (max1 < res) ? 1 : 0;
    t3 = (res < min1) ? 1 : 0;
    s1 = (t2 == t1 || t3 == t1) ? 0 : 1;

    printf("%d", s1);

    return 0;
}