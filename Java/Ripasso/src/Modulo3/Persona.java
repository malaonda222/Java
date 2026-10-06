package Modulo3;

public class Persona {
	private String nome;
	private int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome non valido");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEta(int eta) {
		if(eta < 0 || eta > 105) {
			throw new IllegalArgumentException("Età inserita non valida");
		}
		this.eta = eta;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void presentati() {
		System.out.print("Ciao, mi chiamo " + nome + " e ho " + eta + " anni\n");
	}
	
	
}
