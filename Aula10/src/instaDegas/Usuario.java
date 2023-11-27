package instaDegas;

import java.time.LocalDate;
import java.util.ArrayList;


public class Usuario {
    private int id;
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

    public int getId() {
        return id;
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

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setEmail(String novoEmail) {
        email = novoEmail;
    }

    public void setSenha(String novaSenha) {
        senha = novaSenha;
    }

    public ArrayList<Integer> getIdAmigos() {
        return idAmigos;
    }

    public void novaPostagem(String texto) {
        postagens.add(texto);
        System.out.println("Postagem realizada com sucesso!");
       
    }

    public void listaPostagens() {
        for (int i = 0; i < postagens.size(); i++) {
            System.out.println(postagens.get(i));
        }
       
    }

    public void exibirFeed() {
        //mostrar amigos , quantidade de postes
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Quantidade de amigos: " + idAmigos.size());
        System.out.println("Quantidade de postagens: " + postagens.size());
    }

    public void criarAmizade(int idAmigo) {
        idAmigos.add(idAmigo);
    }

    public boolean logar() {
        Sessao sessao = new Sessao(this);

    }

    public LocalDate dataCadastro() {
        LocalDate data = LocalDate.now();
        return data;
    }



    
}
