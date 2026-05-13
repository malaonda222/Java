package java_6_Esercizio0Generale;

public class Main {
	public static void main(String[] args) {
		
		ProdottoDto prodotto = new ProdottoDto("PC", 1900.0);
		System.out.println(prodotto.nome());
		System.out.println(prodotto.prezzo());
		
		CategoriaProdotto categoria = CategoriaProdotto.ELETTRODOMESTICI;
		
		System.out.println(categoria);
		System.out.println();
		System.out.println(categoria.categoria());
		System.out.println();
		System.out.println("Tutte le categorie:");
		for(CategoriaProdotto cat: CategoriaProdotto.values()) {
			System.out.println(cat + " -> " + cat.categoria());
		}
		System.out.println();
		
		EsitoOperazione esito = new Successo("Prodotto creato con successo");
		if(esito instanceof Successo successo) {
			System.out.println("OK: " + successo.getMessaggio());
		}else if (esito instanceof Errore errore){
			System.out.println("ERRORE: " + errore.getMotivo());
		}
	}
}
