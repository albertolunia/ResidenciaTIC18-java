package pratica2;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100);
        int numeroDeTentativas = 0;
        int numeroDigitado = 0;

        while (numeroDigitado != numeroAleatorio) {
            numeroDeTentativas++;

            System.out.print("\nDigite um número: ");

            numeroDigitado = Integer.parseInt(System.console().readLine());

            if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número sorteado!");
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O número digitado é maior que o número sorteado!");
            }
        }

        System.out.println("Parabéns, você acertou o número em " + numeroDeTentativas + " tentativas!");
    }
}
