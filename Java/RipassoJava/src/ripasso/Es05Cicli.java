package ripasso;

public class Es05Cicli {

	public static void main(String[] args) {
		for(int i=1; i<= 10; i++) {
			System.out.println("7 x " + i + " = " + (7 * i)); 
		}
		
		int i = 1;
		int somma = 0;
		while(i <= 10) {
			somma += i;
			i++;
		System.out.println("Somma totale: " + somma);
		}
		
		
		for(int k = 5; k >= 1; k--) {
			System.out.println(k);
		}
		System.out.println("Via");
		
		for(int j = 1; j <= 20; j ++) {
			if(j % 2 == 0) {
				System.out.println(j);
			}
		}
	}

}
