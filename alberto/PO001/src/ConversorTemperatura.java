import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
    	double temperatura, temperaturaConvertida;
    	char unidadeOrigem;
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.print("Insira a temperatura: ");
        temperatura = scanner.nextDouble();

        System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
        unidadeOrigem = scanner.next().charAt(0);

        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            temperaturaConvertida = celsiusParaFahrenheit(temperatura);
            System.out.println("Temperatura em Fahrenheit: " + temperaturaConvertida + " °F");
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            temperaturaConvertida = fahrenheitParaCelsius(temperatura);
            System.out.println("Temperatura em Celsius: " + temperaturaConvertida + " °C");
        } else {
            System.out.println("Entrada inválida. Por favor, escolha C ou F.");
        }

        scanner.close();
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
