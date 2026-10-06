package Modulo5;

public class Main {
	public static void main(String[] args) {
		Persona p1 = new Persona("Maria", 35);
		Persona p2 = new Persona("Carlo", 46);
		
		System.out.println("Nome p1: " + p1.nome());
		System.out.println("Età p2: " + p2.eta());
		
		new Switch("ciao").analizza();
		new Switch(true).analizza();
		new Switch(5).analizza();
		
		
	}
}
