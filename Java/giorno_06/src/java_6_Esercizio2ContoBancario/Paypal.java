package java_6_Esercizio2ContoBancario;

public final class Paypal extends Pagamento{
	private final String email;
	private final double importo;
	
	public Paypal(String email, double importo) {
		this.email = email;
		this.importo = importo;
	}
	
	public String email() {
		return email;
	}
	
	public double importo() {
		return importo;
	}
}
