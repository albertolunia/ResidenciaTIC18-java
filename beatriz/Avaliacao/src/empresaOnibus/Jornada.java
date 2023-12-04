package empresaOnibus;

public class Jornada {
	private Trajeto trajetoCompleto;
	private Motorista motorista;
	private Cobrador cobrador;
	private int status; //iniciada ou encerrada
	private Onibus onibus;
	private String horaInicio;
	private String horaFinal;
	//pega a hora que o metodo foi executado
	public void finalizaJornada() {
		//finaliza a jornada e coloca a hora Final
	};
	
	
	public void iniciaJornada(Trajeto trajetoCompleto, Motorista motorista, Cobrador cobrador, Onibus onibus) {
		//pega a hora que o metodo foi executado e registra na horaInicial
	}
	public void iniciaJornada(Trajeto trajetoCompleto, Motorista motorista, Onibus onibus) {
		//inicia jornada sem cobrador
	}
	
	
	
	

}
