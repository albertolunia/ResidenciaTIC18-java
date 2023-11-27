package instaDegas;

import java.util.ArrayList;

public class ListaUsuarios {
    private ArrayList <Usuario> listaUsuarios = new ArrayList<>();

    //construtor da clase
    public Usuario criarUsuario(){
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite o nome do usuario");
       String nome = sc.nextLine();
       System.out.println("Digite o email do usuario");
       String email = sc.nextLine();
       System.out.println("Digite a senha de acesso");
       String senha = sc.nextLine(); 

        if (encontrarUsuario(email) == null) {
            Usuario u = new Usuario(nome, email, senha);
            listaUsuarios.add(u);
        } else {
            System.out.println("E-mail inválido ou já existente");
    }

    }

    public Usuario removerUsuario(int id) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (id == listaUsuarios.get(i).getId()) {
                return listaUsuarios.remove(i);
            }
        }
        return null;
    }
    

    //func localizar user por id
    public Usuario encontrarUsuario(int id) {
        for(int i = 0; i < listaUsuarios.size(); i++){
        if(id == listaUsuarios.get(i).getId()){
            return listaUsuarios.get(i);
        }
    }
        return null;
    }

    //func localizar user por email
    public Usuario encontrarUsuario(String email) {
        for(int i = 0; i < listaUsuarios.size(); i++){
            if(email == listaUsuarios.get(i).getEmail()){
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    

