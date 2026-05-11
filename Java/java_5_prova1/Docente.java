package java_5_prova1;

public class Docente extends Persona {
	private String materia;
	
	public Docente(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.materia = materia;
	}
	
	@Override
	public String descrizione() {
		return super.descrizione() + " | Materia: " + materia;
	}
	
	@Override
	public String presentati() {
		return "Sono una docente che insegna " + materia;
	}
}

