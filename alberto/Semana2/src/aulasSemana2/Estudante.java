package aulasSemana2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudante {
	private String nome, cpf;
    private Date dataNascimento;

    public Estudante(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Estudante(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = StringParaData(dataNascimento);
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

    public static Date StringParaData(String data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;

        try {
            dataNascimento = formatador.parse(data);
        } catch (Exception e) {
            System.out.println("Erro ao converter data");
        }

        return dataNascimento;
    }

	public static void MostrarDate(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatador.format(data));
    }

    public void MostarDados(Estudante estudante) {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.print("Data de Nascimento: ");
        MostrarDate(getDataNascimento());
    }

    public static void calcularIdade(Date dataNascimento) {
        Date dataAtual = new Date();
        long diferenca = dataAtual.getTime() - dataNascimento.getTime();
        long diferencaEmAnos = (diferenca / (1000l * 60 * 60 * 24 * 365));
        System.out.println("Idade: " + diferencaEmAnos);
    }

    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", "123456789-00", new Date());
        Estudante estudante2 = new Estudante("Alberto", "123456789-00", "14/02/1999");

        MostrarDate(estudante.dataNascimento);
        MostrarDate(estudante2.dataNascimento);

        estudante.MostarDados(estudante);

        calcularIdade(estudante2.dataNascimento);

    }
}
