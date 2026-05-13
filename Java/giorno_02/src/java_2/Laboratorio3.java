package java_2;

public class Laboratorio3 {
	public static void main(String[] args) {
		int pinCorretto = 2468;
		String ruolo = "user";
		int pin = 2468;
		int tentativi = 1;
		
		while(tentativi <= 3) {
			System.out.println("Tentativo numero: " + tentativi);
			tentativi ++;
			if(pin == pinCorretto && ruolo.equals("admin")) {
				System.out.println("Accesso completo");
			}else if(pin == pinCorretto && ruolo.equals("user")) {
				System.out.println("Accesso limitato");
			}else if(pin == pinCorretto && ruolo.equals("guest")) {
				System.out.println("Accesso ristretto");
			}else{
				System.out.println("Accesso negato, pin non corretto");
			}
		}
	}
}
