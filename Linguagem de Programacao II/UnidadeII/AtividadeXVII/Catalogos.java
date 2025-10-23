import java.util.ArrayList;
import java.util.List;

// ======================
class Catalogo<T> {
    private List<T> listaCatalogo = new ArrayList<>();

    public void adicionar(T item) {
        listaCatalogo.add(item);
    }

    public void listar() {
        System.out.println("=== Itens do Catálogo ===");
        for (T item : listaCatalogo) {
            System.out.println(item);
        }
    }

    public int tamanho() {
        return listaCatalogo.size();
    }

    // Método estático
    public static void exibirCatalogoGenerico(Catalogo<?> catalogo) {
        System.out.println("Exibindo catálogo genérico:");
        catalogo.listar();
        System.out.println("Total de itens: " + catalogo.tamanho());
        System.out.println("-----------------------------");
    }
}

// ======================
public class Catalogos {
    public static void main(String[] args) {
        // Catálogo de filmes (String)
        Catalogo<String> catalogoFilmes = new Catalogo<>();
        catalogoFilmes.adicionar("Interestelar");
        catalogoFilmes.adicionar("Matrix");
        catalogoFilmes.adicionar("O Poderoso Chefão");

        // Catálogo de códigos (Integer)
        Catalogo<Integer> catalogoCodigos = new Catalogo<>();
        catalogoCodigos.adicionar(101);
        catalogoCodigos.adicionar(202);
        catalogoCodigos.adicionar(303);

        // Exibindo normalmente
        System.out.println("Catálogo de Filmes:");
        catalogoFilmes.listar();
        System.out.println("Catálogo de Códigos:");
        catalogoCodigos.listar();

        // Exibindo via método genérico
        System.out.println("\n=== Exibindo via método genérico ===");
        Catalogo.exibirCatalogoGenerico(catalogoFilmes);
        Catalogo.exibirCatalogoGenerico(catalogoCodigos);
    }
}
