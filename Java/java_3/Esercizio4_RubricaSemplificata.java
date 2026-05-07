package java_3;

public class Esercizio4_RubricaSemplificata {
	
	public static void main(String[] args) {
		stampaMenu();
		stampaContatto("Luigi", "+393564892461");
		stampaContatto("Giulia", "+39377290191");
		aggiornaTelefono("393564892461", "34789564789");
		aggiornaTelefono("+39377290191", "+39377290191");
	}
	
	public static String stampaContatto(String nome, String telefono) {
		return ("Nome: " + nome + "Telefono: " + telefono); 
	}
	
	public static void aggiornaTelefono(String telefono, String nuovo) {
		if (telefono.equals(nuovo)) {
			System.out.println("Errore. Numero già aggiornato.");
		}else {
			System.out.println("Numero vecchio: " + telefono + " - aggiornato con il nuovo numero: " + nuovo);
		}
	
	}
	
	public static void stampaMenu() {
		System.out.println("Menu: ");
		System.out.println("1. Stampa Contatto");
		System.out.println("2. Aggiorna Contatto");
	}
}
