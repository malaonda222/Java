package it.corsojava;

public class Ordine {
	private String codice;
	private String cliente;
	private double totale;
	
	public Ordine(
			String codice,
			String cliente,
			double totale) {
		this.codice = codice;
		this.cliente = cliente;
		this.totale = totale;
	}
	
	public String getCodice() {return codice;}
	public String getCliente() {return cliente;}
	public double getTotale() {return totale;}
}
