package java_5_prova2;

public class Studente extends Persona {
	private String matricola;
	
	public Studente (String nome, String cognome, String matricola) {
		super(nome, cognome);
		this.matricola = matricola;
	}
	
	@Override
	public String presentati() {
		return "Sono lo studente " 
				+ getNomeCompleto()
				+ ", matricola "
				+ matricola;
	}
}
