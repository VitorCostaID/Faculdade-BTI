#include <iostream>
#include "turma.h"

int main(){

    Aluno aluno1("Gustavo", "30/07/1994", "Bacharelado em Tecnologia da Informação", 20240031816, 7.2);

    cout << "O nome do primeiro aluno é: " << aluno1.getNome();

    return 0;
}