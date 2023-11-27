package aulasSemana2;

import java.util.Scanner;

public class Exercicio5_1 {

    public static void celciusParaFahr(double celcius) {
        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("O valor em fahrenheit é: " + fahrenheit);
    }

    public static void fahrParCelsius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        System.out.println("O valor em celcius é: " + celcius);
    }
    public static void main(String[] args) {
        int n;
        double celcius, fahrenheit;
        System.out.println("Você ira inserir um celcius(0) ou fahrenheit(1)");
        Scanner nc = new Scanner(System.in);
        n = nc.nextInt();

        if(n == 0){
            System.out.println("Insira o valor em celcius");
            celcius = nc.nextDouble();
            celciusParaFahr(celcius);
        }else if(n == 1){
            System.out.println("Insira o valor em fahrenheit");
            fahrenheit = nc.nextDouble();
            fahrParCelsius(fahrenheit);
        }else{
            System.out.println("Valor inválido");
        }

    }
}
