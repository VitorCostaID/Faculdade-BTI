#include "fila_array.h"

void inicializar_fila(Fila* fila)
{
  fila->tamanho = 0;
}


int fila_vazia(Fila* fila)
{
  return fila->tamanho == 0;
}


int fila_cheia(Fila* fila)
{
  return fila->tamanho == TAMANHO_MAX;
}


void inserir_fila(Fila* fila, int valor)
{
  if(fila_cheia(fila)){
    printf("A fila está cheia!");
  }else{
    fila->dados[fila->tamanho] = valor;
    fila->tamanho++;
  }
}


int remover_fila(Fila* fila)
{
  if(fila_vazia(fila)){
    printf("A fila está vazia!\n");
    return -1;
  }else{
    int valor = fila->dados[0];
 
    for(int i = 1; i < fila->tamanho; i++) {
      fila->dados[i - 1] = fila->dados[i];
    }
    fila->tamanho--;
    return valor;
  }
}


int consultar_primeiro(Fila* fila)
{
  if(fila_vazia(fila)){
    printf("A fila está vazia!\n");
    return -1;
  }else{
    return fila->dados[0];
  }
}


void exibir_fila(Fila* fila)
{
  if(fila_vazia(fila)){
    printf("A fila está vazia!\n");
  }else{
    for(int i = 0; i < fila->tamanho; i++){
      printf("%d ", fila->dados[i]);
    }
    printf("\n");
  }
}

