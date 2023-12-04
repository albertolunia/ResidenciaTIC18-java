package empresaOnibus;

public class Cobrador extends Pessoa{
	private int codigoCobrador;

	public Cobrador(String nome, int cPF, int codigoCobrador) {
		super(nome, cPF);
		this.codigoCobrador = codigoCobrador;
	}
	
	
}
