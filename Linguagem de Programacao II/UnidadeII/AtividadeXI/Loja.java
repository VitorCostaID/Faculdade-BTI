import java.util.ArrayList;
import java.util.List;

interface Produto {
    String getNome();
    double getPreco();
}

// -------------------------------------------------------------------

class Bebida implements Produto {
    String nome;
    double preco;
    boolean eAlcoolica;

    public Bebida(String nome, double preco, boolean eAlcoolica) {
        this.nome = nome;
        this.preco = preco;
        this.eAlcoolica = eAlcoolica;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}

// -------------------------------------------------------------------

class Lanche implements Produto {
    String nome;
    double preco;
    boolean eSalgado; // true para salgado, false para doce

    public Lanche(String nome, double preco, boolean eSalgado) {
        this.nome = nome;
        this.preco = preco;
        this.eSalgado = eSalgado;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}

// -------------------------------------------------------------------

class Higiene implements Produto {
    String nome;
    double preco;
    String tipo; // "Líquido" ou "Sólido"

    public Higiene(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}

// -------------------------------------------------------------------

class Carrinho {
    private List<Produto> listadeProdutos;

    // Construtor
    public Carrinho() {
        this.listadeProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        this.listadeProdutos.add(p);
    }

    public void listarProdutos() {
        if (this.listadeProdutos.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        System.out.println("\n--- Produtos no Carrinho ---");
        for (Produto p : this.listadeProdutos) {
            System.out.printf("- %s (R$ %.2f)\n", p.getNome(), p.getPreco());
        }
        System.out.println("----------------------------");
    }

    public double calcularTotal() {
        double sum = 0.0;
        for (Produto p : this.listadeProdutos) {
            sum += p.getPreco();
        }
        return sum;
    }
}

// -------------------------------------------------------------------

public class Loja {

    public static void main(String[] args) {
        // Instanciar produtos
        Lanche lanche = new Lanche("Chocolate Hershey's", 2.50, false); // Doce
        Higiene higiene = new Higiene("Água Sanitária Dragão", 7.00, "Líquido");
        Bebida bebida1 = new Bebida("Água Mineral", 3.00, false);
        Bebida bebida2 = new Bebida("Cerveja Heineken", 6.99, true);
        Lanche lancheGrande = new Lanche("Pote de Sorvete", 50.00, false);
        Higiene sabonete = new Higiene("Sabonete Lux", 2.99, "Sólido");

        // Adicionar ao Carrinho
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(lanche);
        carrinho.adicionarProduto(higiene);
        carrinho.adicionarProduto(bebida1);
        carrinho.adicionarProduto(bebida2);
        carrinho.adicionarProduto(lancheGrande);
        carrinho.adicionarProduto(lancheGrande);
        carrinho.adicionarProduto(sabonete); 

        // Exibir a lista de produtos comprados
        carrinho.listarProdutos();

        double totalOriginal = carrinho.calcularTotal();
        double totalFinal = totalOriginal;

        System.out.printf("Valor Total Bruto: R$ %.2f\n", totalOriginal);

        // Aplicar a regra de desconto.
        if (totalOriginal > 100.00) {
            double desconto = totalOriginal * 0.10;
            totalFinal = totalOriginal - desconto;
            System.out.printf("Desconto Aplicado (10%%): -R$ %.2f\n", desconto);
        }

        System.out.printf("Valor Total a Pagar: R$ %.2f\n", totalFinal);
    }
}