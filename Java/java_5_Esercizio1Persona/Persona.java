package java_5_Esercizio1Persona;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNomeCompleto() {
		return "Nome e cognome: " + nome + " " + cognome;
	}
	
	public String presentati() {
		return "Ciao, mi presento, sono " + getNomeCompleto();
	}
}
