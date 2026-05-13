package java_5_Esercizio4MetodoPagamento;

public class PagamentoPayPal extends MetodoPagamento {
	
	@Override 
	public void transazione(double denaro) {
		System.out.println("Pagamento effettuato con successo con bonifico: " + denaro + " euro");
	}
	
	@Override 
	public void inviaMessaggio(
			String messaggio) {
		System.out.println("Messaggio invitato: " + messaggio); 
	}
}
