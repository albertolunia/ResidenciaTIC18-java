package instaDegas;

import java.util.Scanner;
public class RedeSocial {

    private ListaSessao listaSessao = new ListaSessao();
    private ListaUsuarios listaUsuario = new ListaUsuarios();

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
        RedeSocial rs = new RedeSocial();

        Scanner nc = new Scanner(System.in);
        int opcao = 9999, opcaoSessao = 9999;

        do{
            menu();
            System.out.print("\nDigite a opção desejada: ");
            try{
                
                opcao = nc.nextInt();
                nc.nextLine();
                
                switch(opcao){
                    case 1:
                        if(rs.listaUsuario.criarUsuario())
                            System.out.println("Usuário criado com sucesso!");
                        else
                            System.out.println("Erro ao criar usuário");
                        break;
                    case 2:
                        System.out.println("Remove post");
                        break;
                    case 3:
                        System.out.println("Logar");
                        Usuario user = Sessao.autenticar(rs.listaUsuario);
                        if(user != null){
                            Sessao s = Sessao.logar(user);
                            do{
                                menuSessao();
                                System.out.print("\nDigite a opção desejada: ");
                                try{
                                    opcaoSessao = nc.nextInt();
                                    nc.nextLine();
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
                                            System.out.println("\nOpção inválida\n");
                                    }
                                }
                                catch(Exception e){
                                    System.out.println("\nOpção inválida\n");
                                    nc.next();
                                }
                            }while(opcaoSessao != 0);
                        }else{
                            System.out.println("Usuário não encontrado");
                        }

                        break;
                    case 0:
                        System.out.println("\nSaindo...");
                        break;
                    default:
                        System.out.println("\nOpção inválida\n");
                        break;
                }
            }catch(Exception e){
                System.out.println("\nOpção inválida\n");
                nc.next();
            }
        }while(opcao != 0);
    }

    public ListaSessao getListaSessao() {
        return listaSessao;
    }

    public ListaUsuarios getListaUsuario() {
        return listaUsuario;
    }
}
