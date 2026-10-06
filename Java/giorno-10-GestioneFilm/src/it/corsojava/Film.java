package it.corsojava;

public class Film {
	private String titolo;
	private String genere;
	private double voto;
	
	public Film(
			String titolo,
			String genere,
			double voto) {
		this.titolo = titolo;
		this.genere = genere;
		this.voto = voto;
	}
	
	public String getTitolo() {return titolo;}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getGenere() {return genere;}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public double getVoto() {return voto;}
	
	public void setVoto(double voto) {
		this.voto = voto;
	}
}
