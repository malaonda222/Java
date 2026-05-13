package java_6_Esercizio1StudenteDto;

public class Main {
	public static void main(String[] args) {
		LivelloStudente livello = LivelloStudente.JUNIOR;
		LivelloStudente livello_persona1 = LivelloStudente.AVANZATO;
		StudenteDto studente = new StudenteDto("Marco", "Rossi", 17);
		
		System.out.println("Lo studente è promosso? " + studente.isPromosso());
		
		String messaggio = switch(livello) {
		case JUNIOR -> "Livello principiante";
		case INTERMEDIO -> "Livello intermedio";
		case AVANZATO -> "Livello avanzato";
		};
		
		String messaggio1 = switch(livello_persona1) {
		case JUNIOR -> "Livello principiante";
		case INTERMEDIO -> "Livello intermedio";
		case AVANZATO -> "Livello avanzato";
		};
		
		
		
		System.out.println(messaggio);
		System.out.println(messaggio1);
	}
}
