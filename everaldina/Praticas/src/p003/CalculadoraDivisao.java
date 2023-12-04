package p003;

import java.util.Scanner;

public class CalculadoraDivisao {

    public static void main(String[] args) {
        int a, b;
        float c, d;
        Scanner sc = new Scanner(System.in);

        // lê os valores de entrada
        System.out.print("Digite um numero inteiro A: ");
        a = sc.nextInt();
        System.out.print("Digite um numero inteiro B: ");
        b = sc.nextInt();
        System.out.print("Digite um numero real C: ");
        c = sc.nextFloat();
        System.out.print("Digite um numero real D: ");
        d = sc.nextFloat();

        System.out.println();
        
        System.out.println("Divisao--------------");
        // toda vez que for fazer uma divisão, deve-se verificar se o divisor é zero
        try {
            System.out.print("A / B = ");
            System.out.println(dividirInt(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }
        try {
            System.out.print("C / D = ");
            System.out.println(dividirFloat(c, d));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }
        try {
            System.out.print("A / D = ");
            System.out.println(dividirFloat(a, d));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }
        try {
            System.out.print("C / B = ");
            System.out.println(dividirFloat(c, b));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }


        System.out.println("Soma----------------");
        System.out.println("A + B = " + somar(a, b));
        System.out.println("C + D = " + somar(c, d));
        System.out.println("A + D = " + somar(a, d));
        System.out.println("C + B = " + somar(c, b));

        
        System.out.println("Subtracao-----------");
        System.out.println("A - B = " + subtrair(a, b));
        System.out.println("B - A = " + subtrair(b, a));
        System.out.println("C - D = " + subtrair(c, d));
        System.out.println("D - C = " + subtrair(d, c));


        System.out.println("Multiplicacao-------");
        System.out.println("A * B = " + multiplicar(a, b));
        System.out.println("C * D = " + multiplicar(c, d));
        System.out.println("A * D = " + multiplicar(a, d));
        System.out.println("C * B = " + multiplicar(c, b));


        sc.close();

    }

    // retorna a divisão de dois números float
    public static float dividirFloat(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("DivisionByZeroException");
        }
        return a / b;
    }

    // retorna a divisão de dois números inteiros
    public static int dividirInt(int a, int b) {
       if (b == 0) {
            throw new ArithmeticException("DivisionByZeroException");
        }
        return a / b;
    }

    // retorna a soma de dois números
    public static float somar(float a, float b) {
        return a + b;
    }

    // retorna a diferença de dois números
    public static float subtrair(float a, float b) {
        return a - b;
    }

    // retorna o produto de dois números
    public static float multiplicar(float a, float b) {
        return a * b;
    }
}
