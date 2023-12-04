package empresaOnibus;

public abstract class Veiculo {
	private String placa;
	private int qtdAcentos;
	private String modelo;
	public Veiculo(String placa, int qtdAcentos, String modelo) {
		super();
		this.placa = placa;
		this.qtdAcentos = qtdAcentos;
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public int getQtdAcentos() {
		return qtdAcentos;
	}
	public void setQtdAcentos(int qtdAcentos) {
		this.qtdAcentos = qtdAcentos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
