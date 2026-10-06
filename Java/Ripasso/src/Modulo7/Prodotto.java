package Modulo7;

import java.util.Objects;

public class Prodotto {
	public String nome;
	public double prezzo;
	
	public Prodotto(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	@Override 
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Prodotto p)) return false;
		return this.prezzo == p.prezzo && this.nome.equals(p.nome);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(nome, prezzo);
	}
}
