package empresaOnibus;

public class PontoParada {
	private String rua;
	private String bairro;
	private int codigoCheckpoint;
	
	public PontoParada(String rua, String bairro, int codigoCheckpoint) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.codigoCheckpoint = codigoCheckpoint;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getCodigoCheckpoint() {
		return codigoCheckpoint;
	}
	public void setCodigoCheckpoint(int codigoCheckpoint) {
		this.codigoCheckpoint = codigoCheckpoint;
	}
	
}
