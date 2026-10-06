package it.corso.MiniCatalogo.model;

public class Prodotto {
	private Long id;
	private String nome;
	private double prezzo;
	
	//public Prodotto() {};
	
	public Prodotto(Long id, String nome, double prezzo) {
		if (nome==null) {
			throw new IllegalArgumentException("Nome obbligatorio");
		}
		if (prezzo < 0) {
			throw new IllegalArgumentException("Prezzo non valido");
		}
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public Long getId() {return id;}
	public String getNome() {return nome;}
	public double getPrezzo() {return prezzo;}
}
