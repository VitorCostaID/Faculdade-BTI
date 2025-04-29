#include <stdio.h>
#include "sala.h"

int main() {
    Lista lista_alunos;
    inicializa_lista(&lista_alunos);

    int opcao, pos, matricula_busca, matricula_remover;
    Aluno novo_aluno;

    do {
        printf("\n--- Menu ---\n");
        printf("1. Inserir Aluno\n");
        printf("2. Exibir Alunos\n");
        printf("3. Buscar Aluno por Matrícula\n");
        printf("4. Remover Aluno por Matrícula\n");
        printf("5. Contar Alunos\n");
        printf("6. Reinicializar Lista\n");
        printf("0. Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                printf("Digite a matrícula: ");
                scanf("%d", &novo_aluno.matricula);
                printf("Digite o nome: ");
                scanf(" %[^\n]s", novo_aluno.nome);
                printf("Digite a nota: ");
                scanf("%f", &novo_aluno.nota);
                printf("Digite a posição para inserir (0 a %d): ", lista_alunos.num_elem);
                scanf("%d", &pos);
                if (insere(&lista_alunos, novo_aluno, pos))
                    printf("Aluno inserido com sucesso!\n");
                else
                    printf("Erro ao inserir aluno.\n");
                break;
            case 2:
                exibe_lista(&lista_alunos);
                break;
            case 3:
                printf("Digite a matrícula para buscar: ");
                scanf("%d", &matricula_busca);
                pos = busca(&lista_alunos, matricula_busca);
                if (pos != -1)
                    printf("Aluno encontrado na posição %d.\n", pos);
                else
                    printf("Aluno não encontrado.\n");
                break;
            case 4:
                printf("Digite a matrícula para remover: ");
                scanf("%d", &matricula_remover);
                if (remove_aluno(matricula_remover, &lista_alunos))
                    printf("Aluno removido com sucesso!\n");
                else
                    printf("Aluno não encontrado.\n");
                break;
            case 5:
                printf("Número de alunos: %d\n", tamanho(&lista_alunos));
                break;
            case 6:
                reinicializa_lista(&lista_alunos);
                printf("Lista reinicializada.\n");
                break;
            case 0:
                printf("Saindo...\n");
                break;
            default:
                printf("Opção inválida.\n");
        }
    } while (opcao != 0);

    return 0;
}