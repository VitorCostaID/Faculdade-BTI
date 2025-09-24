import java.util.Scanner;

public class AtividadeI_P1 {

    public static void main(String[] args) {
       // 1. Entrada de dados
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite uma palavra que some mais de 150 pontos: ");

       // Entrada de uma palavra (4.String)
       String palavra = scanner.nextLine();
        int soma = 0;

       // Contagem de Valor (Percorrer cada letra (2.For + Switch))
       // A letra se traduz em um número (2.Conversão)
       // O número é acrescentado a uma variável "Total" (3.Operadores + 2.Variável + 5.Cálculos Matemáticos)
        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));

            switch (letra) {
                case 'a':
                    soma += 1;
                    break;
                case 'b':
                    soma += 2;
                    break;
                case 'c':
                    soma += 3;
                    break;
                case 'd':
                    soma += 4;
                    break;
                case 'e':
                    soma += 5;
                    break;
                case 'f':
                    soma += 6;
                    break;
                case 'g':
                    soma += 7;
                    break;
                case 'h':
                    soma += 8;
                    break;
                case 'i':
                    soma += 9;
                    break;
                case 'j':
                    soma += 10;
                    break;
                case 'k':
                    soma += 11;
                    break;
                case 'l':
                    soma += 12;
                    break;
                case 'm':
                    soma += 13;
                    break;
                case 'n':
                    soma += 14;
                    break;
                case 'o':
                    soma += 15;
                    break;
                case 'p':
                    soma += 16;
                    break;
                case 'q':
                    soma += 17;
                    break;
                case 'r':
                    soma += 18;
                    break;
                case 's':
                    soma += 19;
                    break;
                case 't':
                    soma += 20;
                    break;
                case 'u':
                    soma += 21;
                    break;
                case 'v':
                    soma += 22;
                    break;
                case 'w':
                    soma += 23;
                    break;
                case 'x':
                    soma += 24;
                    break;
                case 'y':
                    soma += 25;
                    break;
                case 'z':
                    soma += 26;
                    break;
                default:
                    // Se o caractere não for uma letra, ele será ignorado
                    // por exemplo, números, espaços, etc.
                    break;
            }
        }

       // Se o valor for maior que 300 (Um resultado, senão outro (6.If-else))
        if (soma >= 150){
            System.out.println("Sua palavra fez " + soma + " pontos. Passando no teste!");
        }
        else{
            System.out.println("Sua palavra fez " + soma + " pontos. Não passando no teste!");
        }


       scanner.close();

    }
};