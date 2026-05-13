package java_6_PagamentoOrdine;

public final class PagamentoCarta extends MetodoPagamento{
	public String ultimeCifre;
	private final double commissione;
	
	
	public PagamentoCarta(String ultimeCifre, double commissione) {
		setUltimeCifre(ultimeCifre);
		if(commissione < 0.01 || commissione > 0.5) {
			throw new IllegalArgumentException("Commissione non valida");
		}
		this.commissione = commissione;
	}
	
	public void setUltimeCifre(String ultimeCifre) {
		if(ultimeCifre == null || ultimeCifre.length() != 4) {
			throw new IllegalArgumentException("Ultime cifre della carta non valide");
		}
		this.ultimeCifre = ultimeCifre;
	}
	
	public String getUltimeCifre() {
		return ultimeCifre;
	}
	
	@Override
	public String descrizione() {
		return super.descrizione() 
				+ "Carta di credito - Numero di carta: " 
				+ getUltimeCifre();
	}
	
	@Override
	public double calcolaCommissione(double prezzo) {
		return (prezzo * (commissione/100.0));
	}
}
