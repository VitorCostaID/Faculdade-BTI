all: seprimo.o main.o
	g++ -Wall -pedantic -std=c++17 -o main seprimo.o main.o

main.o: main.cpp seprimo.h
	g++ -Wall -pedantic -std=c++17 -c main.cpp

seprimo.o: seprimo.cpp seprimo.h
	g++ -Wall -pedantic -std=c++17 -c seprimo.cpp

clean:
	rm -f main *.o