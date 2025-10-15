import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MatriculaExistenteException extends Exception {
    public MatriculaExistenteException(String msg) {
        super(msg);
    }
}

class Alunos {
    private String nome;
    private String matricula;

    public Alunos(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula;
    }
}

class CadastrarAluno{
    private List<Alunos> listaDeAlunos = new ArrayList<>(); 
    
    public void verificarMatricula(String matricula) throws MatriculaExistenteException {
        for (Alunos aluno : listaDeAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                throw new MatriculaExistenteException("Matrícula já cadastrada: " + matricula);
            }
        }
    }

    public void cadastrarAluno(String nome, String matricula){
        try{
            verificarMatricula(matricula);
            Alunos aluno = new Alunos(nome, matricula);
            listaDeAlunos.add(aluno);
            System.out.println("SUCESSO: Aluno " + nome + " cadastrado.");
        }
        catch (MatriculaExistenteException e){
            System.out.println("FALHA: " + e.getMessage());
        }
    }

    public Alunos encontrarAluno(String matricula){
        for (Alunos aluno : listaDeAlunos){
            if(aluno.getMatricula().equals(matricula)){
                return aluno;
            }
        }
        return null;
    }

    public void ordenarLista(){
        Collections.sort(listaDeAlunos, new Comparator<Alunos>() {
            @Override
            public int compare(Alunos a1, Alunos a2) {
                return a1.getNome().compareTo(a2.getNome());
            }
        });
        System.out.println("\nLista de alunos ordenada por nome (ordem alfabética).");
    }
    
    public void exibirLista() {
        System.out.println("\n--- Lista de Alunos ---");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Alunos aluno : listaDeAlunos) {
            System.out.println(aluno);
        }
    }
}

public class CadastrodeAlunos {
    public static void main(String[] args) {
        CadastrarAluno cadastro = new CadastrarAluno();

        System.out.println("--- CADASTRO ---");
        cadastro.cadastrarAluno("Júlio Cesar", "80028922");
        cadastro.cadastrarAluno("Caio Moreira", "13574865");
        cadastro.cadastrarAluno("Helena Tavares", "00214488");
        
        // Matricula Repetida
        cadastro.cadastrarAluno("Marta Silva", "80028922");
        
        System.out.println("\n---  BUSCA E EXIBIÇÃO ---");
        
        Alunos aluno1 = cadastro.encontrarAluno("80028922");
        if(aluno1 == null){
            System.out.println("Aluno buscado (80028922): Aluno não encontrado.");
        } else {
            System.out.println("Aluno buscado (80028922): " + aluno1.getNome());
        }

        Alunos alunoNaoEncontrado = cadastro.encontrarAluno("99999999");
        if(alunoNaoEncontrado == null){
            System.out.println("Aluno buscado (99999999): Aluno não encontrado.");
        }
        
        System.out.println("\n---  ORDENAÇÃO E EXIBIÇÃO ---");
        cadastro.ordenarLista();
        cadastro.exibirLista();
    }
}