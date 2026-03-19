#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

int main() {
    Pilha calculadora;
    calculadora.topo = -1;

    char entrada[20];

    printf("Digite números ou operadores (+, -, *, /). Digite 's' para sair\n");

    while (1) {
        if (scanf("%s", entrada) == EOF || strcmp(entrada, "s") == 0) {
        break;}

        // Verifica se é um operador
        if (strcmp(entrada, "+") == 0 || strcmp(entrada, "-") == 0 ||
            strcmp(entrada, "*") == 0 || strcmp(entrada, "/") == 0) {
            
            int b = leitura(&calculadora);
            int a = leitura(&calculadora);
            int resultado = 0;

            if (strcmp(entrada, "+") == 0) resultado = a + b;
            else if (strcmp(entrada, "-") == 0) resultado = a - b;
            else if (strcmp(entrada, "*") == 0) resultado = a * b;
            else if (strcmp(entrada, "/") == 0) {
                if (b == 0) {
                    printf("Erro: divisão por zero\n");
                    continue;
                }
                resultado = a / b;
            }

            operacao(&calculadora, resultado);
        } else {
            // Tenta converter para número e empilha
            int num = atoi(entrada);
            operacao(&calculadora, num);
        }

        printf("Valor atual: %d\n", peek(&calculadora));
    }

    printf("Resultado final: %d\n", peek(&calculadora));

    return 0;
}