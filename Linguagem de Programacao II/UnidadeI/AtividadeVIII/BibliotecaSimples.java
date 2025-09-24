abstract class Material{
    protected String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public abstract int prazoDevolucaoDias();

    public String getTitulo(){
        return this.titulo;
    }
}

class Livro extends Material{
    public Livro(String titulo){
        super(titulo);
    }

    @Override
    public int prazoDevolucaoDias(){
        return 14;
    }
}


class Revista extends Material{
    public Revista(String titulo){
        super(titulo);
    }

    @Override
    public int prazoDevolucaoDias(){
        return 7;
    }
}


class DVD extends Material{
    public DVD(String titulo){
        super(titulo);
    }

    @Override
    public int prazoDevolucaoDias(){
        return 3;
    }
}

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