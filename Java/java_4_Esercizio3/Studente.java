package java_4_Esercizio3;

public class Studente {
	private String nome, cognome, matricola;
	private double mediaVoti;
	
	public Studente(String nome, String cognome, 
			String matricola, double mediaVoti) {
		setNome(nome);
		setCognome(cognome);
		setMatricola(matricola);
		setmediaVoti(mediaVoti);
	}
	
	public void setNome(String nome) {
		if(nome == null | nome.trim().isBlank()) {
			throw new IllegalArgumentException ("Il nome non può essere null oppure vuoto");
		}
		this.nome = nome;
	}
	
	public String getNome() {return nome;}
	
	public void setCognome(String cognome) {
		if(cognome == null | cognome.trim().isBlank()) {
			throw new IllegalArgumentException ("Il cognome non può essere null oppure vuoto");
		}
		this.cognome = cognome;
	}
	
	public String getCognome() {return cognome;}
	
	public void setMatricola(String matricola) {
		if (matricola == null | matricola.trim().isBlank()) {
			throw new IllegalArgumentException ("La matricola non può essere null oppure vuota");
		}
		this.matricola = matricola;
	}
	
	public String getMatricola() {return matricola;}
	
	public void setmediaVoti(double mediaVoti) {
		if(mediaVoti >= 0.0 && mediaVoti <= 30.0) {
			this.mediaVoti = mediaVoti;
		}else {
			throw new IllegalArgumentException ("La media dei voti non è valida");
		}
	}
	
	public double getmediaVoti() {return mediaVoti;}
	
	public String nomeCompleto() {
		return ("Nome e Cognome: " + nome + " " + cognome);
	}
	
	public boolean isPromosso() {
		if(mediaVoti >= 18.0) {
			return true;
		}
		return false;
	}
	
	public void stampaScheda() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Matricola: " + matricola);
		System.out.println("Media voti: " + mediaVoti);
		
	}
}
