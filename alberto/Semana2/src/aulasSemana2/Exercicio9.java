package aulasSemana2;

import java.util.Scanner;

public class Exercicio9 {
    public static void adicao(double a, double b) {
        System.out.println("Adição: " + (a + b));
    }

    public static void subtracao(double a, double b) {
        System.out.println("Subtração: " + (a - b));
    }

    public static void multiplicacao(double a, double b) {
        System.out.println("Multiplicação: " + (a * b));
    }

    public static void divisao(double a, double b) {
        System.out.println("Divisão: " + (a / b));
    }

    public static void main(String[] args) {
        double a, b;
        int opcao;
        Scanner nc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        a = nc.nextDouble();

        System.out.println("Digite o segundo número");
        b = nc.nextDouble();

        System.out.println("Digite a operação desejada");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        opcao = nc.nextInt();

        switch (opcao) {
            case 1:
                adicao(a, b);
                break;
            case 2:
                subtracao(a, b);
                break;
            case 3:
                multiplicacao(a, b);
                break;
            case 4:
                divisao(a, b);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
