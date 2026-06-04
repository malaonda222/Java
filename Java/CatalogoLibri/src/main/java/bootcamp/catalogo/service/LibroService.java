package bootcamp.catalogo.service;

import java.util.List;

import bootcamp.catalogo.dto.LibroRequest;
import bootcamp.catalogo.dto.LibroResponse;
import bootcamp.catalogo.exception.LibroNonTrovatoException;
import bootcamp.catalogo.exception.TitoloGiaDuplicatoException;
import bootcamp.catalogo.mapper.LibroMapper;
import bootcamp.catalogo.model.CategoriaLibro;
import bootcamp.catalogo.model.Libro;
import bootcamp.catalogo.repository.LibroRepository;

public class LibroService {
	private final LibroRepository repository;
	private final LibroMapper mapper;
	private long nextId = 1L;
	
	public LibroService(LibroRepository repository, LibroMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	private void validazione(LibroRequest request) {
		if(request.titolo() == null || request.titolo().trim().isBlank()) {
			throw new IllegalArgumentException("Titolo non valido");
		}
		if(request.autore() == null || request.autore().trim().isBlank()) {
			throw new IllegalArgumentException("Autore non valido");
		}
		if(request.categoria() == null) {
			throw new IllegalArgumentException("Categoria non valida");
		}
		if(request.pagine() <= 0) {
			throw new IllegalArgumentException("Le pagine non possono essere inferiori o uguali a 0");
		}
		if(request.prezzo() < 0) {
			throw new IllegalArgumentException("Il prezzo non può essere inferiore a 0");
		}
	}
	
	public LibroResponse creaLibro(LibroRequest request) {
		validazione(request);
		for(Libro l :repository.findAll()) {
			if(l.getTitolo().equals(request.titolo())) {
				throw new TitoloGiaDuplicatoException("Errore");
			}
		}
		Libro libro = mapper.toModel(nextId++, request);
		repository.save(libro);
		return mapper.toResponse(libro);
			}
			
	public LibroResponse trovaPerId(Long id) {
		LibroResponse libro = repository.findById(id)
			.map(mapper::toResponse)
			.orElseThrow(() -> new LibroNonTrovatoException(id));
		return libro;
	}
	
	public List<LibroResponse> trovaTutti(){
		return repository.findAll().stream()
				.map(mapper::toResponse)
				.toList();
	}
	
	public List<LibroResponse> trovaPerCategoria(CategoriaLibro categoria){
		return repository.findByCategoria(categoria).stream()
				.map(mapper::toResponse)
				.toList();
	}
	
	public List<LibroResponse> trovaLibriCostosi(double prezzo){
		return repository.findAll().stream()
				.filter(l -> l.isCostoso(prezzo))
				.map(mapper::toResponse)
				.toList();
	}
	
	public void rimuoviPerId(Long id) {
		repository.findById(id)
			.orElseThrow(() -> new LibroNonTrovatoException(id));
		repository.deleteById(id);
	}	
}
