package java_5_prova4;

public class SmsService implements Notificabile{
	
	@Override
	public void inviaNotifica(
			String messaggio
		) {
		System.out.println("SMS inviato: " + messaggio);
	}
}
