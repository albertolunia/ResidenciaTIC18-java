import java.util.Scanner;

public class CalculadoraSimples {

    public double adicao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraSimples calculadora = new CalculadoraSimples();

        boolean continuar = true;

        while (continuar) {
            double numero1, numero2, resultado;

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
                        continuar = false;
                        break;
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    continuar = false;
                    break;
            }

            System.out.println("O resultado é: " + resultado);

            System.out.print("Deseja realizar outra operação? (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta != 'S' && resposta != 's') {
                continuar = false;
            }
        }

        System.out.println("Calculadora encerrada. Obrigado!");
        scanner.close();
    }
}
