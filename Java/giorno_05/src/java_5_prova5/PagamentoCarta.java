package java_5_prova5;

public class PagamentoCarta 
	extends MetodoPagamento
	implements Notificabile {
	
	@Override
	public void paga(double importo) {
		System.out.println("Pagamento con carta di " + importo + " euro");
	}
	
	@Override
	public void inviaNotifica(String messaggio) {
		System.out.println("Notifica: " + messaggio);
	}
}
