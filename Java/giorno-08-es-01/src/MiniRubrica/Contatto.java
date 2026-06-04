package MiniRubrica;

import java.util.Objects;

public class Contatto {
	public String nome, cognome, email;
	
	public Contatto (String nome, String cognome, String email) {
		setNome(nome);
		setCognome(cognome);
		setEmail(email);
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome inserito non valido");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String cognome) {
		if(cognome == null || cognome.trim().isBlank()) {
			throw new IllegalArgumentException("Cognome inserito non valido");
		}
		this.cognome = cognome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setEmail(String email) {
		if (!email.contains("@")){
			throw new IllegalArgumentException("Email non valida");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNomeCompleto() {
		return nome + " " + cognome;
	}
	
	@Override
	public String toString() {
		return this.getNomeCompleto() + email;
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(email);
	}
		

	@Override
	public boolean equals(Object c) {
	    if (this == c) return true;
	    if (!(c instanceof Contatto altro)) return false;
	    return Objects.equals(this.email, altro.email);
}

}
