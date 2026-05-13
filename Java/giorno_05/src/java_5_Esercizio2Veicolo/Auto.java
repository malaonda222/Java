package java_5_Esercizio2Veicolo;

public class Auto extends Veicolo {
	private int posti;
	
	public Auto(String marca, String modello, int anno, int posti) {
		super(marca, modello, anno);
		this.posti = posti;
	}
	
	public int getPosti() {
		return posti;
	}
	
	@Override 
	public String muoviti() {
		return super.muoviti() + " | Posti: " + getPosti();
	}
	
}
