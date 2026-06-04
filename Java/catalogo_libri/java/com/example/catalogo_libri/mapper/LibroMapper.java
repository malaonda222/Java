package com.example.catalogo_libri.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.catalogo_libri.dto.LibroRequest;
import com.example.catalogo_libri.dto.LibroResponse;
import com.example.catalogo_libri.entity.Libro;

@Component
public class LibroMapper {
	
	// LibroRequest -> Libro (Entity)
	// usato quando crei o aggiorni un libro
	public Libro toEntity(LibroRequest request) {
		return new Libro(
				request.titolo(),
				request.autore(),
				request.categoria(),
				request.pagine(),
				request.prezzo()
				);
	}
	
	// Libro (Entity) -> LibroResponse
	// usato quando restituisci dati al client
	public LibroResponse toResponse(Libro libro) {
		return new LibroResponse(
				libro.getId(),
				libro.getTitolo(),
				libro.getAutore(),
				libro.getCategoria(),
				libro.getPagine(),
				libro.getPrezzo()
				);
	}

	public List<LibroResponse> toResponseList(List<Libro> libri) { // ← conversione, sta bene qui
        return libri.stream()
            .map(this::toResponse)
            .toList();
	}
}
