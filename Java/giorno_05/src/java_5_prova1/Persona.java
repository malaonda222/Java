package java_5_prova1;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + cognome;
	}
	
	public String descrizione() {
		return "Persona: " + getNomeCompleto(); 
	}
	
	public String presentati() {
		return "Sono una persona";
	}
}