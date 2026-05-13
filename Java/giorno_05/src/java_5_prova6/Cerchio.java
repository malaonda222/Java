package java_5_prova6;

public class Cerchio extends Forma{
	private double raggio;
	
	public Cerchio(String colore, String sfumatura, double raggio) {
		super(colore, sfumatura);
		this.raggio = raggio;
	}

	@Override
	public double area() {
		return Math.PI* raggio * raggio;
	}
}
