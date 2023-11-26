package p002;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        // criando um objeto Random
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        int numero = rand.nextInt(1, 101); // numero aleatorio entre 1 e 100

        Scanner sc = new Scanner(System.in);
        int chute = 0;
        boolean entradaValida = false;

        do{
            // lendo chute
            do{
                try{
                    System.out.print("\nDiga um numero entre 1 e 100: ");
                    chute = sc.nextInt();
                    entradaValida = true;
                } catch(Exception e){
                    System.out.println("Valor invalido!");
                    sc.nextLine();
                }
            }while(!entradaValida);

            // comparando chute com numero
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
