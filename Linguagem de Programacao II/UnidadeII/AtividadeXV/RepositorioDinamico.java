import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ======================
class Repositorio<T> {
    private List<T> dadosRepositorio = new ArrayList<>();

    public void adicionar(T elemento) {
        dadosRepositorio.add(elemento);
    }

    public T obterIndice(int indice) {
        if (indice >= 0 && indice < dadosRepositorio.size()) {
            return dadosRepositorio.get(indice);
        }
        return null;
    }

    public boolean removerPorIndice(int indice) {
        if (indice >= 0 && indice < dadosRepositorio.size()) {
            dadosRepositorio.remove(indice);
            return true;
        }
        return false;
    }

    public int tamanho() {
        return dadosRepositorio.size();
    }

    public void limpar() {
        dadosRepositorio.clear();
    }

    public void listar() {
        if (dadosRepositorio.isEmpty()) {
            System.out.println("Repositório vazio!");
        } else {
            for (int i = 0; i < dadosRepositorio.size(); i++) {
                System.out.println(i + " -> " + dadosRepositorio.get(i));
            }
        }
    }
}

// ======================
class Par<K, V> {
    private K chave;
    private V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Par{chave=" + chave + ", valor=" + valor + "}";
    }
}

// ======================
class Aluno {
    public String nome;
    public int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', matricula=" + matricula + "}";
    }
}

// ======================
class Produto {
    public String nome;
    public int codigo;

    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{nome='" + nome + "', codigo=" + codigo + "}";
    }
}

// ======================
class Util {
    public static <T> void imprimir(T obj) {
        System.out.println(obj);
    }
}

// ======================
class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Repositorio<Aluno> alunos = new Repositorio<>();
    private Repositorio<Produto> produtos = new Repositorio<>();

    public void iniciar() {
        int opcao;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1) Alunos - Adicionar");
            System.out.println("2) Alunos - Listar");
            System.out.println("3) Alunos - Obter por índice");
            System.out.println("4) Alunos - Remover por índice");
            System.out.println("5) Alunos - Limpar");
            System.out.println("--------------------------");
            System.out.println("6) Produtos - Adicionar");
            System.out.println("7) Produtos - Listar");
            System.out.println("8) Produtos - Obter por índice");
            System.out.println("9) Produtos - Remover por índice");
            System.out.println("10) Produtos - Limpar");
            System.out.println("--------------------------");
            System.out.println("11) Demonstração Par<K,V> e método genérico");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> adicionarAluno();
                case 2 -> alunos.listar();
                case 3 -> obterAlunoPorIndice();
                case 4 -> removerAluno();
                case 5 -> alunos.limpar();
                case 6 -> adicionarProduto();
                case 7 -> produtos.listar();
                case 8 -> obterProdutoPorIndice();
                case 9 -> removerProduto();
                case 10 -> produtos.limpar();
                case 11 -> demonstrarParEUtil();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void adicionarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        alunos.adicionar(new Aluno(nome, matricula));
    }

    private void obterAlunoPorIndice() {
        System.out.print("Índice: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        Aluno a = alunos.obterIndice(indice);
        if (a != null) Util.imprimir(a);
        else System.out.println("Índice inválido!");
    }

    private void removerAluno() {
        System.out.print("Índice para remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (alunos.removerPorIndice(indice))
            System.out.println("Aluno removido com sucesso!");
        else
            System.out.println("Índice inválido!");
    }

    private void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        produtos.adicionar(new Produto(nome, codigo));
    }

    private void obterProdutoPorIndice() {
        System.out.print("Índice: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        Produto p = produtos.obterIndice(indice);
        if (p != null) Util.imprimir(p);
        else System.out.println("Índice inválido!");
    }

    private void removerProduto() {
        System.out.print("Índice para remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (produtos.removerPorIndice(indice))
            System.out.println("Produto removido com sucesso!");
        else
            System.out.println("Índice inválido!");
    }

    private void demonstrarParEUtil() {
        Par<String, Integer> par = new Par<>("ChaveExemplo", 123);
        Util.imprimir(par);
    }
}

// ======================
public class RepositorioDinamico {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciar();
    }
}
