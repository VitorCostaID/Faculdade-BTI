#include <iostream>
#include "turma.h"

void Aluno::setNome(string nome){
    m_nome = nome;
}

void Aluno::setNascimento(string nascimento){
    m_nascimento = nascimento;
}

void Aluno::setCurso(string curso){
    m_curso = curso;
}
void Aluno::setMatricula(int matricula){
    m_matricula = matricula;
}
void Aluno::setIRA(int ira){
    m_IRA = ira;
}


string Aluno::getNome(){
    return m_nome;
}
string Aluno::getNascimento(){
    return m_nascimento;
}
string Aluno::getCurso(){
    return m_curso;
}
int Aluno::getMatricula(){
    return m_matricula;
}
int Aluno::getIRA(){
    return m_IRA;
}

Aluno::Aluno(string nome, string nascimento, string curso, int matricula, int ira)
    : m_nome(nome), m_nascimento(nascimento), m_curso(curso), m_matricula(matricula), m_IRA(ira)
{}