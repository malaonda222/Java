package it.corso;

public class Prodotto {
	public String nome;
	public double prezzo;
	
	public Prodotto(String nome, double prezzo) {
		this.nome = nome;
		if(prezzo < 0) {
			throw new ProdottoNonValidoException("Prezzo inserito non valido");
		}
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
}
