package java_6_Esercizio5Giorno;

public class Main {

	public static void main(String[] args) {
		Giorno giorno = Giorno.SABATO;
		if(giorno == Giorno.SABATO || giorno == Giorno.DOMENICA) {
			System.out.println("Weekend");
		}else {
			System.out.println("Giorno lavorativo");
		}

	}

}
