package Modulo4;

public record Quadrato(double lato) implements Calcolabile{
	public double calcolaValore() {
		return (lato * 4);
	}
}
