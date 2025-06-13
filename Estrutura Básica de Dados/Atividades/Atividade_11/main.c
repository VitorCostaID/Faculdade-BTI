#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

int main() {
    Pilha calculadora;
    inicializar(&calculadora);

    char entrada[20];

    printf("Digite números ou operadores (+, -, *, /). Digite 's' para sair:\n");

    while (1) {
        scanf("%s", entrada);

        if (strcmp(entrada, "s") == 0) {
            break;
        }

        if (strcmp(entrada, "+") == 0 || strcmp(entrada, "-") == 0 ||
            strcmp(entrada, "*") == 0 || strcmp(entrada, "/") == 0) {

            int b = desempilhar(&calculadora);
            int a = desempilhar(&calculadora);
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

            empilhar(&calculadora, resultado);
        } else {
            int num = atoi(entrada);
            empilhar(&calculadora, num);
        }

        printf("Valor atual: %d\n", topo(&calculadora));
    }

    printf("Resultado final: %d\n", topo(&calculadora));
    liberar_pilha(&calculadora);

    return 0;
}