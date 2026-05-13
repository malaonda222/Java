package java_5_prova1;

public class Main {
	public static void main (String[] args) {
		
		// La variabile è di tipo Persona ma contiene un oggetto Studente
		Persona p1 = new Studente(
				"Anna", 
				"Rossi", 
				"S001"
		);
		
		// La variabile è di tipo Persona ma contiene un oggetto Docente
		Persona p2 = new Docente(
				"Luca",
				"Bianchi",
				"Java"
		);
		
		// Java chiama la versione corretta basandosi sull'oggetto reale
		System.out.println(p1.presentati());
		System.out.println(p2.presentati());
		
		System.out.println();
		
		System.out.println(p1.descrizione());
		System.out.println(p2.descrizione());
		
		Persona[] persone = {
			new Studente(
					"Giuseppe", 
					"Violi", 
					"S001"
			),
			
			new Docente(
					"Luca",
					"Bianchi",
					"Java"
			),
			
			new Studente(
					"Mario",
					"Verdi",
					"S002"
			)
		};
		
		for(Persona persona : persone) {
			System.out.println(persona.presentati());
		}
		
	}
}
