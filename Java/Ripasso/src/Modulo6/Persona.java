package Modulo6;

public class Persona {
	public String nome;
	public int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		if(eta < 0 || eta > 150) {
			throw new EtaNonValidaException("Età inserita non valida");
		}
		this.eta = eta;
	}
	
	
}
