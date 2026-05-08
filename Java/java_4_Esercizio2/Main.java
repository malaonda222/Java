package java_4_Esercizio2;

public class Main {
	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto(
				"Penna",
				"P001",
				1.50,
				100);
		
		Prodotto prodotto2 = new Prodotto(
				"Quaderno",
				"Q001",
				3.20,
				0);
		
		System.out.println("Prodotto n.1: ");
		prodotto1.stampaScheda();
		System.out.println("\nProdotto n.2: ");
		prodotto2.stampaScheda();
		
		prodotto1.applicaSconto(0.10);
		prodotto2.applicaSconto(0.10);
		
		System.out.println("\nIl prodotto è disponibile? " + prodotto1.isDisponibile() + " ");
		System.out.println("Il prodotto è disponibile? " + prodotto2.isDisponibile() + " ");
	}
}
