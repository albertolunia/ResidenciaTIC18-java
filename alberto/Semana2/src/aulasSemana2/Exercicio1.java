package aulasSemana2;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void soma(int valor1, int valor2) {
		System.out.println(valor1+valor2);
	}
	
	public static void main(String[] args) {
		int valor1, valor2;
		
		System.out.println("Insira o valor 1: ");
		Scanner nc = new Scanner(System.in);
		valor1 = nc.nextInt();
		
		System.out.println("Insira o valor 2: ");
		valor2 = nc.nextInt();
		
		soma(valor1, valor2);
	}
}
