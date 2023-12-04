package empresaOnibus;

public class Onibus extends Veiculo{
	private int qtdPassageiros;

	public Onibus(String placa, int qtdAcentos, String modelo) {
		super(placa, qtdAcentos, modelo);
		this.qtdPassageiros = 0;
	}
	public void desembarque() {};
	public void embarqueCartao(String tipoCartao) {}
	public void embarque() {};
	
}
