package aulasSemana2;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void mediaPonderada(float nt1, float nt2, float nt3, float peso1, float peso2, float peso3) {
		System.out.println(((nt1*peso1) + (nt2*peso2) + (nt3*peso3))/(peso1 + peso2 + peso3));
	}
	
	public static void main(String[] args) {
		float nt1, nt2, nt3, peso1, peso2, peso3;

		Scanner nc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nt1 = nc.nextFloat();
		System.out.println("Digite o peso da primeira nota: ");
		peso1 = nc.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nt2 = nc.nextFloat();
		System.out.println("Digite o peso da segunda nota: ");
		peso2 = nc.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nt3 = nc.nextFloat();
		System.out.println("Digite o peso da terceira nota: ");
		peso3 = nc.nextFloat();

		mediaPonderada(nt1, nt2, nt3, peso1, peso2, peso3);
	}
}
