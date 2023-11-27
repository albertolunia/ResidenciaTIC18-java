import java.util.Scanner;

public class CalculadoraSimples {

    private double adicao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    private double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    private double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    private double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {
    	double numero1, numero2, resultado;
    	
        Scanner scanner = new Scanner(System.in);

        CalculadoraSimples calculadora = new CalculadoraSimples();

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();
        
        resultado = 0;

        switch (escolha) {
            case 1:
                resultado = calculadora.adicao(numero1, numero2);
                break;
            case 2:
                resultado = calculadora.subtracao(numero1, numero2);
                break;
            case 3:
                resultado = calculadora.multiplicacao(numero1, numero2);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = calculadora.divisao(numero1, numero2);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("O resultado é: " + resultado);
    }
}
