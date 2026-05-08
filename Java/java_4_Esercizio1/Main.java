package java_4_Esercizio1;

public class Main {
		
		public static void main(String[] args) {
		
			Libro libroAvventura = new Libro( 
					"Il nome della rosa",
					"Eco",
					502,
					18.90
			);
			
			Libro libroNarrativa = new Libro();
			libroNarrativa.setTitolo("Effective Java");
			libroNarrativa.setAutore("Joshua Bloch");
			libroNarrativa.setPagine(416);
			libroNarrativa.setPrezzo(300.90);
			
			//Stampa dei dettagli
			System.out.println("Libro Avventura");
			libroAvventura.stampaDettagli();
			System.out.println("Libro Narrativa");
			libroNarrativa.stampaDettagli();
			
			//Uso del metodo di dominio
			System.out.println("Libro Avventura è costoso?" 
					+ " " + libroAvventura.isCostoso() + "\n");
			System.out.print("Libro Narrativa è costoso?" 
					+ " " + libroNarrativa.isCostoso() + "\n");
		}
		
	}


