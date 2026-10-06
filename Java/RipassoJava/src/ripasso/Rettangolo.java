package ripasso;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double calcolaArea() {
		return (base * altezza);
	}
	
	public double calcolaPerimetro() {
		return (base + altezza) * 2;
	}
	
	public void stampaInfo() {
		System.out.println("Rettangolo base= " + base + "altezza= " + altezza);
	}

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(5.0, 3.0);
		Rettangolo r2 = new Rettangolo(10.0, 2.5);
		
		System.out.println("R1 - Perimetro: " + r1.calcolaPerimetro() + "; Area: " + r1.calcolaArea());
		System.out.println("R2 - Perimetro: " + r2.calcolaPerimetro() + "; Area: " + r2.calcolaArea());

	}

}
