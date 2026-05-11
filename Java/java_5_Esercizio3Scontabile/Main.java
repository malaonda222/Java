package java_5_esercizio3Scontabile;

public class Main {
	public static void main(String[] args) {
		Scontabile prodottoFisico = new ProdottoFisico();
		prodottoFisico.applicaSconto(60.00);
		
		Scontabile prodottoDigitale = new ProdottoDigitale();
		prodottoDigitale.applicaSconto(12.99);
	}
}
