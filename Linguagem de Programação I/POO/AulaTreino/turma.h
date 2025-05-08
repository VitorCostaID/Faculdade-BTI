#ifndef TURMA_H
#define TURMA_H

#include <string>

using namespace std;

class Aluno {
    private:
        string m_nome;
        string m_nascimento;
        string m_curso;
        int m_matricula;
        int m_IRA;

    public:
        Aluno(string nome, string nascimento, string curso, int matricula, int ira);
    
        void setNome(string nome);
        void setNascimento(string nascimento);
        void setCurso(string curso);
        void setMatricula(int matricula);
        void setIRA(int ira);

        string getNome();
        string getNascimento();
        string getCurso();
        int getMatricula();
        int getIRA();

};

#endif