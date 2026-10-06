package it.corso.MiniCatalogo.dto;

public record ProdottoResponse(
		Long id, 
		String nome,
		double prezzo
) {}
