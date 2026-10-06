package ripasso;

public class Numero {
	
	private int valore;
	
	public Numero(int valore) {
		this.valore = valore;
	}
	
	public boolean isPari() {
		if (valore % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isPositivo() {
		if (valore > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int sommaFinoA() {
		if (valore <= 0) {
			return 0;
		}
		int somma = 0;
		for (int i=1; i<=valore; i++) {
			somma += i;
		}
		return somma;
		};
		
	public long fattoriale() {
		if (valore < 0) {
			return -1;
		}
		if(valore == 0) {
			return 1;
		}
		long risultato = 1;
		for(int i=1; i <=valore; i++) {
			risultato *= i;
		}
		return risultato;
		}

	public static void main(String[] args) {
		Numero n6 = new Numero(6);
		System.out.println(n6.isPari());
		System.out.println(n6.isPositivo());
		System.out.println(n6.sommaFinoA());
		System.out.println(n6.fattoriale());
	}

}
