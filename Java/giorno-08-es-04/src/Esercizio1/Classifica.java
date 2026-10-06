package Esercizio1;

import java.util.*;

public class Classifica {
	private Map<String, Integer> gioco = new HashMap<>();
	
	public Classifica() {};
	
	public String aggiungiGiocatore(String giocatore, int punteggio) {
		if(gioco.containsKey(giocatore)) {
			throw new IllegalArgumentException("Il giocatore è già presente nel gioco");
		}
		gioco.put(giocatore, punteggio);
		return "Giocatore " + giocatore + " con punteggio " + punteggio + " inserito correttamente!";
	}
	
	public String aggiornamentoPunteggio(String giocatore, int punteggio) {
		if (!gioco.containsKey(giocatore)){
			throw new IllegalArgumentException("Il giocatore non è presente nel gioco");
		}
		gioco.put(giocatore, punteggio);
		return "Aggiornato punteggio a " + punteggio + " del giocatore " + giocatore;
	}
	
	public void stampaClassifica() {
		for (Map.Entry<String, Integer> entry : gioco.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
	}
	
	public void controlloEsistenza(String giocatore) {
		if(gioco.containsKey(giocatore)) {
			System.out.println(giocatore + " fa parte della classifica");
		}else {
			System.out.println(giocatore + " non fa parte della classifica");
		}
	}
}
