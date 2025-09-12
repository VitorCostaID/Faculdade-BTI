
public class BibliotecaSimples {
    public static void main(String[] args) {
        // Criação dos objetos
        Material livro = new Livro("Java: Como Programar");
        Material revista = new Revista("Revista de Tecnologia");
        Material dvd = new DVD("Filme de Programação");

        // Impressão dos resultados
        System.out.println(livro.getTitulo() + " - Prazo: " + livro.prazoDevolucaoDias());
        System.out.println(revista.getTitulo() + " - Prazo: " + revista.prazoDevolucaoDias());
        System.out.println(dvd.getTitulo() + " - Prazo: " + dvd.prazoDevolucaoDias());
    }
}
