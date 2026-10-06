package com.bootcamp.sport.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Giocatore {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	private int numeroMaglia;
	private Long squadraId;
	
	@Enumerated(EnumType.STRING)
	private Ruolo ruolo;
	
	protected Giocatore() {}
	
	public Giocatore(String nome, String cognome, int numeroMaglia, Ruolo ruolo, Long squadraId) {
		setNome(nome);
		setCognome(cognome);
		setNumeroMaglia(numeroMaglia);
		setRuolo(ruolo);
		setSquadraId(squadraId);	
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
	
	public void setCognome(String cognome) {
		if(cognome == null || cognome.trim().isBlank()) {
			throw new IllegalArgumentException("Cognome inserito non valido");
		}
		this.cognome = cognome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setNumeroMaglia(int numeroMaglia) {
		if(numeroMaglia < 0 || numeroMaglia > 100) {
			throw new IllegalArgumentException("Numero di maglia non valido");
		}
		this.numeroMaglia = numeroMaglia;
	}
	
	public int getNumeroMaglia() {
		return numeroMaglia;
	}
	
	public void setRuolo(Ruolo ruolo) {
		if(ruolo == null) {
			throw new IllegalArgumentException("Il ruolo è obbligatorio");
		}
		this.ruolo = ruolo;
	}
	
	public Ruolo getRuolo() {
		return ruolo;
	}	
	
	public void setSquadraId(Long squadraId) {
		if(squadraId == null || squadraId < 0) {
			throw new IllegalArgumentException("Id della squadra non valido");
		}
		this.squadraId = squadraId;
	}
	
	public Long getSquadraId() {
		return squadraId;
	}
	
}