package java_6_Esercizio3Login;

public final class UtenteBloccato extends EsitoLogin {
	private final String messBlocco;
	
	public UtenteBloccato(String messBlocco) {
		this.messBlocco = messBlocco;
	}
	
	public String messBlocco() {
		return messBlocco;
	}
}
