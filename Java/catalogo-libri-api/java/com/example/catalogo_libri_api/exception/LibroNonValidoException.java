package com.example.catalogo_libri_api.exception;

@SuppressWarnings("serial")
public class LibroNonValidoException extends RuntimeException {
	
	public LibroNonValidoException(Long id) {
		 super("Libro con id: " + id + " non valido.");
	}
}
