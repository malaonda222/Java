package com.bootcamp.sport.dto;

import com.bootcamp.sport.entity.Ruolo;

public record GiocatoreResponse(
		Long id,
		String nome,
		String cognome,
		int numeroMaglia,
		Ruolo ruolo,
		Long squadraId) {
}
