package Modulo2;

public class Calcolatrice {
	public int a;
	public int b;
	
	public Calcolatrice(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void somma(int a, int b) {
		System.out.println("Somma: " + (a+b));
	}
	
	public void moltiplica(int a, int b) {
		System.out.println("Moltiplicazione: " + (a*b));
	}
	
	public void potenza(int a, int b) {
		System.out.println("Potenza: " + (int) Math.pow(a, b));
	}
	
	public void somma(double a, double b) {
		System.out.println("Somma decimali: " + (a + b));
	}
	
	public void somma(int a, int b, int c) {
		System.out.println("Somma tre interi: " + (a + b + c));
	}
}
