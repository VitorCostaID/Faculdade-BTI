all: fila_array.o funcoes.o
	gcc -o main fila_array.o funcoes.o

fila_array.o: fila_array.c fila_array.h
	gcc -c fila_array.c -Wall -pedantic

funcoes.o: funcoes.c fila_array.h
	gcc -c funcoes.c -Wall -pedantic

clean:
	rm -f *.o *~ main