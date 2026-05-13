package java_6_Esercizio4Studente;

public record Studente(
		String nome,
		int eta,
		double mediaVoti) {
	
	public boolean isPromosso() {
		return mediaVoti >= 6;
	}
		
	public void stampaDettagli() {
		System.out.println(
				"Nome: " + nome 
				+ " - Età: " + eta 
				+ " - Media voti: " + mediaVoti);
	}
}
