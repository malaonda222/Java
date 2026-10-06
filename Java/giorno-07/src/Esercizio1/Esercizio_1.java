package Esercizio1;

public class Esercizio_1 {
	public int numero1;
	public int numero2;
	
	public Esercizio_1(int numero1, int numero2) {
	this.numero1 = numero1;
	this.numero2 = numero2;
	}
	
	public void divisione() {
		try {
			int risultato = numero1/numero2;
			System.out.println("Risultato: " + risultato);	
		}catch (ArithmeticException e){
			System.out.println("Errore: divisione per zero");
		}finally {
			System.out.println("Operazione terminata");
	}
}
	
	}
