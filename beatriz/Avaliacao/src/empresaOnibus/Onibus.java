package empresaOnibus;

public class Onibus extends Veiculo{
	private int qtdPassageirosEstudantil;
	private int qtdPassageirosIdoso;
	private int qtdPassageiros;

	public Onibus(String placa, int qtdAcentos, String modelo) {
		super(placa, qtdAcentos, modelo);
		this.qtdPassageiros = 0;
	}
	public void desembarque() {};
	public void embarqueCartao(String tipoCartao) {
		//registra o embarque de acordo com o tipo de cartao
	}
	public void embarque() {};
	
}
