package java_5_prova6;

public class Rettangolo extends Forma {
	private double base;
	private double altezza;
	
	public Rettangolo(String colore, String sfumatura, double base, double altezza) {
		super(colore, sfumatura);
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public double area() {
		return base * altezza;
	}	
}
