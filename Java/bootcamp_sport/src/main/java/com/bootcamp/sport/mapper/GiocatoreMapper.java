package com.bootcamp.sport.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bootcamp.sport.dto.GiocatoreRequest;
import com.bootcamp.sport.dto.GiocatoreResponse;
import com.bootcamp.sport.entity.Giocatore;

	@Component
	public class GiocatoreMapper {
		public Giocatore toEntity(GiocatoreRequest request) {
			return new Giocatore(
					request.nome(),
					request.cognome(),
					request.numeroMaglia(),
					request.ruolo(),
					request.squadraId()
					);
		}
		
		public GiocatoreResponse toResponse(Giocatore giocatore) {
			return new GiocatoreResponse(
					giocatore.getId(),
					giocatore.getNome(),
					giocatore.getCognome(),
					giocatore.getNumeroMaglia(),
					giocatore.getRuolo(),
					giocatore.getSquadraId()
					);
		}
		
		public List<GiocatoreResponse> toResponseList(List<Giocatore> giocatori){
			return giocatori.stream()
					.map(this::toResponse)
					.toList();
		}
}