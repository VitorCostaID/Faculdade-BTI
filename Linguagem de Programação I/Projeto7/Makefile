CXX = g++
CXXFLAGS = -Wall -std=c++11

OBJS = main.o quadrado.o retangulo.o

all: main

main: main.o quadrado.o retangulo.o
	g++ main.o quadrado.o retangulo.o -o main

main.o: main.cpp quadrado.h retangulo.h

quadrado.o: quadrado.cpp quadrado.h forma.h vetor2d.h desenhavel.h

retangulo.o: retangulo.cpp retangulo.h forma.h vetor2d.h desenhavel.h

clean:
	rm -f *.o main