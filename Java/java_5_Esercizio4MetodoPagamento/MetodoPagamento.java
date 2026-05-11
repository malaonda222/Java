package java_5_Esercizio4MetodoPagamento;

public abstract class MetodoPagamento implements Notificabile{
	public abstract void transazione(
			double denaro
			);
	
	public void riceviFattura() {
		System.out.println("Fattura inviata");
	}
}

