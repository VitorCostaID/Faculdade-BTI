#ifndef VETOR_H
#define VETOR_H

#include <vector>

void preencherNumeros(std::vector<int>& vetor);
void imprimirQuantidade(const std::vector<int>& vetor);
void imprimirMedia(const std::vector<int>& vetor);
void imprimirMaior(const std::vector<int>& vetor);
void imprimirMenor(const std::vector<int>& vetor);
void numerosOrdenados(const std::vector<int>& vetor);
void verificarExistencia(const std::vector<int>& vetor, int x);

#endif