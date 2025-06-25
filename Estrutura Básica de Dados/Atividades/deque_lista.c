#include <stdio.h>
#include <stdlib.h>

/* Criação da struct p/ armazenar os nós;
    Com ligação para o próximo nó, como uma lista.
    Mas com a adição do nó anterior, como listas duplamente ligadas. */
typedef struct no{
  int dado;
  struct no *proximo;
  struct no *anterior;
}No;

// Definição do início e do final, assim como tamanho.

typedef struct{
  No *inicio;
  No *final;
  int tamanho;
}Deque;

// Inicialização 
void inicia_deque(Deque *d){
  d->inicio = NULL;
  d->final = NULL;
  d->tamanho = 0;
}

void insere_inicio(Deque *d, int valor){
  No *novo_no = (No *)malloc(sizeof(No));
  novo_no->dado = valor;
  novo_no->proximo = d->inicio;
  novo_no->anterior = NULL;
  
  if(d->inicio != NULL){
    d->inicio->anterior = novo_no;
  }
  
  d->inicio = novo_no;
  
  if(d->final == NULL){
    d->final = novo_no;
  }
  
  d->tamanho++;
}

void insere_final(Deque *d, int valor){
  No *novo_no = (No *)malloc(sizeof(No));
  novo_no->dado = valor;
  novo_no->proximo = NULL;
  novo_no->anterior = d->final;
    
  if(d->final != NULL){
    d->final->proximo = novo_no;
  }
  
  d->final = novo_no;
  
  if(d->inicio == NULL){
    d->inicio = novo_no;
  }
  
  d->tamanho++;
}

int remove_inicio(Deque *d){
  if(d->inicio == NULL){
    printf("Deque vazio!\n");
    return -1;
  }
  
  No *temp = d->inicio;
  int valor = temp->dado;
  d->inicio = d->inicio->proximo;
  
  if(d->inicio == NULL){
    d->final = NULL;
  }else{
    d->inicio->anterior = NULL;
  }
  
  free(temp);
  
  d->tamanho--;
  
  return valor;
}

int remove_final(Deque *d){
  if(d->final == NULL){
    printf("Deque vazio!\n");
    return -1;
  }
  
  No *temp = d->final;
  int valor = temp->dado;
  
  d->final = d->final->anterior;
    
  if(d->final == NULL){
    d->inicio = NULL;
  }else{
    d->final->proximo = NULL;
  }
  
  free(temp);
    
  d->tamanho--;
    
  return valor;
}

int pega_inicio(Deque *d){
  if(d->inicio == NULL){
    printf("Deque vazio!\n");
    return -1;
  }
  
  return d->inicio->dado;
}

int pega_final(Deque *d){
  if(d->final == NULL){
    printf("Deque vazio!\n");
    return -1;
  }
    
  return d->final->dado;
}

int esta_vazio(Deque *d){
  return d->tamanho == 0;
}

void imprime(Deque *d){
  if(esta_vazio(d)){
    printf("Deque vazio!\n");
    return;
  }
  
  No *aux = d->inicio;
  
  printf("Deque: ");
  while(aux != NULL){
    printf("%d ", aux->dado);
    aux = aux->proximo;
  }
  
  printf("\n");
}

int main()
{


  Deque d;
    
  inicia_deque(&d);
  insere_final(&d, 17);
  insere_final(&d, 100);
  insere_final(&d, 8);
  insere_inicio(&d, 104);
  insere_inicio(&d, 14);
  insere_final(&d, 21);
  insere_final(&d, 57);
  remove_inicio(&d);
  remove_inicio(&d);
  remove_inicio(&d);
  imprime(&d);

  insere_inicio(&d, 500);
  insere_final(&d, 411);
  insere_final(&d, 800);
  insere_inicio(&d, 177);
  remove_final(&d);
  imprime(&d);
  
  remove_inicio(&d);
  remove_inicio(&d);
  remove_inicio(&d);
  insere_inicio(&d, 79);
  insere_final(&d, 300);

  imprime(&d);

  return 0;
}
