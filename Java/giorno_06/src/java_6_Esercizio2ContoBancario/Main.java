package java_6_Esercizio2ContoBancario;

public class Main {
	public static void main(String[] args) {
	
	Pagamento pagamento = new Carta("145668899", 1000.0);	
	
	if(pagamento instanceof Carta c) {
		System.out.println("Pagamento con Carta numero " + c.numeroCarta());
	}else if(pagamento instanceof Paypal p) {
		System.out.println("Pagamento con Paypal dell'utente " + p.email());
	}else {
		Pagamento pagamentoBonifico = new Bonifico("IT179393625189009", 190.0);
		if(pagamentoBonifico instanceof Bonifico b) {
			System.out.println("Pagamento con Bonifico " + b.IBAN());
		}
	}
	
	}
}