package instaDegas;

import java.util.Scanner;
public class RedeSocial {
    
    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1 - Novo usuário");
        System.out.println("2 - Remove post");
        System.out.println("3 - Logar");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
    }

    public static void menuSessao(){
        System.out.println("Menu:");
        System.out.println("1 - Listar postagem");
        System.out.println("2 - Criar postagem");
        System.out.println("3 - Criar amizade");
        System.out.println("4 - Desfazer amizades");
        System.out.println("0 - Menu anterior");
    }

    public static void main(String[] args) throws Exception {
        Scanner nc = new Scanner(System.in);
        int opcao = 0;
        int opcaoSessao = 0;

        
        do{
            menu();
            opcao = nc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Novo usuário");
                    break;
                case 2:
                    System.out.println("Remove post");
                    break;
                case 3:
                    System.out.println("Logar");
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);
    }
}
