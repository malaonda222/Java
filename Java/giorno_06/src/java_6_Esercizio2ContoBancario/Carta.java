package java_6_Esercizio2ContoBancario;

public final class Carta extends Pagamento{
	private final String numeroCarta;
	private final double importo;
	
	public Carta(String numeroCarta, double importo) {
		this.numeroCarta = numeroCarta;
		this.importo = importo;
	}
	
	public String numeroCarta() {
		return numeroCarta;
	}
	
	public double importo() {
		return importo;
	}
}
