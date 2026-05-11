package java_5_esercizio3Scontabile;

public class ProdottoDigitale implements Scontabile {
	
	@Override 
	public void applicaSconto(double prezzo) {
		if(prezzo > 40.00) {
			System.out.println("Prodotto digitale scontato al 20%: " 
					+ (prezzo * (1 - 0.20)));
		}else {
			System.out.println("Attenzione: su questo prodotto non viene applicato nessuno sconto!");
		}
	}
}
