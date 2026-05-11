package java_5_prova2;

public class Main {
	public static void main(String[] args) {
		
		Persona[] persone = {
				new Studente(
						"Anna", "Rossi", "S001"
						),
				new Docente(
						"Luca", "Bianchi", "Java")
		};
		
		for (Persona persona : persone) {
			System.out.println(persona.presentati());
		}
	}
}
