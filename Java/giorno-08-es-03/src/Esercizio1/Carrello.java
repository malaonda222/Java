package Esercizio1;

import java.util.*;

public class Carrello {
	private List<Prodotto> prodotti = new ArrayList<>();
	private Set<String> codici = new HashSet<>();
	private Map<String, Prodotto> perCodice = new HashMap<>(); 
	
	
	
	public void aggiungiProdotto(Prodotto p) {
		if(codici.contains(p.nome)) {
			throw new IllegalArgumentException("Prodotto già presente nella lista");
		}
		prodotti.add(p);
		codici.add(p.getCodice());
		perCodice.put(p.getCodice(), p);
	}
	
	public void rimuoviProdotto(String codice) {
		if(!(codici.contains(codice))){
			throw new IllegalArgumentException("Il codice inserito non esiste");
		}
		perCodice.remove(codice);	
	}
	
	public double calcolaTotale() {
		double totale = 0.0;
		for(Prodotto p:prodotti) {
			totale += p.getPrezzo();
		}
		return totale;
	}
	
	public void stampaCarrello() {
		for (Map.Entry<String, Prodotto> entry : perCodice.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
	
}
