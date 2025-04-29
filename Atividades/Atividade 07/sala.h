#ifndef SALA_H_
#define SALA_H_

#include <stdbool.h>
#include <stdio.h>
#define MAX 100 // Tamanho máximo da lista

typedef struct {
    int matricula;
    char nome[50];
    float nota;
} Aluno;

typedef struct {
    Aluno dados[MAX];
    int num_elem;
} Lista;

// Funções
void inicializa_lista(Lista *l);
int tamanho(Lista *l);
int busca(Lista *l, int matricula);
void exibe_lista(Lista *l);
bool insere(Lista *l, Aluno d, int pos);
bool remove_aluno(int matricula, Lista *l);
void reinicializa_lista(Lista *l);

#endif