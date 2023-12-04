package empresaOnibus;

public abstract class Pessoa {
	private String nome;
	private int CPF;
	
	public Pessoa(String nome, int cPF) {
		this.nome = nome;
		this.CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	
}
