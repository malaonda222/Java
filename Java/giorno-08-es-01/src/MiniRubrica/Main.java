package MiniRubrica;

public class Main {

	public static void main(String[] args) {
		Contatto mario = new Contatto("Mario", "Bianchi", "mario.bianchi@email.com");
		Contatto lorenzo = new Contatto("Lorenzo", "Verdi", "lorenzo.verdi@email.com");
		Contatto elena = new Contatto("Elena", "Rossi", "elena.rossi@email.com");
//		Contatto elisa = new Contatto("Elisa", "Blu", "elena.rossi@email.com");
		
		Rubrica rubrica = new Rubrica();
		
		rubrica.aggiungiContatto(mario);
		rubrica.aggiungiContatto(lorenzo);
		rubrica.aggiungiContatto(elena);
//		rubrica.aggiungiContatto(elisa);
		
		Contatto trovato = rubrica.cercaPerEmail("mario.bianchi@email.com");
		System.out.println(trovato.getNomeCompleto());
		
		try {
			rubrica.aggiungiContatto(new Contatto("Altro", "Utente", "mario.bianchi@email.com"));
		}catch (IllegalArgumentException e){
			System.out.println("Errore: " + e.getMessage());
		}
		
		
		
	}

}
