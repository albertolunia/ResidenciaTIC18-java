# Respostas sobre Exceções em Java

1. **O que é uma exceção em Java e qual é o propósito de usá-las em programas?**

   Em Java, uma exceção é um evento anormal que ocorre durante a execução de um programa e interrompe o fluxo normal de execução. Elas são usadas para lidar com situações imprevistas ou erros durante a execução do programa, permitindo que o código trate essas situações de forma apropriada, mantendo a robustez e a integridade do software.

2. **Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.**

   - **Exceções Verificadas:** São exceções que o compilador obriga o desenvolvedor a tratar ou propagar, usando `throws` na assinatura do método ou utilizando um bloco `try-catch`. Exemplo: `IOException`.

   ```java
    import java.io.File;
    import java.io.FileReader;
    import java.io.IOException;
    public class ExcecoesVerificadas {
    public static void lerArquivo(String nomeArquivo) throws IOException {
    File arquivo = new File(nomeArquivo);
    FileReader leitor = new FileReader(arquivo);
    // Operações de leitura...
    leitor.close();
    }

        public static void main(String[] args) {
            try {
                lerArquivo("arquivo.txt");
            } catch (IOException e) {
                System.out.println("Ocorreu um erro de leitura: " + e.getMessage());
            }
        }

    }

    ```

- **Exceções Não Verificadas:** Também chamadas de exceções não verificadas, são subclasses de `RuntimeException`. Não são obrigadas a serem tratadas explicitamente pelo programador. Exemplo: `NullPointerException`.
    ```java
    public class ExcecoesNaoVerificadas {
        public static void main(String[] args) {
            String texto = null;
            try {
                System.out.println(texto.length()); // Isso lançará um NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Ocorreu um NullPointerException: " + e.getMessage());
            }
        }
    }
    ```

3. **Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?**

Em Java, você pode lidar com exceções usando blocos `try-catch`, `throws` na assinatura do método ou usando o bloco `finally`. Palavras-chave importantes são `try`, `catch`, `finally`, `throw` e `throws`. É uma boa prática tratar as exceções o mais próximo possível do local onde elas podem ocorrer e fornecer informações úteis sobre o erro.

4. **O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?**

O bloco `try-catch` é usado para envolver o código que pode lançar uma exceção. O bloco `try` contém o código que pode gerar uma exceção e o bloco `catch` captura e trata a exceção. É importante usá-lo para evitar que o programa quebre devido a exceções não tratadas e permitir um tratamento controlado dos erros.

5. **Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.**

É apropriado criar suas próprias exceções personalizadas quando você tem um cenário específico no qual uma exceção genérica não é suficiente para representar o erro. Por exemplo, ao criar uma aplicação financeira, pode ser útil criar uma exceção `SaldoInsuficienteException` para representar quando um usuário tenta fazer uma transação com saldo insuficiente na conta.

Para criar uma exceção personalizada em Java, você pode criar uma classe que herda de `Exception` ou de qualquer subclasse de `Exception`, e implementar construtores e métodos específicos para manipular as informações da exceção personalizada.
```
