package java_2;

public class Laboratorio1 {
	public static void main(String[] args) {
		double prezzo = 110.00;
		double percentualeSconto = 0.30;
		boolean clientePremium = false;
		
		if (prezzo < 100 && clientePremium) {
			System.out.println("Sconto 20%");
			double importoSconto = (prezzo * percentualeSconto);
			System.out.println("Importo sconto: " + importoSconto);
		}else if (prezzo > 100 && !clientePremium) {
			System.out.println("Sconto 10%");
			double importoSconto = (prezzo * percentualeSconto);
			System.out.println("Importo sconto: " + importoSconto);
		}else if (prezzo <= 100) {
			System.out.println("Nessuno sconto");
		}
		
		System.out.println("Prezzo iniziale: " + prezzo);
		System.out.println("Percentuale sconto applicata: " + percentualeSconto);
		System.out.println("Prezzo finale: " + (prezzo * (1 - percentualeSconto)));
	}
}
