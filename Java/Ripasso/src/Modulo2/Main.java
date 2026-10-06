package Modulo2;

public class Main {
	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice(10, 5);
		c.somma(10, 5);
		c.moltiplica(10, 5);
		c.potenza(10, 5);
		c.somma(3.0, 10.9);
		c.somma(3,  4, 6);
	}
}
