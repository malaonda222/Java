package java_6_Esercizio2ContoBancario;

public final class Bonifico extends Pagamento {
	private final String IBAN;
	private final double importo;
	
	public Bonifico(String IBAN, double importo) {
		this.IBAN = IBAN;
		this.importo = importo;
	}
	
	public String IBAN() {
		return IBAN;
	}
	
	public double importo() {
		return importo;
	}
}
