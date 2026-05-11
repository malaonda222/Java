package java_5_prova2;

public class Docente extends Persona {
	private String materia;
		
	public Docente(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.materia = materia;
	}
	
	public String presentati() {
		return "Sono il docente " 
				+ getNomeCompleto()
				+ ", materia "
				+ materia;
	}
}
