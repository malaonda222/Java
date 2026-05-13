package java_4_Esercizio4;

public class ContoCorrente {
	private String intestatario;
	private double saldo;
		
	public ContoCorrente(String intestatario, double saldo) {
		setIntestatario(intestatario);
		setSaldo(saldo);
	}
	
	public void setIntestatario(String intestatario) {
		if(intestatario == null | intestatario.trim().isBlank()) {
			throw new IllegalArgumentException("Il nome dell'intestatario non può essere null oppure vuoto");
		}
		this.intestatario = intestatario;
	}
	
	public String getIntestatario() {return intestatario;}
	
	private void setSaldo(double saldo) {
		if(saldo < 0) {
			throw new IllegalArgumentException("Il saldo deve essere maggiore o uguale a 0");
		}
		this.saldo = saldo;
	}
		
	public double getSaldo() {return saldo;}
	
	public void deposita(double importo) {
		if(importo <= 0) {
			throw new IllegalArgumentException("L'importo deve essere maggiore di 0");
		}
		this.saldo += importo;
	}
	
	public void preleva(double importo) {
		if(importo > saldo | importo <= 0) {
			throw new IllegalArgumentException("L'importo inserito non è valido oppure è superiore al saldo");
		}
		this.saldo -= importo;
	}
	
	public boolean puoPrelevare(double importo) {
		if (importo > 0 && importo <= saldo) {
			return true;
		}
		return false;
	}
	
	public void stampaSaldo() {
		System.out.println("Nome intestatario: " + intestatario);
		System.out.println("Saldo attuale: " + saldo + "\n");
	}
}
