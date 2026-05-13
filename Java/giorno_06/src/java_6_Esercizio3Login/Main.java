package java_6_Esercizio3Login;

public class Main {
	public static void main(String[] args) {
		EsitoLogin esito = new LoginRiuscito("Login effettuato con successo");
		
		if (esito instanceof LoginRiuscito l) {
			System.out.println("Successo: " + l.logRiuscito());
		}else if (esito instanceof UtenteBloccato u){
			System.out.println("Utente Bloccato: " + u.messBlocco());;
		}else if (esito instanceof CredenzialiErrate c) {
			System.out.println("Errore: " + c.credenzialiErrate());
		}
	}
}
