package aulasSemana2;

import java.util.Scanner;

public class Exercicio6 {
	public static void areaRetangulo(int base, int altura) {
        System.out.println("A área do retângulo é: " + base * altura);
    }

    public static void main(String[] args) {
        int base, altura;

        Scanner nc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo");
        base = nc.nextInt();
        System.out.println("Digite a altura do retângulo");
        altura = nc.nextInt();

        areaRetangulo(base, altura);
    }
}


