package java_5_Esercizio2Veicolo;

public class Moto extends Veicolo {
	private double maxVelocita;
	
	public Moto(String marca, String modello, int anno, double maxVelocita) {
		super(marca, modello, anno);
		this.maxVelocita = maxVelocita;
	}
	
	public double getMaxVelocita() {
		return maxVelocita;
	}
	
	@Override
	public String muoviti() {
		return super.muoviti() + " | Max Velocità: " + getMaxVelocita();
	}
	
	
}
