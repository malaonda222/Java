package java_5_Esercizio4MetodoPagamento;

public class PagamentoCarta extends MetodoPagamento implements Notificabile {
	
	@Override 
	public void transazione(double denaro) {
		System.out.println("Pagamento avvenuto con successo: " + denaro + "euro");
	}
	
	@Override 
	public void inviaMessaggio(
			String messaggio) {
		System.out.println("Messaggio inviato: " + messaggio);

	}
}
