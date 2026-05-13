package java_2;

import java.util.Scanner;

public class Laboratorio4{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean formCorretto = true;
		
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Cognome: ");
		String cognome = scanner.nextLine();
		System.out.println("Email: ");
		String email = scanner.nextLine();
		System.out.println("Password: ");
		String password = scanner.nextLine();
		System.out.println("Età: ");
		int eta = scanner.nextInt();
		scanner.nextLine();
		
		while (true) {
			formCorretto = true;
			//NOME
			if (nome == null || (nome != null && nome.equals(""))) {
				System.out.println("Errore, nome non valido \n");
				formCorretto = false;
				System.out.print("Nome: \n");
                nome = scanner.nextLine();
			}else if (nome.length() < 5) {
				System.out.println("Errore. Nome deve essere lungo almeno 5 caratteri \n");
				formCorretto = false;
				System.out.print("Nome: \n");
                nome = scanner.nextLine();
			}
			
			//COGNOME
			if (cognome == null || (cognome != null && cognome.equals(""))) {
				System.out.println("Errore, cognome non valido");
				formCorretto = false;
				System.out.print("Cognome: ");
	            cognome = scanner.nextLine();
			}else if (cognome.length() < 5) {
				System.out.println("Errore. Cognome deve essere lungo almeno 5 caratteri");
				formCorretto = false;
				System.out.print("Cognome: ");
                cognome = scanner.nextLine();
			}
			
			//EMAIL
			if (email == null || (email != null && email.equals(""))) {
				System.out.println("Errore, email non valida");
				formCorretto = false;
				System.out.print("Email: ");
				email = scanner.nextLine();
			}else{
				if (!email.contains("@")) {
					System.out.println("Email deve contenere @");
					formCorretto = false;
					System.out.print("Email: ");
	                email = scanner.nextLine();
				} else if (email.length() < 5){
					System.out.println("Email troppo corta");
					formCorretto = false;
					System.out.print("Email: ");
                    email = scanner.nextLine();
				}
			}
			
			// PASSWORD
			if (password == null || (password != null && password.equals(""))) {
				System.out.println("Errore, password non corretta");
				formCorretto = false;
				System.out.print("Password: ");
				password = scanner.nextLine();
			}else if (password.length() < 5){
				System.out.println("Errore, password deve essere lunga almeno 5 caratteri");
				formCorretto = false;
				System.out.print("Password: ");
				password = scanner.nextLine();
			}
			
			//ETA
			if (eta <= 0) {
				System.out.println("Errore. Età non valida");
				formCorretto = false;
				System.out.print("Età: ");
				eta = scanner.nextInt();
				scanner.nextLine();
			}
			
			if (formCorretto) {
				System.out.println("Utente inserito con successo! \n");
				break;
			}		
		}
	
		//LOGIN
		boolean accessoCorretto = false;
		for(int i=1; i<=3; i++) {
			System.out.println("Tentativo " + i + ": \n");
			
			System.out.print("Email: ");
			String emailUtente = scanner.nextLine();
			
			System.out.print("Password: ");
			String passwordUtente = scanner.nextLine();
			
			if (!emailUtente.equals(email) || !passwordUtente.equals(password)) {
				System.out.println("Credenziali errate!\n");
			} else {
				accessoCorretto = true;
				break;
			}
		}
		
		//RISULTATO
		if (accessoCorretto) {
			System.out.println("Dati personali: ");
			System.out.println("Nome: " + nome);
			System.out.println("Cognome: " + cognome);
			System.out.println("Email: " + email);
			System.out.println("Eta: " + eta);
		}else {
			System.out.println("Non è stato possibile eseguire l'accesso. Account bloccato.");
		}
					
					
		scanner.close();
	}
}
		
