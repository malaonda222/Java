package it.corsojava;

public class ConfigurazioneApp {
	private final String nomeApplicazione;
	private final String versione;
	private final String ambiente;
	private final int porta;
	
	public ConfigurazioneApp(
			String nomeApplicazione,
			String versione,
			String ambiente,
			int porta) {
		this.nomeApplicazione = nomeApplicazione;
		this.versione = versione;
		this.ambiente = ambiente;
		this.porta = porta;
	}
	
	public String getNomeApplicazione() {
		return nomeApplicazione;
	}
	
	public String getVersione() {
		return versione;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public int getPorta() {
		return porta;
	}
}
