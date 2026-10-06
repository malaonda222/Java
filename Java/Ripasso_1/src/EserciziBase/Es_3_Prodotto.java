package EserciziBase;

public class Es_3_Prodotto {
	private String nome;
	private double prezzo;
	private int quantita;
	
	public Es_3_Prodotto(String nome, double prezzo, int quantita){
			this.nome = nome;
			this.prezzo = prezzo;
			this.quantita = quantita;
	}
	
	public void aggiungiScorte(int numero) {
		if (numero <= 0) {
			System.out.println("Errore");
		}
		else {
			quantita += numero;
			System.out.println("Quantità aumentata a " + quantita);
		}
	}
	
	public boolean vendi(int numero) {
		if (numero <= 0) {
			System.out.println("Errore, valore non valido");
			return false;
		}else if (numero > quantita){
			System.out.println("Errore, quantità insufficiente");
			return false;
		}else {
			quantita-=numero;
			return true;
		}
	}
	
	public int getQuantita() {
		return quantita;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double calcolaValoreMagazzino() {
		return (prezzo * quantita);
	}
	
	
	public static void main(String[] args) {
		Es_3_Prodotto p = new Es_3_Prodotto("Tastiera", 25.50, 10);
		System.out.println("Quantità di partenza: " + p.getQuantita());
		System.out.println("Nome del prodotto: " + p.getNome());
		System.out.println();

		p.aggiungiScorte(5);
		System.out.println("Quantità aggiornata: " + p.getQuantita());
		System.out.println();
		
		p.vendi(4);
		System.out.println("Quantità aggiornata a: " + p.getQuantita());
		p.getQuantita();
		
		
		if(p.vendi(50)) {
			System.out.println("Vendita riuscita");
		}else {
			System.out.println("Vendita non riuscita");
		}
		
		System.out.println();
		System.out.println("Quantità: " + p.getQuantita());
		System.out.println("Valore magazzino: " + p.calcolaValoreMagazzino());
	}
	
	
}
