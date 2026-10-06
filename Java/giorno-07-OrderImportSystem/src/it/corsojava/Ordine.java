package it.corsojava;

public class Ordine {
	private String cliente;
	private String prodotto;
	private int quantita;
	private double prezzoUnitario;
	
	public Ordine(String cliente, String prodotto, int quantita, double prezzoUnitario) {
		setCliente(cliente);
		setProdotto(prodotto);
		setQuantita(quantita);
		setPrezzoUnitario(prezzoUnitario);
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	
	public String getProdotto() {
		return prodotto;
	}
	
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public int getQuantita() {
		return quantita;
	}
	
	public void setPrezzoUnitario(double prezzoUnitario) {
		
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public double getPrezzoUnitario() {
		return prezzoUnitario; 
	}
	
	public double calcolaTotale() {
		return quantita * prezzoUnitario;
	}
	
	public String riepilogo() {
		return String.format(
				"ORDINE IMPORTATO CON SUCCESSO%n" +
			    "------------------------%n" +
			    "Cliente:          %s%n" +
			    "Prodotto:         %s%n" +
			    "Quantità:         %d%n" +
			    "Prezzo unitario:  € %.2f%n" +
			    "Totale:           € %.2f%n" +
			    "------------------------",
			    cliente, prodotto, quantita, prezzoUnitario, calcolaTotale()
		);
	}
}
