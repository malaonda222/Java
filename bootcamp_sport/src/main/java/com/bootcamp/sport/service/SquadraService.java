package com.bootcamp.sport.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.bootcamp.sport.dto.SquadraRequest;
import com.bootcamp.sport.dto.SquadraResponse;
import com.bootcamp.sport.entity.Squadra;
import com.bootcamp.sport.exception.SquadraDuplicataException;
import com.bootcamp.sport.exception.SquadraNonTrovataException;
import com.bootcamp.sport.mapper.SquadraMapper;
import com.bootcamp.sport.repository.SquadraRepository;

@Service
public class SquadraService {
	private final SquadraRepository repository;
	private final SquadraMapper mapper;
	
	public SquadraService(SquadraRepository repository, SquadraMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	private void validazione(SquadraRequest request) {
		if (request.nome() == null || request.nome().trim().isBlank()) {
			throw new IllegalArgumentException("Nome non valido");
		}
		if (request.citta() == null || request.citta().trim().isBlank()) {
			throw new IllegalArgumentException("Città non valido");
		}
		if (request.annoFondazione() < 0 || request.annoFondazione() > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Anno di fondazione non valida");
		}
	}
	
	public SquadraResponse creaSquadra(SquadraRequest request) {
		validazione(request);
		for (Squadra l:repository.findAll()) {
			if(l.getNome().equals(request.nome())) {
				throw new SquadraDuplicataException(request.nome());
			}
		}
		Squadra squadra = mapper.toEntity(request);
		Squadra salvato = repository.save(squadra);
		return mapper.toResponse(salvato);
	}
	
	public List<SquadraResponse> trovaTutti(){
		return mapper.toResponseList(repository.findAll());
	}
	
	public SquadraResponse findById(Long id) {
		return repository.findById(id)
				.map(mapper::toResponse).orElseThrow(() -> new SquadraNonTrovataException(id));
	}
	
	public void rimuoviPerId(Long id) {
		repository.findById(id).orElseThrow(() -> new SquadraNonTrovataException(id));
		repository.deleteById(id);
	}
}
