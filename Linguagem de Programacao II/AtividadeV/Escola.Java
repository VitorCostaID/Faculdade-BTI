import java.util.Scanner;
import java.util.ArrayList;

class Pessoa{
    // Atributos de pessoa
    protected String nome;
    private static int totalPessoas;

    // Construtor de Pessoa
    public Pessoa(String pessoa){
        this.nome = nome;
        totalPessoas++;
    }

    // Métodos de Pessoa
    public Apresentar(){
        this.nome
    }
}

class Aluno extends Pessoa {
    // Atributos da classe
    private String matricula;
    private double nota1;
    private double nota2;
    private double media;
    private static int totalAlunos = 0;

    // Construtor para inicializar o objeto Aluno
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        super(nome);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calcularMedia();
        totalAlunos++;
    }

    public Apresetar(){
        System.out.println("Nome: " + super.apresentar());
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Média: " + this.media);
    }

    // Atualizar a primeira nota
    public void setNota1(double nota1) {
        this.nota1 = nota1;
        calcularMedia(); 
    }

    // Atualizar a segunda nota
    public void setNota2(double nota2) {
        this.nota2 = nota2;
        calcularMedia(); 
    }

    // Calcular a média 
    private void calcularMedia() {
        this.media = (this.nota1 + this.nota2) / 2;
    }

    // Verificar se o aluno está aprovado
    public boolean estaAprovado() {
        return this.media >= 6.0;
    }
    
    // Exibir informações
    public void exibirInfo() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Média: " + this.media);
        System.out.println("Status: " + (estaAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println("--------------------");
    }

    // Método estático para retornar o total de alunos
    public static int getTotalAlunos() {
        return totalAlunos;
    }
}

class Professor extends Pessoa{
    private String disciplina;
    private String id;
    private static int totalProfessores = 0;

    // Construtor para inicializar o objeto Professor
    public Professor(String nome, String disciplina, String id) {
        super(nome);
        this.disciplina = disciplina;
        this.id = id;
        totalProfessores++;
    }

    public Apresetar(){
        System.out.println("Nome: " + super.apresentar());
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Identificação: " + this.id);
    }
}

class Funcionario extends Pessoa{
    private String cargo;
    private String id;
    private static int totalFuncionario = 0;

    // Construtor de Funcionario
    public Funcionario(String nome, String cargo, String id) {
        super(nome);
        this.disciplina = disciplina;
        this.id = id;
        totalFuncionario++;
    }

    public Apresetar(){
        System.out.println("Nome: " + super.apresentar());
        System.out.println("Disciplina: " + this.cargo);
        System.out.println("Identificação: " + this.id);
    }
}

public class Escola {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("\n--- Criação de Alunos ---");
        String continuar;

        do {
            System.out.println("Digite os dados do novo aluno:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            Aluno novoAluno = new Aluno(nome, matricula, nota1, nota2);
            listaAlunos.add(novoAluno);

            System.out.println("Aluno cadastrado com sucesso!");
            System.out.print("Deseja cadastrar outro aluno? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n--- Exibindo todos os alunos ---");
        for (Aluno a : listaAlunos) {
            a.exibirInfo();
        }

        // Apresentação do total de alunos
        System.out.println("Total de alunos cadastrados: " + Aluno.getTotalAlunos());

        scanner.close();
    }
}