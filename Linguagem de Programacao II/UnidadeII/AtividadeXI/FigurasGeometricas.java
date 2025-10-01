final class Constantes {
    public static final double PI = 3.1416;
}

interface Figura {
    double area();
    double perimetro();
    // Método auxiliar
    String getNomeSimples(); 
}

// -------------------------------------------------------------------

class Circulo implements Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        // A = PI * r^2
        return Constantes.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        // P = 2 * PI * r
        return 2 * Constantes.PI * raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo (Raio: %.2f)", raio);
    }
    
    @Override
    public String getNomeSimples() { return "Círculo"; }
}

// -------------------------------------------------------------------

class Retangulo implements Figura {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        // A = b * h
        return base * altura;
    }

    @Override
    public double perimetro() {
        // P = 2 * (b + h)
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return String.format("Retângulo (Base: %.2f, Altura: %.2f)", base, altura);
    }

    @Override
    public String getNomeSimples() { return "Retângulo"; }
}

// -------------------------------------------------------------------

class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        // A = l^2
        return lado * lado;
    }

    @Override
    public double perimetro() {
        // P = 4 * l
        return 4 * lado;
    }

    @Override
    public String toString() {
        return String.format("Quadrado (Lado: %.2f)", lado);
    }

    @Override
    public String getNomeSimples() { return "Quadrado"; }
}

// -------------------------------------------------------------------

class Triangulo implements Figura {
    private double base;
    private double altura;
    private double ladoA; // lado esquerdo
    private double ladoB; // lado direito
    private double ladoC; // a base é o ladoC

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double area() {
        // A = (b * h) / 2
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        // P = a + b + c
        return ladoA + ladoB + ladoC;
    }

    @Override
    public String toString() {
        return String.format("Triângulo (Base: %.2f, Altura: %.2f, Lados: %.2f, %.2f, %.2f)", base, altura, ladoA, ladoB, ladoC);
    }

    @Override
    public String getNomeSimples() { return "Triângulo"; }
}

// -------------------------------------------------------------------

class Trapezio implements Figura {
    private double baseMaior; // B
    private double baseMenor; // b
    private double altura; // h
    private double lado1; // l1
    private double lado2; // l2

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        // A = ((B + b) * h) / 2
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double perimetro() {
        // P = B + b + l1 + l2
        return baseMaior + baseMenor + lado1 + lado2;
    }

    @Override
    public String toString() {
        return String.format("Trapézio (B: %.2f, b: %.2f, h: %.2f, Lados: %.2f, %.2f)", baseMaior, baseMenor, altura, lado1, lado2);
    }

    @Override
    public String getNomeSimples() { return "Trapézio"; }
}

// -------------------------------------------------------------------

class Paralelogramo implements Figura {
    private double base; // b
    private double altura; // h
    private double lado; // l

    public Paralelogramo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double area() {
        // A = b * h
        return base * altura;
    }

    @Override
    public double perimetro() {
        // P = 2 * (b + l)
        return 2 * (base + lado);
    }

    @Override
    public String toString() {
        return String.format("Paralelogramo (Base: %.2f, Altura: %.2f, Lado: %.2f)", base, altura, lado);
    }

    @Override
    public String getNomeSimples() { return "Paralelogramo"; }
}

// -------------------------------------------------------------------

class Losango implements Figura {
    private double diagonalMaior; // D
    private double diagonalMenor; // d
    private double lado; // l

    public Losango(double diagonalMaior, double diagonalMenor, double lado) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    @Override
    public double area() {
        // A = (D * d) / 2
        return (diagonalMaior * diagonalMenor) / 2;
    }

    @Override
    public double perimetro() {
        // P = 4 * l
        return 4 * lado;
    }

    @Override
    public String toString() {
        return String.format("Losango (D: %.2f, d: %.2f, Lado: %.2f)", diagonalMaior, diagonalMenor, lado);
    }

    @Override
    public String getNomeSimples() { return "Losango"; }
}

// -------------------------------------------------------------------

public class FigurasGeometricas {

    public static Figura encontrarMaiorArea(Figura[] figuras) {
        if (figuras == null || figuras.length == 0) {
            return null;
        }

        Figura maiorFigura = figuras[0];
        double maiorArea = figuras[0].area();

        for (int i = 1; i < figuras.length; i++) {
            if (figuras[i].area() > maiorArea) {
                maiorArea = figuras[i].area();
                maiorFigura = figuras[i];
            }
        }
        return maiorFigura;
    }

    public static void main(String[] args) {
        // Instanciar as figuras
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(10.0, 4.0);
        Quadrado quadrado = new Quadrado(6.0);
        Triangulo triangulo = new Triangulo(8.0, 5.0, 6.0, 7.0, 8.0);
        Trapezio trapezio = new Trapezio(12.0, 8.0, 5.0, 6.0, 6.0);
        Paralelogramo paralelogramo = new Paralelogramo(10.0, 4.0, 5.0);
        Losango losango = new Losango(10.0, 8.0, 6.0);

        // Armazenar em um vetor
        Figura[] vetorFiguras = {
            circulo, 
            retangulo, 
            quadrado, 
            triangulo, 
            trapezio, 
            paralelogramo, 
            losango
        };

        System.out.println("----------------------------------------");

        for (Figura f : vetorFiguras) {
            System.out.println(f);
            System.out.printf("  Área: %.4f\n", f.area());
            System.out.printf("  Perímetro: %.4f\n", f.perimetro());
            System.out.println();
        }

        // Encontrar e exibir a figura de maior área
        System.out.println("--- Análise de Área ---");
        Figura maiorFigura = encontrarMaiorArea(vetorFiguras);

        if (maiorFigura != null) {
            System.out.printf("A figura com a MAIOR ÁREA é o %s\n", maiorFigura.getNomeSimples());
            System.out.printf("Área Máxima: %.4f\n", maiorFigura.area());
        }
    }
}