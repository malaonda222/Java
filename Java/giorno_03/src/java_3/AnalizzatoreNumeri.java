package java_3;

public class AnalizzatoreNumeri {
	public static void main(String[] args) {
		int n = 10;
		int a = 2;
		int b = 5;
		
	boolean pari = isPari(n);
	boolean positivo = isPositivo(n);
	int max = massimo(a, b);
	int min = minimo(a, b);
	
	stampaReportNumero(pari, positivo, max, min);
		
	}
	public static boolean isPari(int n) {
		if (n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPositivo(int n) {
		if (n>0) {
			return true;
		}else {
			return false;
		}
	}
		
	public static int massimo(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int minimo(int a, int b) {
		if (a<b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void stampaReportNumero(
		boolean pari, boolean positivo, 
		int max, int min) {
		System.out.println("Numero pari: " + pari);
		System.out.println("Numero positivo: " + positivo);
		System.out.println("Numero massimo: " + max);
		System.out.println("Numer minimo: " + min);
	}
}
