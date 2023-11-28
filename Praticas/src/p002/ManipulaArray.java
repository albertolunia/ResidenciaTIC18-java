package p002;

import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    private int[] array;

    // criando um objeto Random
    private long seed = System.currentTimeMillis();
    private Random rand = new Random(seed);

    //main
    public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);
        ManipulaArray ma = new ManipulaArray(sc); // criando objeto da classe


        // imprimindo resultados
        System.out.println("\nArray: " + ma.toString() + "\n");
        System.out.println("Soma do array: " + ma.somaArray());
        System.out.println("Maior valor do array: " + ma.maiorValor());
        System.out.println("Menor valor do array: " + ma.menorValor());

        sc.close();
    }

    // constructors
    public ManipulaArray(Scanner sc) {
        int tamanho=0;
        int opcao=0;
        boolean entradaValida = false;
        
        do{
            try{
                System.out.print("Digite o tamanho do array: ");
                tamanho = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch(Exception e){
                System.out.println("Valor invalido!");
                sc.nextLine();
            }
        }while(!entradaValida);
        entradaValida = false;
        
        do{
            System.out.println("\n1. Digite valores manualmente."+
            "\n2. Inicie valores aleatoriamente. ");

            do{
                try{
                    System.out.print("Digite a opcao: ");
                    opcao = sc.nextInt();
                    entradaValida = true;
                    sc.nextLine();
                } catch(Exception e){
                    System.out.println("Valor invalido!");
                    sc.nextLine();
                }
            }while(!entradaValida);

            // inciando array de acordo com a opcao
            if(opcao == 1)
                iniciarManual(tamanho, sc);
            else if(opcao == 2)
                iniciarAleatorio(tamanho, -500, 500);
            else
                System.out.println("Opcao invalida!");
        }while(opcao != 1 && opcao != 2);
    }

    // iniciando array aleatoriamente sem limites
    private void iniciarAleatorio(int tamanho){
        array = new int[tamanho];
        
        // limites de int: -2147483648 a 2147483647
        for (int i = 0; i < tamanho; i++) {
            array[i] = rand.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        
    }

    // iniciando array aleatoriamente com limites
    private void iniciarAleatorio(int tamanho, int min, int max){
        array = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            array[i] = rand.nextInt(min, max+1);
        }
        
    }
    
    // iniciando array manualmente
    private void iniciarManual(int tamanho, Scanner sc){
        array = new int[tamanho];
        boolean entradaValida = false;

        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            do{
                try{
                    System.out.printf("Digite o "+ i+"º valor: ");
                    array[i] = sc.nextInt();
                    entradaValida = true;
                }catch(Exception e){
                    System.out.println("Valor invalido!");
                    sc.nextLine();
                }
            }while (!entradaValida);
        }
        sc.nextLine();

        System.out.println();
        
    }

    // retorna a soma dos valores do array
    public int somaArray(){
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }

    // retorna o maior valor do array
    public int maiorValor(){
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maior)
                maior = array[i];
        }
        return maior;
    }

    // retorna o menor valor do array
    public int menorValor(){
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < menor)
                menor = array[i];
        }
        return menor;
    }

    // retorna o array em formato de string
    public String toString(){
        String str = "[";
        
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if(i < array.length - 1)
                str += ", ";
            else
                str += "]";
        }
        return str;
    }

    // getters
    public int[] getArray() {
        return array;
    }

}
