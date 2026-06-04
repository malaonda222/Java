package com.example.catalogo_libri_api.exception;

@SuppressWarnings("serial")
public class LibroNonTrovatoException extends RuntimeException {
	
	public LibroNonTrovatoException(Long id) {
		 super("Libro con id: " + id + " non trovato tra i libri del catalogo.");
	}
}

