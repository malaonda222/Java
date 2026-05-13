package java_6_Esercizio0Generale;

public final class Errore extends EsitoOperazione {
	private final String motivo;
	
	public Errore(String motivo) {
		this.motivo = motivo;
	}
	
	public String getMotivo() {
		return motivo;
	}
}
