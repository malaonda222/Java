package it.corso;

public class Main {
	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto("Computer", 2000.0);
		Magazzino magazzino1 = new Magazzino();
		try {
			magazzino1.aggiungiProdotto(prodotto1);
			System.out.println("Prodotto inserito correttamente");
		}catch(ProdottoNonValidoException e){
			System.out.println("Errore durante l'inserimento del prodotto nel magazzino");
		}

	}
}
