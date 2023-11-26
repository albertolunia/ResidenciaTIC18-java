package p002;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double valor, cotacao;
        
        System.out.print("Digite o valor em dolares: ");
        valor = sc.nextDouble();
        System.out.print("Digite a cotacao do dolar: ");
        cotacao = sc.nextDouble();

        System.out.printf("Valor convertido é: " + dolarConverter(valor, cotacao));
        sc.close();
    }

    public static double dolarConverter(double valor, double cotacao) {
        return valor * cotacao;
    }
}
