package java_2;

public class Laboratorio2 {
	public static void main(String[] args) {
		int voto1 = 18;
		int voto2 = 20;
		int voto3 = 17;
		int voto4 = 30;
		int voto5 = 27;
		
		double somma = voto1 + voto2 + voto3 + voto4 + voto5;
		double media = somma / 5;
		
		if (media < 22) {
			System.out.println("Insufficiente");
		}else if (media >= 22 && media <= 25) {
			System.out.println("Sufficiente");
		}else if (media >= 26 && media <= 28) {
			System.out.println("Buono");
		}else {
			System.out.println("Ottimo");
		}
		
	}
}
