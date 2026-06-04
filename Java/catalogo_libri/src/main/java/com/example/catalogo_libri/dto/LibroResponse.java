package com.example.catalogo_libri.dto;

import java.math.BigDecimal;

import com.example.catalogo_libri.entity.CategoriaLibro;

public record LibroResponse(
		Long id, 
		String titolo,
		String autore,
		CategoriaLibro categoria,
		int pagine,
		BigDecimal prezzo) {
	
}
