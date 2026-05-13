package java_3;

public class Esercizio2_VerificaNumero {
	public static void main(String[] args) {
		boolean numero = isPari(8);
		System.out.println(numero);
		
		String segnoNumero = segno(-9);
		System.out.println(segnoNumero);
		
		boolean multiplo = isMultiplo(10, 5);
		System.out.println(multiplo);
		
		boolean multiplo1 = isMultiplo(10.0, 5.0);
		System.out.println(multiplo1);
	}
	
	public static boolean isPari(int n) {
		if (n%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String segno(int n) {
		if (n > 0) {
			return "Il numero è positivo";
		}else if (n == 0){
			return "Il numero è 0";
		}else {
			return "Il numero è negativo";
		}
	}
	
	public static boolean isMultiplo(int n, int divisore) {
		if (n%divisore == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isMultiplo(double n, double divisore) {
		if (n%divisore == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
