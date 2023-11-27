package aulasSemana2;

import java.util.Scanner;

public class Exercicio4 {

    public static void verificaPar(int n1) {
        if (n1 % 2 == 0) {
            System.out.println("O número " + n1 + " é par.");
        } else {
            System.out.println("O número " + n1 + " é ímpar.");
        }
    }
    public static void main(String[] args) {
        int n1;

        Scanner nc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n1 = nc.nextInt();

        verificaPar(n1);
    }
}
