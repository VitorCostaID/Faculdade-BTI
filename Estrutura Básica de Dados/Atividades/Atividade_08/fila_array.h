#ifndef FILA_ARRAY_H
#define FILA_ARRAY_H

#include <stdio.h>
#include <stdlib.h>

#define TAMANHO_MAX 100

typedef struct {
    int dados[TAMANHO_MAX];
    int tamanho;
} Fila;

void inicializar_fila(Fila* fila);

int fila_vazia(Fila* fila);

int fila_cheia(Fila* fila);

void inserir_fila(Fila* fila, int valor);

int remover_fila(Fila* fila);

int consultar_primeiro(Fila* fila);

void exibir_fila(Fila* fila);

#endif