package com.example.catalogo_libri.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.catalogo_libri.dto.LibroRequest;
import com.example.catalogo_libri.dto.LibroResponse;
import com.example.catalogo_libri.entity.CategoriaLibro;
import com.example.catalogo_libri.entity.Libro;

import com.example.catalogo_libri.repository.LibroRepository;
import com.example.catalogo_libri.exception.LibroNonTrovatoException;
import com.example.catalogo_libri.exception.TitoloGiaDuplicatoException;
import com.example.catalogo_libri.mapper.LibroMapper;

@Service
public class LibroService {
	private final LibroRepository repository;
	private final LibroMapper mapper;

	public LibroService(LibroRepository repository, LibroMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	private void validazione(LibroRequest request) {
		if (request.titolo() == null || request.titolo().trim().isBlank()) {
			throw new IllegalArgumentException("Titolo non valido");
		}
		if (request.autore() == null || request.autore().trim().isBlank()) {
			throw new IllegalArgumentException("Autore non valido");
		}
		if (request.categoria() == null) {
			throw new IllegalArgumentException("Categoria non valida");
		}
		if (request.pagine() <= 0) {
			throw new IllegalArgumentException("Le pagine non possono essere inferiori o uguali a 0");
		}
		if (request.prezzo().compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Il prezzo non può essere inferiore a 0");
		}
	}

	public LibroResponse creaLibro(LibroRequest request) {
		validazione(request);
		for (Libro l : repository.findAll()) {
			if (l.getTitolo().equals(request.titolo())) {
				throw new TitoloGiaDuplicatoException("Errore");
			}
		}
		Libro libro = mapper.toEntity(request);
		Libro salvato = repository.save(libro);
		return mapper.toResponse(salvato);
	}

	public LibroResponse trovaPerId(Long id) {
		return repository.findById(id).map(mapper::toResponse).orElseThrow(() -> new LibroNonTrovatoException(id));
	}

	public List<LibroResponse> trovaTutti() {
		return mapper.toResponseList(repository.findAll());
	}

	public List<LibroResponse> trovaPerCategoria(CategoriaLibro categoria) {
		return mapper.toResponseList(repository.findByCategoria(categoria));
	}

	public List<LibroResponse> trovaLibriCostosi(BigDecimal soglia) {
		return mapper.toResponseList(repository.findAll().stream().filter(l -> l.isCostoso(soglia)).toList());
	}

	public void rimuoviPerId(Long id) {
		repository.findById(id).orElseThrow(() -> new LibroNonTrovatoException(id));
		repository.deleteById(id);
	}
	
	public List<Libro> findLibriCostosi(BigDecimal soglia){
		return repository.findLibriCostosi(soglia);
	}
	
	public List<Libro> findByCatgoriaEPrezzo(CategoriaLibro categoria, BigDecimal prezzo){
		return repository.findByCategoriaEPrezzo(categoria, prezzo);
	}
}
