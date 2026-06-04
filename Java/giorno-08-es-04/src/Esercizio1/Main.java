package Esercizio1;

public class Main {
	public static void main(String[] args) {
		Classifica classifica = new Classifica();
		
		classifica.aggiungiGiocatore("Mario", 10);
		classifica.aggiungiGiocatore("Luigi", 9);
		
		classifica.controlloEsistenza("Mario");
		classifica.aggiornamentoPunteggio("Mario", 20);
		
		classifica.stampaClassifica();
		
	}
}
