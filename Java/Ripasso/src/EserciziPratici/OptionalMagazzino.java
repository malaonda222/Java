package EserciziPratici;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*Scrivi un metodo cercaProdottoPerNome(List<Prodotto> lista, String nome) che restituisce un 
Optional<Prodotto>. Usa il metodo per trovare un prodotto e stampa il suo prezzo se presente, 
altrimenti stampa "Prodotto non trovato".*/

public class OptionalMagazzino {
	private final List<Prodotto> prodotti = new ArrayList<>();
	
	public void save(Prodotto p) {prodotti.add(p);}
	
	public Optional<Prodotto> cercaProdottoPerNome(String nome) {
		for(Prodotto prodotto : prodotti) {
			if(prodotto.getNome().equalsIgnoreCase(nome)) {
				return Optional.of(prodotto);
			}
		}
		return Optional.empty();
		
	}
}
