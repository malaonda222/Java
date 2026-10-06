package Modulo4;

public class Gatto extends Animale {
	public String nome;
	
	public Gatto(String nome) {
		super(nome);
	}
	
	public void verso() {
		System.out.println("Miao miao");
	}
}
