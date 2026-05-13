package java_5_prova2;

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
	
	public String presentati() {
		return "Sono " + getNomeCompleto();
	}
}
