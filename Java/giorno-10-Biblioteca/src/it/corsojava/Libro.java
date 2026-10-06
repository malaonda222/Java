package it.corsojava;

public class Libro {
	private String titolo;
	private String autore;
	private String genere;
	private double prezzo;
	private int pagine;
	
	public Libro(
			String titolo,
			String autore,
			String genere,
			double prezzo,
			int pagine) {
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.prezzo = prezzo;
		this.pagine = pagine;
	}
	
	public String getTitolo() {return titolo;}
	public String getAutore() {return autore;}
	public String getGenere() {return genere;}
	public double getPrezzo() {return prezzo;}
	public int getPagine() {return pagine;}
	
}
