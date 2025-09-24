// O que esse código faz?
// Ele gera um valor mensal e total de vendas por vendedor
// O número de vendedores está fixo em 3, mas os meses estão variáveis até 12.

import java.util.Scanner;

public class AtividadeII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Array
        String[] vendedor = new String[3];
        
        // Meses utilizados
        String[] cabecalho = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        int num_meses = -1;

        System.out.print("Qual a quantidade de meses que quer inserir? ");
        num_meses = scanner.nextInt();
        scanner.nextLine();

        // 2. Matrizes
        // tabela_vendas[vendedor][n_meses]
        int[][] tabela_vendas = new int[3][num_meses];

        // Armazena as vendas por vendedor e qtd de meses variável
        int[] soma_vendas = new int[3];
        
        // --- Entrada do usuário --- (For)
        System.out.println("--- Inserção de Vendas Mensais ---");
        for (int i = 0; i < 3; i++) {
            System.out.print("\nDigite o nome do vendedor " + (i + 1) + ": ");
            vendedor[i] = scanner.nextLine();
            
            int mes = 0;
            // 3. While
            while (mes < num_meses) {
                System.out.print("Digite as vendas de " + cabecalho[mes] + " (ou -1 para parar): ");
                int venda = scanner.nextInt();

                // 4. Break
                if (venda == -1) {
                    System.out.println("Vendas para " + vendedor[i] + " interrompidas.");
                    break; 
                }
                
                // 5. Continue
                if (venda < 0) {
                    System.out.println("Valor inválido! Por favor, insira um valor positivo.");
                    continue; 
                }
                
                // Armazenar os valores na tabela
                tabela_vendas[i][mes] = venda;
                soma_vendas[i] += venda; // Adicionar ao total de vendas
                mes++;
            }
            scanner.nextLine(); // Para a quebra de linha
        }

        // --- Mostra os valores para o usuário ---
        System.out.println("\n--- Resumo de Vendas Anuais ---");
        System.out.print("Vendedor\t");
        for (int i = 0; i < num_meses; i++) {
            System.out.print(cabecalho[i] + "\t");
        }
        System.out.println("Total");

        // Mostra a tabela de vendas
        for (int i = 0; i < 3; i++) {
            System.out.print(vendedor[i] + "\t\t");
            for (int j = 0; j < num_meses; j++) {
                System.out.print(tabela_vendas[i][j] + "\t\t");
            }
            System.out.println(soma_vendas[i]);
        }

        // --- Encontrar o vendedor com mais vendas ---
        int maior_venda = -1;
        int vendedor_com_maior_venda_pos = -1;

        for (int i = 0; i < 3; i++) {
            if (soma_vendas[i] > maior_venda) {
                maior_venda = soma_vendas[i];
                vendedor_com_maior_venda_pos = i;
            }
        }

        // Saída final
        if (vendedor_com_maior_venda_pos != -1) {
            System.out.println("\n--- Destaque ---");
            System.out.println("O vendedor com mais vendas é: " + vendedor[vendedor_com_maior_venda_pos]);
            System.out.println("Com um total de vendas de: R$" + maior_venda);
        } else {
            System.out.println("\nNenhum dado de vendas foi inserido.");
        }
        
        scanner.close();
    }
}
