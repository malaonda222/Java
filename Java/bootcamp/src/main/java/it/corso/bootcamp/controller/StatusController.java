package it.corso.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {
	
	@GetMapping
	public String status() {
		return "Applicazione attiva";
	}
	
	@GetMapping("/versione")
	public String versione() {
		return "Java 17 Bootcamp API v10";
	}
	
	@GetMapping("/autore")
	public String autore() {
		return "Bootcamp Spring Boot - Giorno 13";
	}
}
