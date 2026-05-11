package java_5_prova5;

public abstract class MetodoPagamento {
	public abstract void paga(
			double importo
	);
	
	public void stampaRicevuta() {
		System.out.println("Ricevuta generata");
	}
}
