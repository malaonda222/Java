package com.example.catalogo_libri_api.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.catalogo_libri_api.dto.LibroRequest;
import com.example.catalogo_libri_api.dto.LibroResponse;
import com.example.catalogo_libri_api.model.Libro;

@Component
public class LibroMapper {
	
	public Libro toModel(
			Long id, LibroRequest request) {
		return new Libro(
				id,
				request.titolo(),
				request.autore(),
				request.categoria(),
				request.pagine(),
				request.prezzo()
				);
	}
	
	public LibroResponse toResponse(
			Libro libro) {
		return new LibroResponse(
				libro.getId(),
				libro.getTitolo(),
				libro.getAutore(),
				libro.getCategoria(),
				libro.getPagine(),
				libro.getPrezzo(),
				libro.getDataInserimento() 
				);
	}
	
	public List<LibroResponse> toResponseList(List<Libro> libri){
		return libri.stream()
				.map(l -> this.toResponse(l))
				.toList();
	}
}
