main: main.o turma.o
	g++ -Wall -g -o main main.o turma.o

main.o: main.cpp turma.h
	g++ -Wall -g -c main.cpp

turma.o: turma.cpp turma.h
	g++ -Wall -g -c turma.cpp

clean:
	rm -f main *.o