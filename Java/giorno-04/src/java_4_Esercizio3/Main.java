package java_4_Esercizio3;

public class Main {
	public static void main(String[] args) {
		
		Studente mario = new Studente(
				"Mario",
				"Rossi",
				"MR001", 
				24.5
		);
		
		Studente anna = new Studente(
				"Anna",
				"Bianchi",
				"AB002",
				17.0
				);
		
		mario.stampaScheda();
		System.out.println(mario.nomeCompleto() + " è promosso? " + mario.isPromosso() + "\n");
		
		anna.stampaScheda();
		System.out.println(anna.nomeCompleto() + " è promossa? " + anna.isPromosso());
	}
}
