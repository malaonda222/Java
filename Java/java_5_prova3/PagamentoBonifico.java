package java_5_prova3;

public class PagamentoBonifico extends MetodoPagamento {
	
	@Override 
	public void paga(double importo) {
		System.out.println("Pagamento con bonifico: " + importo + " euro");
	}
}
