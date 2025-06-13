main: main.o pilha.o
	gcc -Wall -g -o main main.o pilha.o

main.o: main.c pilha.h
	gcc -Wall -g -c main.c

pilha.o: pilha.c pilha.h
	gcc -Wall -g -c pilha.c

clean:
	rm -f main *.o