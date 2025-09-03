import java.util.Scanner;
import java.util.ArrayList;

// Utilizei o código da atividade anterior para complementar.

class Pessoa {
    // Atributos de pessoa
    protected String nome;
    private static int totalPessoas = 0;

    // Construtor de Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
        totalPessoas++;
    }

    // Métodos de Pessoa
    public String apresentar() {
        return this.nome;
    }

    // Método estático para retornar o total de pessoas
    public static int getTotalPessoas() {
        return totalPessoas;
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

    @Override
    public String apresentar() {
        return "Nome: " + super.apresentar() + ", Matrícula: " + this.matricula;
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

class Professor extends Pessoa {
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

    @Override
    public String apresentar() {
        return "Nome: " + super.apresentar() + ", Disciplina: " + this.disciplina + ", Identificação: " + this.id;
    }

    // Método estático para retornar o total de professores
    public static int getTotalProfessores() {
        return totalProfessores;
    }
}

class Funcionario extends Pessoa {
    private String cargo;
    private String id;
    private static int totalFuncionario = 0;

    // Construtor de Funcionario
    public Funcionario(String nome, String cargo, String id) {
        super(nome);
        this.cargo = cargo;
        this.id = id;
        totalFuncionario++;
    }

    @Override
    public String apresentar() {
        return "Nome: " + super.apresentar() + ", Cargo: " + this.cargo + ", Identificação: " + this.id;
    }

    // Método estático para retornar o total de funcionários
    public static int getTotalFuncionario() {
        return totalFuncionario;
    }
}

public class Escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Professor> listaProfessores = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int escolha;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Cadastro de Alunos");
            System.out.println("2 - Cadastro de Professores");
            System.out.println("3 - Cadastro de Funcionários");
            System.out.println("4 - Visualizar Informações");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\n--- Modo de Criação de Alunos ---");
                    String continuarAluno;
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
                        continuarAluno = scanner.nextLine();
                    } while (continuarAluno.equalsIgnoreCase("s"));
                    break;

                case 2:
                    System.out.println("\n--- Modo de Criação de Professores ---");
                    String continuarProfessor;
                    do {
                        System.out.println("Digite os dados do novo professor:");
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Disciplina: ");
                        String disciplina = scanner.nextLine();
                        System.out.print("Identificação (ID): ");
                        String id = scanner.nextLine();

                        Professor novoProfessor = new Professor(nome, disciplina, id);
                        listaProfessores.add(novoProfessor);

                        System.out.println("Professor cadastrado com sucesso!");
                        System.out.print("Deseja cadastrar outro professor? (s/n): ");
                        continuarProfessor = scanner.nextLine();
                    } while (continuarProfessor.equalsIgnoreCase("s"));
                    break;

                case 3:
                    System.out.println("\n--- Modo de Criação de Funcionários ---");
                    String continuarFuncionario;
                    do {
                        System.out.println("Digite os dados do novo funcionário:");
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = scanner.nextLine();
                        System.out.print("Identificação (ID): ");
                        String id = scanner.nextLine();

                        Funcionario novoFuncionario = new Funcionario(nome, cargo, id);
                        listaFuncionarios.add(novoFuncionario);

                        System.out.println("Funcionário cadastrado com sucesso!");
                        System.out.print("Deseja cadastrar outro funcionário? (s/n): ");
                        continuarFuncionario = scanner.nextLine();
                    } while (continuarFuncionario.equalsIgnoreCase("s"));
                    break;

                case 4:
                    System.out.println("\n--- Visualizar Informações ---");
                    System.out.println("Total de Pessoas (Alunos + Professores + Funcionários): " + Pessoa.getTotalPessoas());
                    System.out.println("Total de alunos cadastrados: " + Aluno.getTotalAlunos());
                    System.out.println("Total de professores cadastrados: " + Professor.getTotalProfessores());
                    System.out.println("Total de funcionários cadastrados: " + Funcionario.getTotalFuncionario());
                    System.out.println("\n--- Lista de Alunos ---");
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : listaAlunos) {
                            a.exibirInfo();
                        }
                    }
                    System.out.println("\n--- Lista de Professores ---");
                    if (listaProfessores.isEmpty()) {
                        System.out.println("Nenhum professor cadastrado.");
                    } else {
                        for (Professor p : listaProfessores) {
                            System.out.println(p.apresentar());
                        }
                    }
                    System.out.println("\n--- Lista de Funcionários ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f.apresentar());
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}