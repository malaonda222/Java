package java_4_Esercizio4;

public class Main {
	public static void main(String[] args) {
		
		ContoCorrente mr = new ContoCorrente(
				"Mario Rossi",
				500.0
		);
		
		mr.stampaSaldo();
		mr.deposita(100.0);
		mr.stampaSaldo();
		mr.preleva(40.0);
		mr.stampaSaldo();
		mr.preleva(1000.0);
		mr.stampaSaldo();
	}
}
