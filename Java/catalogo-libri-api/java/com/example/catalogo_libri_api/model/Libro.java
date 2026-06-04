package com.example.catalogo_libri_api.model;

import java.time.LocalDate;

public class Libro {
	private Long id;
	private String titolo;
	private String autore;
	public CategoriaLibro categoria;
	public int pagine;
	public double prezzo;
	public LocalDate dataInserimento;
	
	public Libro() {};
	
	public Libro(Long id, String titolo, String autore, CategoriaLibro categoria, 
			int pagine, double prezzo) {
		this.id = id;
		setTitolo(titolo);
		setAutore(autore);
		setCategoria(categoria);
		setPagine(pagine);
		setPrezzo(prezzo);
		this.dataInserimento = LocalDate.now();	
	}
	
	public Long getId() {
		return id;
	}
	
	public void setTitolo(String titolo) {
		if(titolo == null || titolo.trim().isBlank()) {
			throw new IllegalArgumentException("Il titolo è obbligatorio");
		}
		this.titolo = titolo;
	}
		
	public String getTitolo() {
		return titolo;
	}
	
	public void setAutore(String autore) {
		if(autore == null || autore.trim().isBlank()) {
			throw new IllegalArgumentException("L'autore è obbligatorio");
		}
		this.autore = autore;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setCategoria(CategoriaLibro categoria) {
		if(categoria == null) {
			throw new IllegalArgumentException("La categoria è obbligatoria");
		}
		this.categoria = categoria;
	}
	
	public CategoriaLibro getCategoria() {
		return categoria;
	}
	
	public void setPagine(int pagine) {
		if(pagine <= 0 ) {
			throw new IllegalArgumentException("Le pagine non possono essere inferiori o uguali a 0");
		}
		this.pagine = pagine;
	}
	
	public int getPagine() {
		return pagine;
	}
	
	public void setPrezzo(double prezzo) {
		if(prezzo < 0) {
			throw new IllegalArgumentException("Il prezzo non può essere inferiore a 0");
		}
		this.prezzo = prezzo;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public LocalDate getDataInserimento() {
		return dataInserimento;
	}
	
	public void aggiornaDati(String titolo, String autore, CategoriaLibro categoria, int pagine, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.categoria = categoria;
		this.pagine = pagine;
		this.prezzo = prezzo;
	}
	
	public boolean isCostoso(double soglia) {
		if(this.getPrezzo() < soglia) {
			return false;
		}
		return true;
	}
		
	
	@Override
	public String toString() {
		return
				"Titolo: " + titolo
				+ " - Autore: " + autore
				+ " - Categoria: " + categoria
				+ " - Pagine totali: " + pagine
				+ " - Prezzo libro: " + prezzo
				+ " - Data inserimento: " + dataInserimento;
	}
}
