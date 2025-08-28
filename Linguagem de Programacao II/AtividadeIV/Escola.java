import java.util.Scanner;
import java.util.ArrayList;

class Aluno {
    // Atributos da classe
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double media;
    private static int totalAlunos = 0;

    // Construtor para inicializar o objeto Aluno
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calcularMedia();
        totalAlunos++;
    }

    // Atualizar a primeira nota
    public void setNota1(double nota1) {
        this.nota1 = nota1;
        calcularMedia(); // Recalcula a média após a mudança
    }

    // Atualizar a segunda nota
    public void setNota2(double nota2) {
        this.nota2 = nota2;
        calcularMedia(); // Recalcula a média após a mudança
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

    public String getNome() {
        return this.nome;
    }
}

public class Escola {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        int escolha = 0;

        // Validação de escolha
        while (escolha != 1 && escolha != 2) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Criação dinâmica.");
            System.out.println("2 - Criação manual (tarefa).");
            
            escolha = scanner.nextInt();
            scanner.nextLine();
        }

        if (escolha == 1) { // Criação dinâmica
            System.out.println("\n--- Modo de Criação Dinâmica ---");
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

        } else if (escolha == 2) { // Criação manual (tarefa)
            System.out.println("\n--- Modo de Criação Manual (Tarefa) ---");
            
            // Criação dos alunos
            Aluno aluno1 = new Aluno("Júlia", "0032862", 6.2, 8);
            listaAlunos.add(aluno1);

            Aluno aluno2 = new Aluno("Mario", "0036845", 4.0, 9.0);
            listaAlunos.add(aluno2);

            Aluno aluno3 = new Aluno("Caio", "0032862", 5.0, 7.0);
            listaAlunos.add(aluno3);

            // Atualização da nota de um aluno específico (Caio, que está na posição 2)
            System.out.println("Atualizando a nota 1 do aluno " + listaAlunos.get(2).getNome() + " de 5.0 para 8.0.");
            listaAlunos.get(2).setNota1(8.0);

            // Exibição das informações e status de aprovação
            System.out.println("\n--- Exibindo informações dos alunos ---");
            for (Aluno a : listaAlunos) {
                a.exibirInfo();
            }
            
            // Apresentação do total de alunos
            System.out.println("Total de alunos cadastrados: " + Aluno.getTotalAlunos());
        }

        scanner.close();
    }
}