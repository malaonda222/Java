package it.corso.MiniCatalogo.repository;

import java.util.List;
import java.util.Optional;

import it.corso.MiniCatalogo.model.Prodotto;

public interface ProdottoRepository {
	List<Prodotto> findAll();
	
	Optional<Prodotto> findById(Long id);
	
	void save(Prodotto prodotto);
}

//Definiamo prima l'interfaccia: Il Service dipenderà
// dall'astrazione, non dall'implementazione concreta. 
//Questo è il principio di inversione delle dipendenze.