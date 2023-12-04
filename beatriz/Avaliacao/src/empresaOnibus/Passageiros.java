package empresaOnibus;

public class Passageiros extends Pessoa{
	private String tipoCartao; //estudantil, de idoso ou de transporte

	public Passageiros(String nome, int cPF, String tipoCartao) {
		super(nome, cPF);
		this.tipoCartao = tipoCartao;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	
	

}
