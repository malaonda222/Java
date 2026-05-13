package java_6_Esercizio6Livello;

public class Main {

	public static void main(String[] args) {
		Livello statoLivello = Livello.BASSO;
		
		String messaggio = switch(statoLivello){
			case BASSO -> "Richio basso";
			case MEDIO -> "Rischio medio";
			case ALTO -> "Pericolo!";
		};
		
		System.out.println(messaggio);
	}

}
