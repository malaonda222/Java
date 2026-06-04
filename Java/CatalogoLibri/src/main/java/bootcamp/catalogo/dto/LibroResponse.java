package bootcamp.catalogo.dto;

import java.time.LocalDate;

import bootcamp.catalogo.model.CategoriaLibro;

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
