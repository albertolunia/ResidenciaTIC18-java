package aulasSemana2;

import java.util.ArrayList;
import java.util.Scanner;

//pequeno quiz
public class Exercicio10 {
    String pergunta;
    int alternativaCorreta;
    String[] alternativas = new String[4];

    public Exercicio10(String pergunta, int alternativaCorreta, String[] alternativas) {
        this.pergunta = pergunta;
        this.alternativaCorreta = alternativaCorreta;
        this.alternativas = alternativas;
    }

    public void verificarResposta(int resposta) {
        if (resposta == alternativaCorreta) {
            System.out.println("Resposta correta");
        } else {
            System.out.println("Resposta incorreta");
        }
    }

    public static void executarPergunta(ArrayList<Exercicio10> perguntas) {
        Scanner nc = new Scanner(System.in);
        int resposta;

        for (Exercicio10 pergunta : perguntas) {
            System.out.println(pergunta.pergunta);
            for (int i = 0; i < pergunta.alternativas.length; i++) {
                System.out.println((i + 1) + " - " + pergunta.alternativas[i]);
            }
            resposta = nc.nextInt();
            pergunta.verificarResposta(resposta);
        }
    }

    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        ArrayList<Exercicio10> perguntas = new ArrayList<Exercicio10>();

        perguntas.add(new Exercicio10("Quantas teclas há em um piano?", 2, new String[]{"90", "88", "85", "93"}));
        perguntas.add(new Exercicio10("Qual o nome do primeiro computador?", 1, new String[]{"ENIAC", "IBM 5100", "Z1", "Z3"}));
        perguntas.add(new Exercicio10("Qual é a série de livros mais vendida do século 21?", 4, new String[]{"Saga Crepúsculo", "Crepúsculo", "O Senhor dos Anéis", "Harry Potter"}));
        perguntas.add(new Exercicio10("Qual é o menor país do mundo?", 1, new String[]{"Vaticano", "Mônaco", "Nauru", "Tuvalu"}));
        perguntas.add(new Exercicio10("Qual motorista ganhou mais corridas de Fórmula 1?", 3, new String[]{"Ayrton Senna", "Michael Schumacher", "Lewis Hamilton", "Sebastian Vettel"}));
        perguntas.add(new Exercicio10("Quando a Netflix foi fundada", 1, new String[]{"1997", "2001", "2009", "2015"}));
        executarPergunta(perguntas);

    }
}
