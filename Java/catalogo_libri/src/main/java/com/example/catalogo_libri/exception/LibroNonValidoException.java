package com.example.catalogo_libri.exception;

@SuppressWarnings("serial")
public class LibroNonValidoException extends RuntimeException {
	
	public LibroNonValidoException(Long id) {
		 super("Libro con id: " + id + " non valido.");
	}
}
