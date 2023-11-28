package p002;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    private int numero;

    public Adivinhacao() {
        numero = gerarNumero();
    }

    public int gerarNumero() {
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        return random.nextInt(100) + 1;
    }

    public int getNumero() {
        return this.numero;
    }

    public static void main(String[] args) {
        int palpite;
        boolean acertou = false;
        Adivinhacao adivinha = new Adivinhacao();
        System.out.println("Jogo Começou " + adivinha.getNumero());
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe um palpite entre 1 e 100");
            try {
                palpite = sc.nextInt();

                if (palpite < 1 || palpite > 100) {
                    throw new IllegalArgumentException("Palpite fora do intervalo permitido (1 a 100)");
                }

                if (palpite == adivinha.getNumero()) {
                    System.out.println("Você ganhou!!!!");
                    acertou = true;
                } else if (palpite > adivinha.getNumero()) {
                    System.out.println("Muito alto");
                } else {
                    System.out.println("Muito baixo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
                sc.nextLine(); // Limpa o buffer do scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (!acertou);

        sc.close();
    }
}

