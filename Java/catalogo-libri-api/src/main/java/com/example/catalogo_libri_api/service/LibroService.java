package com.example.catalogo_libri_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.catalogo_libri_api.dto.LibroRequest;
import com.example.catalogo_libri_api.dto.LibroResponse;
import com.example.catalogo_libri_api.exception.LibroNonTrovatoException;
import com.example.catalogo_libri_api.mapper.LibroMapper;
import com.example.catalogo_libri_api.model.CategoriaLibro;
import com.example.catalogo_libri_api.model.Libro;
import com.example.catalogo_libri_api.repository.LibroRepository;

@Service
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
		Libro l = mapper.toModel(nextId++, request);
		repository.save(l);
		return mapper.toResponse(l);
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