package it.corsojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdottoRepository {
	private List<Prodotto> prodotti = new ArrayList<>();
	
	public void save(Prodotto p) {prodotti.add(p);}
	
	public Optional<Prodotto> findById(int id){
		return prodotti.stream().filter(p -> p.id()==id).findFirst();
	}
	
	public Optional<Prodotto> findByNome(String nome){
		return prodotti.stream().filter(p -> p.nome().equals(nome)).findFirst();
	}
}	
