public abstract class Material{
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

