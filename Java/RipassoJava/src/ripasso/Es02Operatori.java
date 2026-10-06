package ripasso;

public class Es02Operatori {

	public static void main(String[] args) {
		int a = 17;
		int b = 5;
		int c = 10;
		
		System.out.println("Somma: " + (a + b));
		System.out.println("Differenza: " + (a - b));
		System.out.println("Prodotto: " + (a * b));
		System.out.println("Divisione reale: " + ((double) a / b));
		
		System.out.println("Dopo ++c: " + c);
		System.out.println("Dopo c+=5: " + (c+=5));
		System.out.println("Dopo c*=2: " + (c*=2));
		System.out.println("Dopo --c: " + (--c));
				

	}

}
