package java_5_prova6;

public abstract class Forma {
	private String colore;
	
	public Forma (String colore) {
		this.colore = colore;
	}
	
	public abstract double area();
	
	public void descrivi() {
		System.out.println("Sono una forma di colore " + colore);
	}
}
