package TrabalhoIII;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeradorCSV {
    
    // Matriz de dados fixos (Tipo, Descrição, Urgência) conforme a tabela.
    private static final String[][] DADOS_CARGAS = {
        {"9", "Medicamentos", "3"},
        {"9", "Vacinas", "3"},
        {"9", "Equipamentos Médicos", "3"},
        {"9", "Peças Mecânicas", "3"},
        {"9", "Alimentos", "3"},
        {"5", "Eletrônicos", "2"},
        {"5", "Têxteis", "2"},
        {"5", "Eletrodomésticos", "2"},
        {"3", "Roupas", "1"},
        {"3", "Calçados", "1"}
    };
    
    // Nome do arquivo de saída
    private static final String NOME_ARQUIVO = "catalogo.csv";
    
    // Número de linhas a gerar
    private static final int NUMERO_LINHAS = 1000;
    
    public static void main(String[] args) {
        Random random = new Random();
        
        // Usa vírgula como separador, conforme exemplo do PDF (1,9,3,50,Medicamentos) [cite: 53]
        final String SEPARADOR = ","; 
        
        try (FileWriter writer = new FileWriter(NOME_ARQUIVO)) {
            // 1. Escreve o cabeçalho
            writer.write("ID" + SEPARADOR + "Tipo" + SEPARADOR + "Urgência" + SEPARADOR + "Peso" + SEPARADOR + "Descrição" + "\n");
            
            // 2. Gera as 1000 linhas
            for (int id = 1; id <= NUMERO_LINHAS; id++) {
                
                // Escolhe um índice aleatório na matriz de dados fixos (0 a 9)
                int indiceAleatorio = random.nextInt(DADOS_CARGAS.length);
                String[] dadosCarga = DADOS_CARGAS[indiceAleatorio];
                
                String tipo = dadosCarga[0];
                String descricao = dadosCarga[1];
                String urgencia = dadosCarga[2];
                
                // Gera um peso aleatório realista (ex: entre 10 e 100 kg)
                int peso = random.nextInt(91) + 10; 
                
                // Constrói a linha: ID,Tipo,Urgência,Peso,Descrição
                writer.write(
                    id + SEPARADOR + 
                    tipo + SEPARADOR + 
                    urgencia + SEPARADOR + 
                    peso + SEPARADOR + 
                    descricao + "\n"
                );
            }
            
            System.out.println("SUCESSO: Arquivo '" + NOME_ARQUIVO + "' com " + NUMERO_LINHAS + " linhas gerado.");

        } catch (IOException e) {
            System.err.println("ERRO ao escrever o arquivo CSV: " + e.getMessage());
        }
    }
}