# Questoes Discursivas
## Questão 1
O que é uma exceção em Java e qual é o propósito de usá-las em programas? 
> Uma exceção é um evento que ocorre em tempo execução de um programa, ela interrompe o fluxo normal de instruções. Quando acontece uma exceção, o programa para de ser executado. Excessoes podem ser tratadas para que o programa não encerre sua execução.
> É possivel lançar execeções para que algo invalido nas regras do sistema seja executado. Cabe ao programador lançar e tratar as exceções de forma adequada.

## Questão 2
Pesquise sobre a diferença entre exceções verificadas e não verificadas em  Java. Dê exemplos de cada uma. 
> Exceções verificadas são exceções que o compilador obriga o programador a tratar, o programador é obrigado a tratar a exceção ou lançá-la para o método que o chamou. 
> Exceções não verificadas são exceções que o compilador não obriga o programador a tratar, e podem ser executados normalmente, dando erro em tempo de execução caso não sejam tratadas.

## Questão 3
Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções? 
> Para lidar com exceções, é usado o bloco try-catch. Onde o codigo que pode gerar a exceção é colocado no bloco try e no catch é colocado o que fazer caso haja uma exceção.
> Palavras-chave: try, catch, finally.
> Uso comum: try-catch-finally.
> Exemplo:
```java
try {
    // código que pode lançar uma exceção
} catch (Exception e) {
    // código que trata a exceção
} finally {
    // código que é executado independente se ocorreu uma exceção ou não
}
```
 
## Questão 4
O  que  é  o  bloco  "try-catch"  em  Java?  Como  ele  funciona  e  por que é importante usá-lo ao lidar com exceções? 
> O bloco try-catch é composto por um bloco try, onde o código que pode lançar uma exceção é colocado, e um bloco catch, onde a exceção é tratada. O bloco catch é composto por um tipo de exceção e um bloco de código que trata a exceção, ele pode ser composto um ou mais blocos catch, onde cada bloco trata um tipo de exceção diferente. Ao final do bloco catch pode ainda ter um bloco finally, que é executado independente se ocorreu uma exceção ou não.
> O bloco try-catch é importante para que o programa não encerre sua execução caso ocorra uma exceção.

## Questão 5
Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada. 
> É apropriado criar exceções personalizadas quando o programador quer lançar uma exceção que não existe no Java ou que fira uma regra de negócio do sistema.
> Um exemplo de exceção personalizada é a exceção "SaldoInsuficienteException", que é lançada quando o saldo de uma conta é insuficiente para realizar uma operação.