package java_4_Esercizio1;


public class Libro {
	private String titolo;
	private String autore;
	private int pagine;
	private double prezzo;
	
	public Libro() {};
	
	public Libro(String titolo, String autore, 
			int pagine, double prezzo) {
		setTitolo(titolo);
		setAutore(autore);
		setPagine(pagine);
		setPrezzo(prezzo);
	}
	
	public void setTitolo(String titolo) {
		if(titolo == null | titolo.trim().isBlank()) {
			throw new IllegalArgumentException(
					"Il titolo non è corretto o è vuoto");
		}
		this.titolo = titolo;
	}
	
	public String getTitolo() {return titolo;}
	
	public void setAutore(String autore) {
		if(autore == null | autore.trim().isBlank()) {
			throw new IllegalArgumentException(
					"L'autore inserito non è corretto o è vuoto");
		}
		this.autore = autore;
	}
	
	public String getAutore() {return autore;}
	
	public void setPagine(int pagine) {
		if (pagine <= 0) {
			throw new IllegalArgumentException(
					"Il numero di pagine deve essere positivo");				
		}
		this.pagine = pagine;
	}
	
	public int getPagine() {return pagine;}
	
	public void setPrezzo(double prezzo) {
		if (prezzo < 0) {
			throw new IllegalArgumentException(
					"Il prezzo non può essere negativo");
		}
		this.prezzo = prezzo;
	}
	
	public void stampaDettagli() {
		System.out.println(titolo + " - " + autore);
		System.out.println("Pagine: " + pagine);
		System.out.println("Prezzo: " + prezzo + "\n");
	}
	
	public boolean isCostoso() {
		return prezzo > 50.00;
	}

}







