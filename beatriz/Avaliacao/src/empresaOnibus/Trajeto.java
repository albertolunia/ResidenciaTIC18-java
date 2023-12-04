package empresaOnibus;

import java.util.ArrayList;

public class Trajeto {
	private ArrayList<Trecho> trechos;
	private ArrayList<String> registroDeParadas;
	private ArrayList<String> registroImprevistos;
	
	public ArrayList<Trecho> getTrecos() {
		return trechos;
	}
	public void setTrecos(ArrayList<Trecho> trecos) {
		this.trechos = trecos;
	}
	
	public ArrayList<String> getRegistroDeParadas() {
		return registroDeParadas;
	}
	public void setRegistroDeParadas(int codigoCheckpoint ) {
	}
	
	//faz a troca e registra o imprevisto
	public void solicitarTrocaMotorista(Motorista motorista) {};
	public void solicitarTrocaCobrador(Motorista motorista) {};
	
	public void registrarImprevisto() {};
	
	//estimar tempo total de um trajeto, para verificar se é viavel
	public static void calculaTempoTotal(ArrayList<Trecho> trechos) {};
	
	

	

}
