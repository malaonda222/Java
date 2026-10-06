package Modulo6;

public class TryCatch {
	public void dividi(int a, int b) {
		int risultato = 0;
		if(b == 0) {
			throw new ArithmeticException("Divisione per zero!");
		}else {
			risultato = a / b;
			System.out.println("Risultato della divisione: " + risultato);
		}
	}
}
