package java_5_prova1;

public class Studente extends Persona {
	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		super(nome, cognome);
		this.matricola = matricola;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	@Override
	public String descrizione() {
		return super.descrizione() + " | Matricola: " + matricola;
	}
	
	@Override
	public String presentati() {
		return "Sono uno studente, " + "matricola: " + matricola; 
		}
}

