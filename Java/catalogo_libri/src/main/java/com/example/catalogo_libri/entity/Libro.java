package com.example.catalogo_libri.entity;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //dichiara che questa classe è gestita da JPA. Hibernate crea e gestisce la tabella 
public class Libro {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titolo;
	private String autore;
	
	@Enumerated(EnumType.STRING)
	private CategoriaLibro categoria;
	
	private int pagine;
	private BigDecimal prezzo;
	
	protected Libro() {} //costruttore vuoto viene usato da Hibernate quando crea l'entità
	
	public Libro(String titolo, String autore, CategoriaLibro categoria,
			int pagine, BigDecimal prezzo) {
		setTitolo(titolo);
		setAutore(autore);
		setCategoria(categoria);
		setPagine(pagine);
		setPrezzo(prezzo);
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
	
	public void setPrezzo(BigDecimal prezzo) {
		if(prezzo.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Il prezzo non può essere inferiore a 0");
		}
		this.prezzo = prezzo;
	}
	
	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public Long getId() {
		return id;
	}

	public boolean isCostoso(BigDecimal soglia) {
		return this.getPrezzo().compareTo(soglia) > 0;
	}
}
