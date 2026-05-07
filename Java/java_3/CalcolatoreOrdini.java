package java_3;

public class CalcolatoreOrdini {
	double prezzo = 50.0;
	int quantita = 3;
	double percentualeSconto = 0.10;
	double aliquotaIva = 0.22;
	
	double subtotale = calcolaSubtotale(prezzo, quantita);
	double sconto = calcolaSconto(subtotale, percentualeSconto);
	double imponibile = subtotale - sconto;
	double iva = calcolaIva(imponibile, aliquotaIva);
	double totale = calcolaTotale(imponibile, iva);
	
	public static double calcolaSubtotale(double prezzo, int quantita) {
		return prezzo * quantita;
	}
	
	public static double calcolaSconto(double subtotale, double percentualeSconto) {
		return subtotale * percentualeSconto;
	}
	
	public static double calcolaIva(double imponibile, double aliquotaIva) {
		return imponibile * aliquotaIva;
	}
	
	public static double calcolaTotale(double imponibile, double iva) {
		return imponibile + iva;
	}
	
	public static void stampaRicevuta(
		double subtotale, double sconto, double iva, double totale) {
		System.out.println("Subtotale: " + subtotale);
		System.out.println("Sconto: " + sconto);
		System.out.println("IVA: " + iva);
		System.out.println("Totale: " + totale);
	}
}
