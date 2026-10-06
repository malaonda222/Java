package Esercizio1;

public class Main {
	public static void main(String[] args) {
		Carrello carrello = new Carrello();
		
		carrello.aggiungiProdotto(new Prodotto("Telecomando", 33.0, "rteiruj"));
		carrello.aggiungiProdotto(new Prodotto("Portatile", 4000, "gdjflaaa"));
		carrello.aggiungiProdotto(new Prodotto("Scrivania", 50.0, "dghflajs"));
		
		carrello.calcolaTotale();
		
		carrello.stampaCarrello();
	}
}
