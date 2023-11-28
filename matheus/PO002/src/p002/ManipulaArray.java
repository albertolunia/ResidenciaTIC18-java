package pratica2;

import java.util.Scanner;
/*Escreva um método que crie um array de números inteiros lidos do usuário.
Outro que os crie aleatoriamente.
Uma função que calcule a soma de todos os elementos no array.
Uma função que encontre o maior valor do array. Outra que encontre o menor.
Crie uma função main() para testar todas essas funcionalidades 
 */
public class ManipulaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] arrayAleatorio = new int[10];

        System.out.println("Digite 10 números inteiros: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = (int) (Math.random() * 100);
        }

        System.out.println("A soma dos elementos do array é: " + somaArray(array));
        System.out.println("O maior elemento do array é: " + maiorArray(array));
        System.out.println("O menor elemento do array é: " + menorArray(array));

        System.out.println("\nA soma dos elementos do array aleatório é: " + somaArray(arrayAleatorio));
        System.out.println("O maior elemento do array aleatório é: " + maiorArray(arrayAleatorio));
        System.out.println("O menor elemento do array aleatório é: " + menorArray(arrayAleatorio));
    }

    public static int somaArray(int[] array) {
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return soma;
    }

    public static int maiorArray(int[] array) {
        int maior = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }

    public static int menorArray(int[] array) {
        int menor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        return menor;
    }
}
