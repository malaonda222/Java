package java_6_Esercizio6LivelloAvanzato;

public enum Priorita {
	BASSA(1),
	MEDIA(2),
	ALTA(3);
	
	private final int livello;
	
	Priorita(int livello) {
		this.livello = livello;	
	}
	
	public int getLivello() {
		return livello;
	}
}
