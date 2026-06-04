package com.example.catalogo_libri_api.dto;

import com.example.catalogo_libri_api.model.CategoriaLibro;

public record LibroRequest(
		String titolo,
		String autore,
		CategoriaLibro categoria,
		int pagine,
		double prezzo
	)
	{}