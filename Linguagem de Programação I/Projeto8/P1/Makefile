programa: main.o vetor.o
	g++ main.o vetor.o -o programa

main.o: main.cpp vetor.h
	g++ -c main.cpp

vetor.o: vetor.cpp vetor.h
	g++ -c vetor.cpp

clean:
	rm -f *.o