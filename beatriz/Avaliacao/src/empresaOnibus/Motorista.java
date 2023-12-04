package empresaOnibus;

public class Motorista extends Pessoa{
	private int codigoMotorista;
	private int CNH;
	public Motorista(String nome, int cPF, int codigoMotorista, int cNH) {
		super(nome, cPF);
		this.codigoMotorista = codigoMotorista;
		CNH = cNH;
	}
	public int getCodigoMotorista() {
		return codigoMotorista;
	}
	public void setCodigoMotorista(int codigoMotorista) {
		this.codigoMotorista = codigoMotorista;
	}
	public int getCNH() {
		return CNH;
	}
	
	
}
