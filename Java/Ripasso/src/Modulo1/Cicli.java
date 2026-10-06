package Modulo1;

public class Cicli {
	public static void stampaTavola() {
		for(int i = 7; i <= 70; i+=7) {
			System.out.println(i);
		}
	}
	
	public static void stampaTavola2() {
		int i = 7;
		while(i <= 70) {
			System.out.println(i);
			i += 7;
		}
	}
	
	public static void main(String[] args) {
		stampaTavola();
		System.out.println();
		stampaTavola2();
	}
}
