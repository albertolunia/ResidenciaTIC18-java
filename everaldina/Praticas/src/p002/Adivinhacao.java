package p002;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numero = rand.nextInt(1, 101);
        int chute = 0;

        do{
            System.out.print("\nDiga um numero entre 1 e 100: ");
            chute = sc.nextInt();
            if(chute > numero)
                System.out.println("Chute muito alto!");
            else if(chute < numero)
                System.out.println("Chute muito baixo!");
            else
                System.out.println("Acertou!");
        }while(chute != numero);

        sc.close();
    }
}
