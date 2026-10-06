package com.bootcamp.sport.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.sport.dto.GiocatoreRequest;
import com.bootcamp.sport.dto.GiocatoreResponse;
import com.bootcamp.sport.service.GiocatoreService;

@RestController
@RequestMapping("/api/giocatori")
public class GiocatoreController {

	private final GiocatoreService service;

	public GiocatoreController(GiocatoreService service) {
		this.service = service;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public GiocatoreResponse crea(@RequestBody GiocatoreRequest request) {
		return service.creaGiocatore(request);
	}

	@GetMapping
	public List<GiocatoreResponse> trovaTutti() {
		return service.trovaTutti();
	}

	@GetMapping("/{id}")
	public GiocatoreResponse findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void elimina(@PathVariable Long id) {
		service.rimuoviPerId(id);
	}
}