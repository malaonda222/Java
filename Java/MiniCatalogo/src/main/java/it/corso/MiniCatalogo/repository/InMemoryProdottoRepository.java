package it.corso.MiniCatalogo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import it.corso.MiniCatalogo.model.Prodotto;

public class InMemoryProdottoRepository
	implements ProdottoRepository {
		
		private final List<Prodotto> prodotti = new ArrayList<>();
		
		public InMemoryProdottoRepository() {
			prodotti.add(new Prodotto(1L, "Mouse", 29.99));
			prodotti.add(new Prodotto(2L, "Monitor", 180.00));
			prodotti.add(new Prodotto(3L, "Tastiera", 49.99));
	}
	
	@Override
	public List<Prodotto> findAll(){
		return prodotti;
	}
	
	@Override 
	public Optional<Prodotto> findById(Long id){
		return prodotti.stream()
				.filter(p -> p.getId().equals(id))
				.findFirst();
	}
	
	@Override
	public void save(Prodotto prodotto) {
		prodotti.add(prodotto);
	}
}
