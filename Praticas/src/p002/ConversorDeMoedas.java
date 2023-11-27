package p002;

import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        double valorEmDolar, taxaDeCambio;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor em dólar: ");

        valorEmDolar = scanner.nextDouble();

        if (valorEmDolar <= 0) {
            System.out.println("Valor invalido!");
            return;
        }

        System.out.print("Insira a taxa de câmbio: ");

        taxaDeCambio = scanner.nextDouble();

        if (taxaDeCambio <= 0) {
            System.out.println("Valor invalido!");
            return;
        }

        System.out.print("O valor convertido é: " + dolarConverter(valorEmDolar, taxaDeCambio));
        System.out.println();
    }

    public static String dolarConverter(double valor, double cotacao) { 
        String resultado = String.format("%.2f", valor * cotacao);
        return resultado;
    }
}

