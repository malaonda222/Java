package Esercizio1;

import java.util.Objects;

public class Prodotto {
	public String nome;
	public double prezzo;
	public String codice;
	
	public Prodotto(String nome, double prezzo, String codice) {
		setNomeProdotto(nome);
		setPrezzoProdotto(prezzo);
		setCodiceProdotto(codice);
	}
	
	public void setNomeProdotto(String nome) {
		if (nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome inserito non valido");
		}
		this.nome = nome;
	}
	
	public void setPrezzoProdotto(double prezzo) {
		if (prezzo <= 0) {
			throw new IllegalArgumentException("Prezzo non valido");
		}
		this.prezzo = prezzo;
	}
	
	public void setCodiceProdotto(String codice) {
		if(!(codice instanceof String)){
			throw new IllegalArgumentException("Codice del prodotto già esistente.");
		}
		this.codice = codice;
	}
	
	
	public String getNomeProdotto() {
		return nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String getCodice() {
		return codice;
	}
	
	@Override
	public String toString() {
		return nome + prezzo + codice;
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(codice);
	}
	
	@Override 
	public boolean equals(Object c) {
		if (this == c) return true;
		if(!(c instanceof Prodotto altro)) return false;
		return Objects.equals(this.codice, altro.codice);
	}
}
