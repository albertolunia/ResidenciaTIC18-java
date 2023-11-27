package aulasSemana2;

import java.util.Scanner;

public class Exercicio5_2 {

    public static void conversao(int i, double valor) {
        double fahrenheit, celcius;
        if(i == 0){
            fahrenheit = (valor * 9/5) + 32;
            System.out.println("O valor em fahrenheit é: " + fahrenheit);
        }else{
            celcius = (valor - 32) * 5/9;
            System.out.println("O valor em celcius é: " + celcius);
        }
    }
    public static void main(String[] args) {
        int n;
        double valor;

        Scanner nc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja converter");
        valor = nc.nextDouble();
        System.out.println("Você ira inserir um celcius(0) ou fahrenheit(1)");
        n = nc.nextInt();

        conversao(n, valor);
    }
}
