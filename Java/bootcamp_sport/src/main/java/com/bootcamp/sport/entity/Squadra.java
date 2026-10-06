package com.bootcamp.sport.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Squadra {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String citta;
	private int annoFondazione;
	
	protected Squadra() {}
	
	public Squadra(String nome, String citta, int annoFondazione
			) {
		setNome(nome);
		setCitta(citta);
		setAnnoFondazione(annoFondazione);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome inserito non valido");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCitta(String citta) {
		if(citta == null || citta.trim().isBlank()) {
			throw new IllegalArgumentException("Citta inserita non valida");
		}
		this.citta = citta;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setAnnoFondazione(int annoFondazione) {
		if(annoFondazione < 1900 || annoFondazione > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Anno di fondazione non valido");
		}
		this.annoFondazione = annoFondazione;
	}
	
	public int getAnnoFondazione() {
		return annoFondazione;
	}
	
}
