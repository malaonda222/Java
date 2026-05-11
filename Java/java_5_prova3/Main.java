package java_5_prova3;

public class Main {
	public static void main(String[] args) {
		MetodoPagamento pagamento = new PagamentoCarta();
	
		pagamento.paga(10.0);
		pagamento.stampaRicevuta();
}
}