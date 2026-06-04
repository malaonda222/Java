package it.corso;

public class Magazzino {
	
	private Prodotto prodotto;
	
	public void aggiungiProdotto(Prodotto p) {
		if(p == null) {
			throw new ProdottoNonValidoException("Prodotto non valido");
		}

		if (p.getPrezzo() < 0) {
			throw new ProdottoNonValidoException("Prezzo negativo");
		}
		
		this.prodotto = p;
	}
	
	public Prodotto getProdotto() {
		return this.prodotto;
	}
}
