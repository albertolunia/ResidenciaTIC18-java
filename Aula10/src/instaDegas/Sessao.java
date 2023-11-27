package instaDegas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Sessao {
    private int id = 0;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Usuario usuario;

    private static int idSessao = 0;

    public Sessao(Usuario usuario) {
        this.id = criarId();
        this.dataInicio = LocalDate.now();
    }

    public static Sessao logar(Usuario usuario){
        System.out.println("Logando como " + usuario.getNome() + " ...");
        Sessao sessao  = usuario.logar();
        return sessao;
    }

    public static boolean autenticar(ListaUsuarios usuarios){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu email: ");
        String email = sc.nextLine().trim();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        Usuario usuario = usuarios.encontrarUsuario(email);
        if(usuario.getSenha() == senha){
            sc.close();
            return true;
        }else{
            sc.close();
            return false;
        }

    }

    public static int criarId(){
        return idSessao++;
    }

    // getters
    public LocalDate getDataFim() {
        return dataFim;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public int getId() {
        return id;
    }

    // setters
    public void setDataFim(LocalDate dataFim) {
        if(this.dataFim == null)
            this.dataFim = dataFim;

    }

    
}
