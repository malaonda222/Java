package EserciziBase;

public class Es_2_ContoBancario {
	private double saldo; 
	
	public Es_2_ContoBancario(
			double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double importo) {
		if(importo <= 0) {
			System.out.println("Importo non valido, impossibile effettuare l'operazione");
		}
		else {
		saldo += importo;
		System.out.println("Importo di " + importo + " euro depositato correttamente");
		};
	}
	
	public void preleva(double importo) {
		if(importo <= 0) {
			System.out.println("Importo non valido, impossibile effettuare l'operazione");
		}
		else if (saldo >= importo) {
			saldo -= importo;
			System.out.println("Importo di " + importo + " euro prelevato correttamente");
		}
		else {
			System.out.println("Saldo insufficiente");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public static void main(String[] args) {
		Es_2_ContoBancario contoMio = new Es_2_ContoBancario(0);
		contoMio.deposita(100.0);
		contoMio.preleva(30.0);
		contoMio.preleva(500.0);
		contoMio.getSaldo();
		
		System.out.println("Saldo attuale: " + contoMio.getSaldo());
	}
}


