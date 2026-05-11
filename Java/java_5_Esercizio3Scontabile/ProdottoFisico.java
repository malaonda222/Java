package java_5_esercizio3Scontabile;

public class ProdottoFisico implements Scontabile{
	
	@Override 
	public void applicaSconto(double prezzo) {
		if(prezzo > 40.00) {
			System.out.println(
					"Prodotto fisico scontato al 40%: " + (prezzo * (1 - 0.40))); 
		}else {
			System.out.println("Attenzione: su questo prodotto non viene applicato nessuno sconto!");
		}
}
}