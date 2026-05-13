package java_5_prova6;

public abstract class Forma {
	private String colore;
	private String sfumatura;
	
	public Forma (String colore, String sfumatura) {
		this.colore = colore;
		this.sfumatura = sfumatura;
	}
	
	public abstract double area();
	
	public void descrivi() {
		System.out.println("Sono una forma di colore " + colore + "; Sfumatura: " + sfumatura);
	}
}
