package Modulo4;

public class Main1 {
	public static double calcolaArea(Forma f) {
		if(f instanceof Cerchio1 c) { 
			return Math.PI * c.raggio() * c.raggio();
		}else if (f instanceof Rettangolo1 r){ 
			return r.base() * r.altezza();
		}else if (f instanceof Triangolo1 t) {
			return (t.base() * t.altezza()) / 2;
		}else {
			throw new IllegalArgumentException("Forma non riconosciuta");
		}
	}
	
	public static void main(String[] args) {
		Cerchio1 c = new Cerchio1(3.0);
		System.out.println("Area cerchio: " + calcolaArea(c));
		
		Rettangolo1 r = new Rettangolo1(3.5, 9.3);
		System.out.println("Area rettangolo: " + calcolaArea(r));
		
		Triangolo1 t = new Triangolo1(3.6, 3.5);
		System.out.println("Area triangolo: " + calcolaArea(t));
	}
}
