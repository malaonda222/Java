package java_5_prova6;

public class Cerchio extends Forma{
	private double raggio;
	
	public Cerchio(String colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	@Override
	public double area() {
		return Math.PI* raggio * raggio;
	}
}
