package ripasso;

public class Es03Condizioni {
	public static void main(String[] args) {
		int voto = 28;
		
		if (voto < 18) {
			System.out.println("Insufficiente");
		}else if (voto >= 18 && voto <= 23){
			System.out.println("Sufficiente");
		}else if (voto >= 24 && voto <= 27){
			System.out.println("Buono");
		}else {
			System.out.println("Ottimo");
		}
		
		
		int anni = 20;
		boolean haPatente = true;
		
		System.out.println(anni >= 18 && haPatente);
		System.out.println(anni < 18 || haPatente);
		System.out.println(!haPatente);
		}
	}
