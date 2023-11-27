package aulasSemana2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome, cpf;
	private Date dataNascimento;

	public Cliente(String nome, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Cliente(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = StringParaData(dataNascimento);
	}

	public String getNome() {
		return nome;
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

	public void setNome(String nome) {
		this.nome = nome;
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

	public void MostrarData() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(getDataNascimento()));
	}
	
	public void calcularIdade() {
		Date dataAtual = new Date();
		long diferenca = dataAtual.getTime() - getDataNascimento().getTime();
		long dias = diferenca / (1000 * 60 * 60 * 24);
		long anos = dias / 365;
		System.out.println("Idade: " + anos);
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Alberto", "123456789-00", "14/02/1999");

		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.print("Data de Nascimento: ");
		cliente.MostrarData();
		cliente.calcularIdade();
	}
}
