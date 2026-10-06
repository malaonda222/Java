package Modulo6;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {
			int risultato = a / b;
			System.out.println("Risultato: " + risultato);
		}catch (ArithmeticException e) {
			System.out.println("Errore: " + e.getMessage());
		}finally {
			System.out.println("Operazione avvenuta");
		}
		
		try {
		Persona p1 = new Persona("Mario", -1);
		System.out.println(p1.nome + " " + p1.eta);
		
		Persona p2 = new Persona("Eleonora", 44);
		System.out.println(p2.nome + " " + p2.eta);
		
		}catch(EtaNonValidaException e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}
}
