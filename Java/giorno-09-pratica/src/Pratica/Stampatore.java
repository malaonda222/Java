package Pratica;

public class Stampatore {
	public static <T> void stampa(T valore) {
		System.out.println("Valore: " + valore);
	}
	
	public static <T> T identita(T valore) {
		return valore;
	}
}
