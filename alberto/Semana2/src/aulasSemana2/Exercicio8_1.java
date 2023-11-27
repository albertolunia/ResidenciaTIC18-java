package aulasSemana2;

import java.util.Scanner;

public class Exercicio8_1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade");
        idade = nc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else if (idade < 0) {
            System.out.println("Idade inválida");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
