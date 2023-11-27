package manipulaArray;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
	public static ArrayList<Integer> criaArrayUser() {
		ArrayList<Integer> numeros = new ArrayList<>();
		int resp = 0, num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Informe um numero:");
			num = sc.nextInt();
			numeros.add(num);
			System.out.println("Deseja inserir outro numero? 1-Sim 0-Não");
			resp = sc.nextInt();
		}while(resp != 0);
		return numeros;
		
		
		
	}
	public static ArrayList<Integer> criaArray(int tamanho) {
		ArrayList<Integer> numeros = new ArrayList<>();
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
		for (int i = 0; i < tamanho; i++) {
            int numeroAleatorio = random.nextInt(2001)-1000; 
            numeros.add(numeroAleatorio);
        }
		return numeros;
	}
	
	public static  void  somaArray( ArrayList<Integer> array) {
		int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }
        for (int i = 0; i < (array.size()-1); i++) {
            System.out.print(array.get(i)+" + ");
        }
		System.out.print(array.get(array.size()-1)+" = "+ soma);
      
	}
	public static int encontrarMaior(ArrayList<Integer> lista) {
        int maior = Integer.MIN_VALUE;

        for (int elemento : lista) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }
	
	public static int encontrarMenor(ArrayList<Integer> lista) {
        int menor = Integer.MAX_VALUE;

        for (int elemento : lista) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numerosUser = criaArrayUser();
		ArrayList<Integer> numerosSistema =criaArray(numerosUser.size());
		
		somaArray(numerosUser);
		System.out.println();
		somaArray(numerosSistema);
		System.out.println();
		System.out.println("O maior número digitado pelo usuario:"+encontrarMaior(numerosUser));
		System.out.println("O menor número digitado pelo usuario:"+encontrarMenor(numerosUser));
		System.out.println("O maior número gerado pelo sistema:"+encontrarMaior(numerosSistema));
		System.out.println("O menor número gerado pelo sistema:"+encontrarMenor(numerosSistema));
	}

}
