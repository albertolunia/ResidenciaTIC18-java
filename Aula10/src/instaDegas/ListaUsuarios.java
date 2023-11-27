package instaDegas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaUsuarios {
    private ArrayList <Usuario> listaUsuarios ;
    

    public ListaUsuarios() {
        listaUsuarios = new ArrayList<>();
    }
    //construtor da clase
    public boolean criarUsuario(){
       Scanner sc = new Scanner(System.in);

       System.out.print("Digite o nome do usuario: ");
       String nome = sc.nextLine();
       System.out.print("Digite o email do usuario: ");
       String email = sc.nextLine();
       System.out.print("Digite a senha de acesso: ");
       String senha = sc.nextLine(); 

        if (encontrarUsuario(email) == null) {
            Usuario u = new Usuario(nome, email, senha);
            listaUsuarios.add(u);
            System.out.println("criado");
            return true;
        } else {
            System.out.println("E-mail inválido ou já existente");
            return false;
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
    public Usuario encontrarUsuario1(int id) {
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
            System.out.println(listaUsuarios.get(i).getEmail()+"-"+email + email.equals(listaUsuarios.get(i).getEmail()));

            if(email.equals(listaUsuarios.get(i).getEmail())){
                return listaUsuarios.get(i);
            }
        }
        
        return null;
    }
}

    

