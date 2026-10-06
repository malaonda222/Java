package it.corsojava;

public class Studente {
	private String nome;
	private double media;
	private String corso;
	
	public Studente(
			String nome, 
			double media,
			String corso) {
		this.nome = nome;
		this.media = media;
		this.corso = corso;
		
	}
	public String getNome() {return nome;}
	public double getMedia() {return media;}
	public String getCorso() {return corso;}
}
