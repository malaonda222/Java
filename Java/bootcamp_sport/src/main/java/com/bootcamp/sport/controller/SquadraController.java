package com.bootcamp.sport.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.sport.dto.SquadraRequest;
import com.bootcamp.sport.dto.SquadraResponse;
import com.bootcamp.sport.service.SquadraService;

@RestController
@RequestMapping("/api/squadre")
public class SquadraController {

	private final SquadraService service;

	public SquadraController(SquadraService service) {
		this.service = service;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SquadraResponse crea(@RequestBody SquadraRequest request) {
		return service.creaSquadra(request);
	}

	@GetMapping
	public List<SquadraResponse> trovaTutti() {
		return service.trovaTutti();
	}

	@GetMapping("/{id}")
	public SquadraResponse findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void elimina(@PathVariable Long id) {
		service.rimuoviPerId(id);
	}
}