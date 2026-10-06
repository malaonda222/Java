package Modulo1;

public class TipiPrimitivi {
	public static void main(String[] args) {
		int intero = 33;
		double decimale = 3.14;
		boolean booleano = true;
		char carattere = 'C';
		String stringa = "ciao";
	
		System.out.println("Intero: "+ intero);
		System.out.println("Decimale: "+ decimale);
		System.out.println("Booleano: " + booleano);
		System.out.println("Carattere: " + carattere);
		System.out.println("Stringa: " + stringa);
		
		int troncato = (int) decimale;
		System.out.println("Nuovo decimale: " + troncato);
	}
}
