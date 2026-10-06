package Modulo4;

public abstract class Animale {
	private String nome;
	
	public Animale(String nome) {
		this.nome = nome;
	}
	
	public abstract void verso();
	
	public void presentati() {
		System.out.println("Sono " + nome);
	}
}
