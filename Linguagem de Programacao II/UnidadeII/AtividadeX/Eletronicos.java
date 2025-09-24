interface DispositivoEletronico {
    void ligar();
    void desligar();
    void status();
}

class Smartphone implements DispositivoEletronico {
    public String marca;
    public String modelo;
    public boolean status;

    // Construtor adicionado para inicializar os atributos
    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.status = false; // Valor inicial
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Smartphone " + this.marca + " " + this.modelo + " ...");
        status = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o Smartphone " + this.marca + " " + this.modelo + " ...");
        status = false;
    }

    @Override
    public void status() {
        String mensagem = (status) ? "Ligado." : "Desligado.";
        System.out.println("Status do Smartphone: " + mensagem);
    }
}

class SmartTV implements DispositivoEletronico {
    public String marca;
    public int tamanho;
    public boolean status;

    // Construtor adicionado para inicializar os atributos
    public SmartTV(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.status = false; // Valor inicial
    }

    @Override
    public void ligar() {
        System.out.println("Ligando a SmartTV " + this.marca + " " + this.tamanho + " polegadas ...");
        status = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a SmartTV " + this.marca + " " + this.tamanho + " polegadas ...");
        status = false;
    }

    @Override
    public void status() {
        String mensagem = (status) ? "Ligada." : "Desligada.";
        System.out.println("Status da SmartTV: " + mensagem);
    }
}

class ControleRemoto {

    public void controlarDispositivo(DispositivoEletronico dispositivo) {
        System.out.println("\n--- Controlando Dispositivo ---");
        dispositivo.ligar();
        dispositivo.status();
        dispositivo.desligar();
    }
}

public class Eletronicos {
    public static void main(String[] args) {
        // Cria os dispositivos
        Smartphone meuCelular = new Smartphone("Samsung", "Galaxy S21");
        SmartTV minhaTv = new SmartTV("LG", 55);

        // Cria o controle remoto
        ControleRemoto meuControle = new ControleRemoto();

        // Usa o controle para interagir com cada dispositivo
        meuControle.controlarDispositivo(meuCelular);
        
        System.out.println("\n--- Controlando SmartTV ---"); 
        meuControle.controlarDispositivo(minhaTv);
    }
}