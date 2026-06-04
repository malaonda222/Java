package com.example.catalogo_libri.dto;

import java.math.BigDecimal;

import com.example.catalogo_libri.entity.CategoriaLibro;

public record LibroRequest(
			String titolo,
			String autore,
			CategoriaLibro categoria,
			int pagine,
			BigDecimal prezzo
		)
{}; 
