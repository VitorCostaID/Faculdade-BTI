#ifndef PILHA_H
#define PILHA_H

typedef struct No {
    int valor;
    struct No* proximo;
} No;

typedef struct {
    No* topo;
} Pilha;

void inicializar(Pilha* p);
void empilhar(Pilha* p, int valor);
int desempilhar(Pilha* p);
int esta_vazia(Pilha* p);
int topo(Pilha* p);
void liberar_pilha(Pilha* p);

#endif