package java_5_prova4;

public class Main {
	public static void main(String[] args) {
		
		Notificabile notifica = new EmailService();
		notifica.inviaNotifica("Pagamento OK");
		
		Notificabile sms = new SmsService();
		sms.inviaNotifica("Conferma ricevuta");
	}
}
