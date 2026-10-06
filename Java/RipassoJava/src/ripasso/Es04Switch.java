package ripasso;

public class Es04Switch {

	public static void main(String[] args) {
		int giorno = 3;
		char livello = 'B';
		
		switch (giorno) {
			case 1:
				System.out.println("Lunedì");
				break;
			case 2:
				System.out.println("Martedì");
				break;
			case 3:
				System.out.println("Mercoledì");
				break;
			case 4: 
				System.out.println("Giovedì");
				break;
			case 5:
				System.out.println("Venerdì");
				break;
			case 6:
				System.out.println("Sabato");
				break;
			case 7:
				System.out.println("Domenica");
				break;
			default:
				System.out.println("Giorno non valido");
		}
		
		switch (livello) {
		case 'A':
			System.out.println("Eccellente");
			break;
		case 'B':
			System.out.println("Buono");
			break;
		case 'C':
			System.out.println("Sufficiente");
			break;
		default:
			System.out.println("Non valido");
		}

	}

}
