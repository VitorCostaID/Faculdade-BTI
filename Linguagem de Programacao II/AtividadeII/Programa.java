// O que é utilizado? 
// 

import java.util.Scanner;

public class MeuPrograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação dos vetores/matriz
        // Cabeçalho
        String[] cabecalho = new String [12];
        cabecalho[0] = "Janeiro";
        cabecalho[1] = "Fevereiro";
        cabecalho[2] = "Março";
        cabecalho[3] = "Abril";
        cabecalho[4] = "Maio";
        cabecalho[5] = "Junho";
        cabecalho[6] = "Julho";
        cabecalho[7] = "Agosto";
        cabecalho[8] = "Setembro";
        cabecalho[9] = "Outubro";
        cabecalho[10] = "Novembro";
        cabecalho[11] = "Dezembro";

        String[] vendedor = new String [4];
        int[][] tabela_vendas = new int [11][1];
        int[] soma = new int [11];
        String maior = " ";
        int pos = -1;

        // Looping de inserção de valores 

        System.out.print("Digite o valor das vendas por mês");
        for (int i = 0; i < 11; i++){

            System.out.print("Digite o nome do vendedor");
            vendedor[i] = scanner.nextLine();
            System.out.print("Digite a venda de:");
            System.out.print(cabecalho[i]);

            for (int j = 0; j < 4; j++){
                tabela_vendas[i][j] = scanner.nextLine();
                soma[i] += tabela_vendas[i][j];
            }
        }


        // Mostrar valores para o usuário
        System.out.print("Soma de valores: ");
        for (int i = 1; i <= 12; i++){
            System.out.print(vendedor[i] + ", " + cabecalho[i] +  ": " + soma[i]);
        }

        // Mostrar vendedor com mais vendas
        System.out.print("O vendedor com mais vendas é: " + vendedor[pos] + ", com Saldo de: " + soma[pos]);

    }
}
