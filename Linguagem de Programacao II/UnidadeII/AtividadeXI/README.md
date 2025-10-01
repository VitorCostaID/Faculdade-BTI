# Atividade 11

## 1: Sistema de Compras em uma Loja de Conveniências

### Interfaces e Classes de Produto

**Interface:** `Produto`
- **Métodos:**
    - `String getNome();`
    - `double getPreco();`

**Classes que Implementam `Produto`:**
1.  **`Bebida`**
    - **Atributos:** nome, preço, éAlcoolica (booleano).
2.  **`Lanche`**
    - **Atributos:** nome, preço, éSalgado (booleano) ou éDoce.
3.  **`Higiene`**
    - **Atributos:** nome, preço, tipo (líquido/sólido).

### Classe de Gerenciamento

**Classe:** `Carrinho`
- **Funcionalidades:**
    - Armazena uma **lista de produtos**.
    - **Método:** `adicionarProduto(Produto p)` (inclui item).
    - **Método:** `calcularTotal()` (retorna o valor total).
    - **Método:** `listarProdutos()` (mostra todos os itens).

### Execução Principal

**Classe:** `Main`
- **Passos:**
    1. Instanciar alguns produtos de cada categoria.
    2. Adicioná-los ao `Carrinho`.
    3. Exibir a lista de produtos comprados e o valor total.
    4. **Aplicar a regra de desconto:** 10% de desconto se o total for **acima de R$100,00**.

---

## 2: Figuras Geométricas Planas

### Interfaces e Classes de Figura

**Interface:** `Figura`
- **Métodos:**
    - `double area();`
    - `double perimetro();`

**Constante:**
- Utilizar $\pi$ igual a **3,1416**.

**Classes que Implementam `Figura` e Fórmulas:**

| Figura | Atributos | Fórmulas |
| :--- | :--- | :--- |
| **`Circulo`** | raio | $A = \pi r^2$, $P = 2\pi r$ |
| **`Retangulo`** | base, altura | $A = bh$, $P = 2(b + h)$ |
| **`Quadrado`** | lado | $A = l^2$, $P = 4l$ |
| **`Triangulo`** | base, altura, lados a, b, c | $A = \frac{b \cdot h}{2}$, $P = a + b + c$ |
| **`Trapezio`** | baseMaior (B), baseMenor (b), altura (h), l1, l2 | $A = \frac{(B+b) \cdot h}{2}$, $P = B + b + l1 + l2$ |
| **`Paralelogramo`**| base (b), altura (h), lado (l) | $A = b \cdot h$, $P = 2(b + l)$ |
| **`Losango`** | D (Diagonal Maior), d (Diagonal Menor), lado (l) | $A = \frac{D \cdot d}{2}$, $P = 4l$ |

### Execução Principal

**Classe:** `Main`
- **Passos:**
    1. Instanciar as figuras com valores.
    2. Armazená-las em um **vetor de `Figura`**.
    3. Percorrer o vetor e exibir, para cada figura, seus parâmetros, a **área** e o **perímetro**.
    4. Criar um **método auxiliar** que receba o vetor e retorne a figura de **maior área**.