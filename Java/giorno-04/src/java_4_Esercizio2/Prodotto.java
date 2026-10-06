package java_4_Esercizio2;

public class Prodotto {
	private String nome;
	private String codice;
	private double prezzo;
	private int quantitaMagazzino;
	
	public Prodotto(String nome, String codice,
			double prezzo, int quantitaMagazzino) {
		this.nome = nome;
		this.codice = codice;
		setPrezzo(prezzo);
		setquantitaMagazzino(quantitaMagazzino);
	}
	
	public String getNome() {return nome;}

	public String getCodice() {return codice;}
	
	public void setPrezzo(double prezzo) {
		if(prezzo < 0) {
			throw new IllegalArgumentException("Il prezzo non può essere inferiore a 0");
		}
		this.prezzo = prezzo;
	}
	
	public double getPrezzo() {return prezzo;}
	
	public void setquantitaMagazzino(int quantitaMagazzino) {
		if (quantitaMagazzino < 0 ) {
			throw new IllegalArgumentException("La quantità deve essere maggiore di 0");
		}
		this.quantitaMagazzino = quantitaMagazzino;
	}
	
	public int getquantitaMagazzino() {return quantitaMagazzino;}
	
	public boolean isDisponibile() {
		if (quantitaMagazzino > 0) {
			return true;
		}
		return false;
	}
	
	public void applicaSconto(double percentuale) {
		if (percentuale < 0 | percentuale > 100.0) {
			throw new IllegalArgumentException("La percentuale non è valida");
		}
		System.out.println("Prezzo scontato: " + (prezzo*(1-percentuale)));
	}
	
	public void stampaScheda() {
		System.out.println("Nome: " + nome + " - " + codice);
		System.out.println("Prezzo: " + prezzo);
		System.out.println("Quantità disponibile: " + quantitaMagazzino);
	}
}
