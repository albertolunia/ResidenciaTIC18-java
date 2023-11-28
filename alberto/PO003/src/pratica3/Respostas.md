# 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

<p>Uma exceção em Java é um evento que ocorre durante a execução de um programa que interrompe o fluxo normal das instruções. As exceções são usadas para indicar que ocorreu um problema durante a execução de um programa. Elas permitem que você separe o código de tratamento de erros do código normal. Isso melhora a legibilidade do seu código e torna mais fácil de manter.</p>

# 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma. 

<p>Exceções verificadas são aquelas que são verificadas em tempo de compilação. Elas devem ser tratadas no código, caso contrário, o código não será compilado. Isso significa que o compilador verifica se essas exceções foram tratadas ou não. Exemplos de exceções verificadas incluem IOException, ClassNotFoundException, etc.</p>

<code>
try {
    // Código que pode lançar IOException
} catch (IOException e) {
    // Tratamento da exceção
}
</code>

<p>Exceções não verificadas são aquelas que não são verificadas em tempo de compilação. Elas são geralmente programáticas e indicam erros de programação, como divisão por zero, acessar um índice fora dos limites de um array, etc. Exemplos de exceções não verificadas incluem ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.</p>

<code>
try {
    // Código que pode lançar ArithmeticException
} catch (ArithmeticException e) {
    // Tratamento da exceção
}
</code>

# 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

<p>Em Java, você pode lidar com exceções usando blocos try, catch e finally, além da declaração throw.</p>

<p>As práticas comuns para o tratamento de exceções incluem:

Tratar apenas as exceções que você pode manipular.
Não suprimir ou ignorar exceções.
Sempre limpar recursos no bloco finally ou usar try-with-resources.
Use exceções específicas em vez de pegar Exception genérica.
Não use exceções para controle de fluxo de código.</p>

# 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

<p>O bloco "try-catch" em Java é usado para capturar e tratar exceções. Ele funciona da seguinte maneira:

O bloco de código que pode lançar uma exceção é colocado dentro do bloco try.
Se uma exceção é lançada dentro do bloco try, a execução do bloco é interrompida, e o controle é passado para o primeiro bloco catch correspondente.
Se nenhuma exceção é lançada, os blocos catch são ignorados.</p>

<p>Usar o bloco "try-catch" é importante por várias razões:

Permite que você trate exceções de maneira controlada e previsível.
Ajuda a evitar a terminação abrupta do programa devido a exceções não tratadas.
Melhora a robustez do seu código, permitindo que ele lide com situações inesperadas ou errôneas.
Melhora a legibilidade do código, separando o código normal do código de tratamento de erros.</p>

# 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

<p>É apropriado criar suas próprias exceções personalizadas em Java quando você deseja fornecer informações mais detalhadas sobre um problema que ocorreu em seu programa, que não é coberto pelas exceções padrão do Java, ou quando você deseja criar uma hierarquia de exceções específica para seu aplicativo.

Para criar uma exceção personalizada, você pode estender a classe Exception (para uma exceção verificada) ou a classe RuntimeException (para uma exceção não verificada).

Aqui está um exemplo de como criar uma exceção personalizada:</p>

<code>
public class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
</code>

<p>Você pode lançar essa exceção usando a palavra-chave throw:</p>

<code>throw new MyCustomException("Esta é uma exceção personalizada");</code>

<p>Um exemplo de quando você pode querer criar uma exceção personalizada é se você estiver escrevendo um programa que lida com transações bancárias. Você pode criar uma exceção InsufficientFundsException para lançar sempre que uma conta não tiver fundos suficientes para completar uma transação. Isso permitiria que você tratasse esse caso específico de maneira diferente de outros tipos de exceções.</p>