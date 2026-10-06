package Modulo4;

public record Cerchio(double raggio) implements Calcolabile{
	public double calcolaValore() {
		return (Math.PI * raggio * raggio);
	}
	
}
