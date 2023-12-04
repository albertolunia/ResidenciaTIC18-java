package empresaOnibus;

public class Trecho {
	private PontoParada origem;
	private PontoParada destino;
	private int tempoEstimado;
	public PontoParada getOrigem() {
		return origem;
	}
	public void setOrigem(PontoParada origem) {
		this.origem = origem;
	}
	public PontoParada getDestino() {
		return destino;
	}
	public void setDestino(PontoParada destino) {
		this.destino = destino;
	}
	public int getTempoEstimado() {
		return tempoEstimado;
	}
	public void setTempoEstimado(int tempoEstimado) {
		this.tempoEstimado = tempoEstimado;
	}
	
	
	

}
