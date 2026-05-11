package java_5_prova3;

public class PagamentoCarta extends MetodoPagamento {
	
	@Override
	public void paga(double importo) {
		System.out.println("Pagamento con carta: " + importo + " euro");
}
}
