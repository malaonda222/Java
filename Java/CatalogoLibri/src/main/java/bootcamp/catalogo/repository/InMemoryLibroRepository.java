package bootcamp.catalogo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import bootcamp.catalogo.model.CategoriaLibro;
import bootcamp.catalogo.model.Libro;

public class InMemoryLibroRepository
	implements LibroRepository {
		
	private final Map<Long, Libro> archivio = new HashMap<>();
	
	public InMemoryLibroRepository() {
		Libro l1 = new Libro(1L, "Clean Code", "Robert C. Martin",
	            CategoriaLibro.PROGRAMMAZIONE, 431, 35.90);
	    Libro l2 = new Libro(2L, "Il nome della rosa", "Umberto Eco",
	            CategoriaLibro.NARRATIVA, 502, 14.50);
	    Libro l3 = new Libro(3L, "Breve storia del tempo", "Stephen Hawking",
	            CategoriaLibro.SCIENTIFICO, 212, 12.00);
	    
	    archivio.put(l1.getId(), l1);
	    archivio.put(l2.getId(), l2);
	    archivio.put(l3.getId(), l3);
	}
	
	@Override
	public Libro save(Libro libro) {
		archivio.put(libro.getId(), libro);
		return libro;
	}
	
	@Override 
	public Optional<Libro> findById(Long id){
		return Optional.ofNullable(archivio.get(id));
	}
	
	@Override 
	public List<Libro> findAll(){
		return new ArrayList<>(archivio.values()); //archivio.values() restituisce i valori della mappa, new ArrayList<>(...) li converte in lista.
	}
	
	@Override
	public List<Libro> findByCategoria(CategoriaLibro c) {
		List<Libro> risultato = new ArrayList<>();
		for(Libro l:archivio.values()) {
			if(l.getCategoria() == c) {
				risultato.add(l);
			}
		}
		return risultato;
	}
	
	@Override 
	public void deleteById(Long id) {
		archivio.remove(id);
	}
	
	@Override 
	public boolean existsById(Long id) {
		return archivio.containsKey(id);
	}

}
