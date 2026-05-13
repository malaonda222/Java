package java_6_Esercizio3Login;

public final class LoginRiuscito extends EsitoLogin{
	private final String logRiuscito;
	
	public LoginRiuscito(String logRiuscito) {
		this.logRiuscito = logRiuscito;
	}
	
	public String logRiuscito() {
		return logRiuscito;
	}
}
