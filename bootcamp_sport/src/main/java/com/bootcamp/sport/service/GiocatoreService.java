package com.bootcamp.sport.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.sport.dto.GiocatoreRequest;
import com.bootcamp.sport.dto.GiocatoreResponse;
import com.bootcamp.sport.entity.Giocatore;
import com.bootcamp.sport.exception.GiocatoreNonTrovatoException;
import com.bootcamp.sport.exception.NumeroMagliaGiaUsatoException;
import com.bootcamp.sport.exception.SquadraNonTrovataException;
import com.bootcamp.sport.mapper.GiocatoreMapper;
import com.bootcamp.sport.repository.GiocatoreRepository;
import com.bootcamp.sport.repository.SquadraRepository;

@Service
public class GiocatoreService {
	private final GiocatoreRepository repository;
	private final GiocatoreMapper mapper;
	private final SquadraRepository squadraRepository;
	
	public GiocatoreService(GiocatoreRepository repository, GiocatoreMapper mapper, SquadraRepository squadraRepository) {
		this.repository = repository;
		this.mapper = mapper;
		this.squadraRepository = squadraRepository;
	}
	
	private void validazione(GiocatoreRequest request) {
		if (request.nome() == null || request.nome().trim().isBlank()) {
			throw new IllegalArgumentException("Nome non valido");
		}
		if (request.cognome() == null || request.cognome().trim().isBlank()) {
			throw new IllegalArgumentException("Cognome non valido");
		}
		if (request.numeroMaglia() < 0 || request.numeroMaglia() > 100) {
			throw new IllegalArgumentException("Numero di maglia non valido");
		}
		if (request.ruolo() == null) {
			throw new IllegalArgumentException("Ruolo non valido");
		}
		if (request.squadraId() == null) {
			throw new IllegalArgumentException("Id Squadra non valido");
	}
	}
	
	public GiocatoreResponse creaGiocatore(GiocatoreRequest request) {
		validazione(request);
		squadraRepository.findById(request.squadraId())
			.orElseThrow(() -> new SquadraNonTrovataException(request.squadraId()));
		
		repository.findBySquadraIdAndNumeroMaglia(request.squadraId(), request.numeroMaglia())
			.ifPresent(g -> {
				throw new NumeroMagliaGiaUsatoException(request.squadraId(), request.numeroMaglia());
			});
		
		Giocatore giocatore = mapper.toEntity(request);
		Giocatore salvato = repository.save(giocatore);
		return mapper.toResponse(salvato);
	}
	
	public List<GiocatoreResponse> trovaTutti(){
		return mapper.toResponseList(repository.findAll());
	}
	
	public GiocatoreResponse findById(Long id) {
		return repository.findById(id)
				.map(mapper::toResponse)
				.orElseThrow(() -> new GiocatoreNonTrovatoException(id));
	}
	
	public void rimuoviPerId(Long id) {
		repository.findById(id).orElseThrow(() -> new GiocatoreNonTrovatoException(id));
		repository.deleteById(id);
	}
}