package p002;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double valor = 0, cotacao = 0;
        boolean entradaValida = false;
        
        // lendo valor em dolar
        while(!entradaValida){
            try {
                System.out.print("Digite o valor em dolares: ");
                valor = sc.nextDouble();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Valor invalido!");
                sc.nextLine();
            }
        }
        entradaValida = false;

        // lendo cotacao
        while(!entradaValida){
            try{
                System.out.print("Digite a cotacao do dolar: ");
                cotacao = sc.nextDouble();
                entradaValida = true;
            }catch(Exception e){
                System.out.println("Valor invalido!");
                sc.nextLine();
            }
        }

        System.out.printf("Valor convertido é: " + dolarConverter(valor, cotacao));
        sc.close();
    }

    // retorna o valor convertido
    public static double dolarConverter(double valor, double cotacao) {
        return valor * cotacao;
    }
}
