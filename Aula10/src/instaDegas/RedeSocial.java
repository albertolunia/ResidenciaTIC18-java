package instaDegas;

import java.util.Scanner;
public class RedeSocial {
    private ListaSessao listaSessao;
    private ListaUsuarios listaUsuario;

    public static void menu(){
        System.out.println("1 - Novo usuário");
        System.out.println("2 - Remove post");
        System.out.println("3 - Logar");
        System.out.println("0 - Sair");
    }

    public static void menuSessao(){
        System.out.println("1 - Listar postagem");
        System.out.println("2 - Criar postagem");
        System.out.println("3 - Criar amizade");
        System.out.println("4 - Desfazer amizade");
        System.out.println("0 - Menu anterior");

    }
    
    public static void main(String[] args) throws Exception {
        Scanner nc = new Scanner(System.in);
        int opcao = 0, opcaoSessao = 0;

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
                    do{
                        menuSessao();
                        opcaoSessao = nc.nextInt();
                        switch(opcaoSessao){
                            case 1:
                                System.out.println("Listar postagem");
                                break;
                            case 2:
                                System.out.println("Criar postagem");
                                break;
                            case 3:
                                System.out.println("Criar amizade");
                                break;
                            case 4:
                                System.out.println("Desfazer amizade");
                                break;
                            case 0:
                                System.out.println("Menu anterior");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }while(opcaoSessao != 0);
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
