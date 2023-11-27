package instaDegas;

import java.util.Scanner;
public class RedeSocial {
    private ListaSessao listaSessao;
    private ListaUsuarios listaUsuario;
    
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
