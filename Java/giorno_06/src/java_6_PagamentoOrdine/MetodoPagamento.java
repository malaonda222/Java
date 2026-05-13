package java_6_PagamentoOrdine;

public sealed abstract class MetodoPagamento
	permits PagamentoCarta, PagamentoPayPal, PagamentoBonifico {
	
	public String descrizione() {
		return "Metodo di pagamento: ";
	}
	
	public abstract double calcolaCommissione(double prezzo);
}
