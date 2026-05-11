package java_5_prova4;

public class EmailService implements Notificabile {
	
	@Override 
	public void inviaNotifica(String messaggio) {
		System.out.println("Email inviata: " + messaggio);
	}
	
	
	
}
