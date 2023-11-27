package aulasSemana2;

import java.util.Scanner;

public class Exercicio3 {

    public static void digitacaoStrings() {
        String string1, string2;

        Scanner nc = new Scanner(System.in);
        
        System.out.println("Digite a primeira string: ");
        string1 = nc.nextLine();

        System.out.println("Digite a segunda string: ");
        string2 = nc.nextLine();

        printStrings(string1, string2);
    }


    public static void printStrings(String string1, String string2) {
        System.out.println(string1 + " " + string2);
    }

    public static void main(String[] args) {
        digitacaoStrings();
    }
}
