package java_2;

public class If_elseif_else {
	public static void main(String[] args) {
		int voto = 27;
		
		if(voto < 18) {
			System.out.println("Insufficiente");
		}else if(voto < 24) {
			System.out.println("Sufficiente");
		}else if(voto < 28) {
			System.out.println("Buono");
		}else {
			System.out.println("Ottimo");
		}
	}
}
