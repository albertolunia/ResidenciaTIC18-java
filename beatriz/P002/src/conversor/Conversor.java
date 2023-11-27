package conversor;

import java.util.Scanner;

public class Conversor {
	public static float converte(float taxa,float quantidade) {
		return taxa*quantidade;
		
	}
	public static void main(String[] args) {
		String moeda;;
		Scanner sc = new Scanner(System.in);
		System.out.println("Gostaria de converter de dolares para qual moeda? ex: 'real'");
		moeda= sc.next();
		System.out.print("Insira a quantidade em dólares: ");
        float quantidadeDolares = sc.nextFloat();

        System.out.print("Insira a taxa de câmbio: ");
        float taxaCambio = sc.nextFloat();
        
        System.out.println("O valor convertido é:"+converte(taxaCambio,quantidadeDolares)+" "+ moeda);
        
		
	}
}
