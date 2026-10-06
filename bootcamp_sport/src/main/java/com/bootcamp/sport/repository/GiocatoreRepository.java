package com.bootcamp.sport.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.sport.entity.Giocatore;
import com.bootcamp.sport.entity.Ruolo;

public interface GiocatoreRepository extends JpaRepository<Giocatore, Long>{
	List<Giocatore> findByRuolo(Ruolo ruolo);
	Optional<Giocatore> findBySquadraIdAndNumeroMaglia(Long squadraId, int numeroMaglia);
	}

