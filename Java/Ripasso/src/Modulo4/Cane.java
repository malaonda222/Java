package Modulo4;

public class Cane extends Animale implements Nuotatore{
	public String nome;
	
	public Cane(String nome) {
		super(nome);
	};
	
	public void verso() {
		System.out.println("Bau bau");
	}
	
	@Override
	public void nuota(String messaggio) {
		System.out.println("So nuotare!");
	}
	
}
