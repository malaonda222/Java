package java_3;

public class Esercizio1_CalcolatriceConOverloading {
	
	public static void main(String[] args) {
		int sommaInt = somma(10, 5);
		System.out.println("Somma interi: " + sommaInt);
		
		double sommaDouble = somma(5.0, 6.0);
		System.out.println("Somma double: " + sommaDouble);
		
		int sommaIntTre = somma(10, 5, 7);
		System.out.println("Somma interi (3): " + sommaIntTre);
		
		int differenzaInt = differenza(10, 6);
		System.out.println("Differenza interi: " + differenzaInt);
		
		double differenzaDouble = differenza(9.0, 3.0);
		System.out.println("Differenza double: " + differenzaDouble);
		
		int differenzaIntTre = differenza(10, 4, 2);
		System.out.println("Differenza interi (3): " + differenzaIntTre);
		
		int moltiplicazioneInt = prodotto(5, 9);
		System.out.println("Moltiplicazione interi: " + moltiplicazioneInt);
		
		double moltiplicazioneDouble = prodotto(5.0, 9.5);
		System.out.println("Moltiplicazione double:  " + moltiplicazioneDouble);
		
		int moltiplicazioneIntTre = prodotto(5, 9, 10);
		System.out.println("Moltiplicazione interi (3): " + moltiplicazioneIntTre);
	}
	
	public static int somma(int a, int b) {
		return (a + b);
	}
	
	public static double somma(double a, double b) {
		return (a + b);
	}
	
	public static int somma(int a, int b, int c) {
		return (a + b + c);
	}
		
	public static int differenza(int a, int b) {
		return (a - b);
	}
	
	public static double differenza(double a, double b) {
		return (a - b);
	}
	
	public static int differenza(int a, int b, int c) {
		return (a - b - c);
	}
	
	public static int prodotto(int a, int b) {
		return (a * b);
	}
	
	public static double prodotto(double a, double b) {
		return (a * b);
	}
	
	public static int prodotto(int a, int b, int c) {
		return (a * b * c);
	}
}
