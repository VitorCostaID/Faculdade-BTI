import java.util.Scanner;
import java.util.ArrayList;

// Utilizei o código da atividade anterior para complementar.

class Quarto {
    // Atributos de pessoa
    protected String nome;
    private static int totalPessoas = 0;

    // Construtor de Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
        totalPessoas++;
    }

    // Métodos de Pessoa
    public String apresentar() {
        return this.nome;
    }

    // Método estático para retornar o total de pessoas
    public static int getTotalPessoas() {
        return totalPessoas;
    }
}

class QuartoEconomico extends Quarto {

}

public class Hotel {
    public static void main(String[] args) {
    }
}