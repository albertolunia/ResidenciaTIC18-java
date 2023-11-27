package aulasSemana2;

import java.util.Scanner;

public class Exercicio8_2 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int diaAtual, diaNasc, mesAtual, mesNasc, anoAtual, anoNasc;

        System.out.println("Digite o dia atual");
        diaAtual = nc.nextInt();

        System.out.println("Digite o mês atual");
        mesAtual = nc.nextInt();

        System.out.println("Digite o ano atual");
        anoAtual = nc.nextInt();

        System.out.println("Digite o dia de nascimento");
        diaNasc = nc.nextInt();

        System.out.println("Digite o mês de nascimento");
        mesNasc = nc.nextInt();

        System.out.println("Digite o ano de nascimento");
        anoNasc = nc.nextInt();

        if (anoAtual < anoNasc) {
            System.out.println("Data de nascimento inválida");
        } else if (anoAtual == anoNasc) {
            if (mesAtual < mesNasc) {
                System.out.println("Data de nascimento inválida");
            } else if (mesAtual == mesNasc) {
                if (diaAtual < diaNasc) {
                    System.out.println("Data de nascimento inválida");
                } else {
                    System.out.println("Idade: " + (anoAtual - anoNasc));
                }
            } else {
                System.out.println("Idade: " + (anoAtual - anoNasc));
            }
        } else {
            System.out.println("Idade: " + (anoAtual - anoNasc));
        }
    }
}
