package java_2;

public class For_while {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			System.out.println("Iterazione " + i);
		}
		
		System.out.println();
		
		int tentativi = 0;
		while (tentativi < 3) {
			System.out.println("Tentativo " + tentativi);
			tentativi++;
		}
	}
}
