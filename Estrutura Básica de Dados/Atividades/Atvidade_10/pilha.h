#ifndef PILHA_H
#define PILHA_H

#include <stdio.h>

#define TAM_MAX 100

typedef struct {
    int itens[TAM_MAX];
    int topo;
}Pilha;

void operacao(Pilha* p, int valor);

int esta_vazia(Pilha *p);

int leitura(Pilha *p);

int peek(Pilha *p);

#endif