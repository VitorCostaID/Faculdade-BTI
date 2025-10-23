## Atividade 16

Objetivos:
• Aplicar o uso de classes genéricas (<T>) em Java;
• Compreender o uso do coringa genérico (?);
• Praticar manipulação de listas com ArrayList<T> e criação de métodos
estáticos.
Instruções de Implementação:

### 1. Classe Catalogo<T>
Crie uma classe genérica chamada Catalogo<T> com as seguintes funcionalidades:
• Um atributo privado List<T> itens (utilize ArrayList);
• Um método void adicionar(T item) para inserir itens no catálogo;
• Um método void listar() que exiba todos os itens no console;
• Um método int tamanho() que retorne o número de itens;
• Um método estático:
public static void exibirCatalogoGenerico(Catalogo<?> catalogo)
Esse método deve aceitar qualquer catálogo, exibir seu conteúdo e mos-
trar o total de itens.

### 2. Classe Principal
Implemente a classe Principal para testar o funcionamento:
• Crie um Catalogo<String> para armazenar títulos de filmes;
• Crie um Catalogo<Integer> para armazenar códigos de produtos;
• Adicione pelo menos três elementos em cada catálogo;
• Utilize o método exibirCatalogoGenerico() para exibir o conteúdo de
ambos.

### 3. Adicione recursos extras.
Exemplo de Saída Esperada
Catálogo de Filmes:
Interestelar
Matrix
O Poderoso Chefão
Catálogo de Códigos:
101
202
303

```
=== Exibindo via método genérico ===
Exibindo catálogo genérico:
Interestelar
Matrix
O Poderoso Chefão
Total de itens: 3
-----------------------------
Exibindo catálogo genérico:
101
202
303
Total de itens: 3
-----------------------------
```