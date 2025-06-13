#include <stdio.h>
#include <stdlib.h>
#include "fila_array.h"

int main(void)
{
  Fila fila;

  inicializar_fila(&fila);
  inserir_fila(&fila, 0);
  exibir_fila(&fila);

  remover_fila(&fila);
  inserir_fila(&fila, 10);
  inserir_fila(&fila, 50);
  exibir_fila(&fila);

  inserir_fila(&fila, 100);
  inserir_fila(&fila, 7);
  inserir_fila(&fila, 14500);
  exibir_fila(&fila);

  remover_fila(&fila);
  exibir_fila(&fila);

  for(int i = 0; i < 3; i++){
    remover_fila(&fila);
  }

  exibir_fila(&fila);

  return 0;
}

