package instaDegas;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Integer> idAmigos;
    private ArrayList<String> postagens;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        idAmigos = new ArrayList<Integer>();
        postagens = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public ArrayList<Integer> getIdAmigos() {
        return idAmigos;
    }

    public void novaPostagem(String texto) {
       
    }

    public void elistaPostagens() {
       
    }

    public void exibirFeed() {
        //mostrar amigos , quantidade de postes
    }

    public void criarAmizade(int idAmigo) {
        idAmigos.add(idAmigo);
    }



    
    
}
