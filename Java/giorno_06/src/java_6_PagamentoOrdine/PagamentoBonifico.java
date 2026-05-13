package java_6_PagamentoOrdine;

public final class PagamentoBonifico extends MetodoPagamento {
	private String IBAN;
	private final double commissione;
	
	public PagamentoBonifico(String IBAN, double commissione) {
		setIBAN(IBAN);		
		if(commissione < 0.01 || commissione > 0.5) {
			throw new IllegalArgumentException("Commissione non valida");
		}
		this.commissione = commissione;
	}
	
	public void setIBAN(String IBAN) {
		if(IBAN == null || IBAN.length() != 27) {
			throw new IllegalArgumentException("IBAN non valido");
		}
		this.IBAN = IBAN;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	@Override 
	public String descrizione() {
		return super.descrizione() 
				+ "Pagamento Bonifico con IBAN numero: "
				+ getIBAN();
	}
	
	@Override 
	public double calcolaCommissione(double prezzo) {
		return (prezzo * commissione);
	}

}
