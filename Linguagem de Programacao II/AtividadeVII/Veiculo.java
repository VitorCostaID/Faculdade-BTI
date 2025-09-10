
class Motor {
    private String modelo;
    private int potencia;

    public Motor(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Rodas {
    private int tamanho;
    private String material;

    public Rodas(int tamanho, String material) {
        this.tamanho = tamanho;
        this.material = material;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getMaterial() {
        return material;
    }
}

class Direcao {
    private String tipo;

    public Direcao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Carro {
    private Motor motor;
    private Rodas rodas;
    private Direcao direcao;

    public Carro(Motor motor, Rodas rodas, Direcao direcao) {
        this.motor = motor;
        this.rodas = rodas;
        this.direcao = direcao;
    }

    public void mostrarConfiguracao() {
        System.out.println("Configuração do Carro:");
        System.out.println("Modelo do Motor: " + motor.getModelo() + " (" + motor.getPotencia() + " cv)");
        System.out.println("Tamanho das Rodas: " + rodas.getTamanho() + " polegadas (" + rodas.getMaterial() + ")");
        System.out.println("Tipo de Direção: " + direcao.getTipo());
        System.out.println("-------------------------");
    }
}

public class Veiculo {
    public static void main(String[] args) {
        Motor motor1 = new Motor("V8", 500);
        Rodas rodas1 = new Rodas(18, "Liga leve");
        Direcao direcao1 = new Direcao("Hidráulica");
        Carro carro1 = new Carro(motor1, rodas1, direcao1);

        Motor motor2 = new Motor("Turbo", 350);
        Rodas rodas2 = new Rodas(17, "Aço");
        Direcao direcao2 = new Direcao("Manual");
        Carro carro2 = new Carro(motor2, rodas2, direcao2);

        Motor motor3 = new Motor("Elétrico", 250);
        Rodas rodas3 = new Rodas(20, "Fibra de carbono");
        Direcao direcao3 = new Direcao("Hidráulica");
        Carro carro3 = new Carro(motor3, rodas3, direcao3);

        carro1.mostrarConfiguracao();
        carro2.mostrarConfiguracao();
        carro3.mostrarConfiguracao();
    }
}
