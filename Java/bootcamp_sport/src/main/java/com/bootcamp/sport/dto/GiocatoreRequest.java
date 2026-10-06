package com.bootcamp.sport.dto;

import com.bootcamp.sport.entity.Ruolo;

public record GiocatoreRequest(
		String nome,
		String cognome,
		int numeroMaglia,
		Long squadraId,
		Ruolo ruolo) {}
