package com.bootcamp.sport.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bootcamp.sport.dto.SquadraRequest;
import com.bootcamp.sport.dto.SquadraResponse;
import com.bootcamp.sport.entity.Squadra;

@Component
public class SquadraMapper {
	public Squadra toEntity(SquadraRequest request) {
		return new Squadra(
				request.nome(),
				request.citta(),
				request.annoFondazione()
				);
	}
	
	public SquadraResponse toResponse(Squadra squadra) {
		return new SquadraResponse(
				squadra.getId(),
				squadra.getNome(),
				squadra.getCitta(),
				squadra.getAnnoFondazione()
				);
	}
	
	public List<SquadraResponse> toResponseList(List<Squadra> squadre){
		return squadre.stream()
				.map(this::toResponse)
				.toList();
	}
}
