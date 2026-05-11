package java_5_Esercizio1Persona;

public class Docente extends Persona {
	private String materia;
	
	public Docente(String nome, String cognome, String materia) {
	super(nome, cognome);
	this.materia = materia;
	}
	
	@Override 
	public String presentati() {
		return "Sono il docente " 
				+ getNomeCompleto() 
				+ " e insegno " 
				+ materia;
	}
	
}
