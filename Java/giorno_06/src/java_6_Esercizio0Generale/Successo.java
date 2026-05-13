package java_6_Esercizio0Generale;

public final class Successo extends EsitoOperazione{
	private final String messaggio;
	
	public Successo(String messaggio) {
		this.messaggio = messaggio;
	}
	
	public String getMessaggio() {
		return messaggio;
	}
}
