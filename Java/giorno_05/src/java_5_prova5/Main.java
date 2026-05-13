package java_5_prova5;

public class Main {
	public static void main(String[] args) {
		PagamentoCarta pagamento = new PagamentoCarta();
		
		pagamento.paga(100.0);
		pagamento.stampaRicevuta();
		pagamento.inviaNotifica("Pagamento completato");
	}
}
