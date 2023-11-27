package aulasSemana2;

import java.util.Scanner;

public class Exercicio7_1 {
    public static void main(String[] args) {
        int valor1, valor2, auxiliar;

        System.out.println("Digite o primeiro valor");
        Scanner nc = new Scanner(System.in);
        valor1 = nc.nextInt();

        System.out.println("Digite o segundo valor");
        valor2 = nc.nextInt();

        auxiliar = valor1;
        valor1 = valor2;
        valor2 = auxiliar;

        System.out.println("O primeiro valor é: " + valor1);
        System.out.println("O segundo valor é: " + valor2);
    }
}
