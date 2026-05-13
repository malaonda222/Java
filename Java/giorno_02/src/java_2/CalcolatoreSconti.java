package java_2;

public class CalcolatoreSconti{
	public static void main(String[] args) {
		double prezzo = 120.0;
		boolean clientePremium = true;
		double percentualeSconto = 0.0;
		
		if (prezzo > 100 && clientePremium) {
			percentualeSconto = 0.20;
		} else if (prezzo > 100) {
			percentualeSconto = 0.10;
		}
		
		double importoSconto = prezzo * percentualeSconto;
		double prezzoFinale = prezzo - importoSconto;
		
		System.out.println("Prezzo iniziale: " + prezzo);
		System.out.println("Sconto applicato: " + percentualeSconto);
		System.out.println("Prezzo finale: " + prezzoFinale);
	}
}