#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"

void inicializar(Pilha* p) {
    p->topo = NULL;
}

void empilhar(Pilha* p, int valor) {
    No* novo = malloc(sizeof(No));
    if (!novo) {
        printf("Erro de alocação!\n");
        exit(1);
    }
    novo->valor = valor;
    novo->proximo = p->topo;
    p->topo = novo;
}

int desempilhar(Pilha* p) {
    if (esta_vazia(p)) {
        printf("Erro: pilha vazia!\n");
        return -1;
    }
    No* temp = p->topo;
    int valor = temp->valor;
    p->topo = temp->proximo;
    free(temp);
    return valor;
}

int esta_vazia(Pilha* p) {
    return p->topo == NULL;
}

int topo(Pilha* p) {
    if (esta_vazia(p)) {
        printf("Erro: pilha vazia!\n");
        return -1;
    }
    return p->topo->valor;
}

void liberar_pilha(Pilha* p) {
    while (!esta_vazia(p)) {
        desempilhar(p);
    }
}
