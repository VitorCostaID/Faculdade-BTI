import java.util.Scanner;

class Livros{
    // Atributos
    private String titulo;
    private Double preco;
    private int ano;
        
    // Definir o preço
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void exibirInfo(){
        System.out.println("Título da obra: " + titulo);
        System.out.println("Preço do livro: " + preco);
        System.out.println("Ano de lançamento: " + ano);
    }
}

public class Livraria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instanciando com o construtor padrão
        Livraria livro = new Livro("Ceifador", 48.50, 2016);

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.println("Digite preço do livro: ");
        Double preco = scanner.nextDouble();
        System.out.println("Digite o ano do livro: ");
        int ano = scanner.nextInt();
    }
}
    