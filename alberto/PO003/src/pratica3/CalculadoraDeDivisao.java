package pratica3;

public class CalculadoraDeDivisao {
    
    public static int dividir(int dividendo, int divisor) {
        try {
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida.");
            return 0;
        }
    }

    public static float dividir(float dividendo, float divisor) {
        try {
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida.");
            return 0;
        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static float somar(float a, float b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Divisão de inteiros: " + dividir(10, 2));
        System.out.println("Divisão de floats: " + dividir(10.0f, 2.0f));
        System.out.println();
        System.out.println("Divisão de inteiros por zero: " + dividir(10, 0));
        System.out.println("Divisão de floats por zero: " + dividir(10.0f, 0.0f));
        System.out.println();
        System.out.println("Soma de inteiros: " + somar(10, 2));
        System.out.println("Soma de floats: " + somar(10.0f, 2.0f));
        System.out.println("Subtração de inteiros: " + subtrair(10, 2));
        System.out.println("Subtração de floats: " + subtrair(10.0f, 2.0f));
        System.out.println("Multiplicação de inteiros: " + multiplicar(10, 2));
        System.out.println("Multiplicação de floats: " + multiplicar(10.0f, 2.0f));
    }
}