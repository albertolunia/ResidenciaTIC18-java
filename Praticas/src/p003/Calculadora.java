package p003;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisaoInteira(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public float divisaoFloat(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            int resultadoInteiro = calculadora.divisaoInteira(10, 0);
            System.out.println("Resultado da divisão inteira: " + resultadoInteiro);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            float resultadoFloat = calculadora.divisaoFloat(5.0f, 0.0f);
            System.out.println("Resultado da divisão float: " + resultadoFloat);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
