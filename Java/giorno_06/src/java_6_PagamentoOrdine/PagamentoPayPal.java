package java_6_PagamentoOrdine;

public final class PagamentoPayPal extends MetodoPagamento {
	public String email;
	private final double commissione;
	
	public PagamentoPayPal(String email, double commissione) {
		setEmail(email);
		if (commissione < 0.01 || commissione > 0.5) {
			throw new IllegalArgumentException("Commissione non valida");
		}
		this.commissione = commissione;
	}
	
	public void setEmail(String email) {
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Email non valida");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String descrizione() {
		return super.descrizione() 
				+ "Pagamento Paypal da parte dell'utente "
				+ getEmail();
	}
	
	@Override 
	public double calcolaCommissione(double prezzo) {
		return (prezzo * commissione);
	}
}
