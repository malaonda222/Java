package com.example.catalogo_libri_api.dto;

import java.time.LocalDate;
import com.example.catalogo_libri_api.model.CategoriaLibro;


public record LibroResponse(
	Long id,
	String titolo,
	String autore,
	CategoriaLibro categoria,
	int pagine,
	double prezzo,
	LocalDate dataInserimento
)
{};