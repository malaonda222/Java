package java_5_Esercizio1Persona;

public class Main {

	public static void main(String[] args) {
		Persona[] persone = {
				new Studente("Anna", "Bianchi", "AB001"),
				new Docente("Mario", "Rossi", "MR002"),
				new Studente("Gino", "Verdi", "GV003")
		};
		
		for(Persona persona : persone) {
			System.out.println(
				persona.presentati());
		}

	}

}
