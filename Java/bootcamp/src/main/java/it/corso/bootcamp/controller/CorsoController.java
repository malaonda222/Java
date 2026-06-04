package it.corso.bootcamp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.bootcamp.dto.CorsoResponse;
import it.corso.bootcamp.service.CorsoService;

@Controller 
@RequestMapping("/api/corsi")
public class CorsoController {
	
	private final CorsoService corsoService;
	
	public CorsoController(CorsoService cs) {
		this.corsoService = cs;
	}
	
	@GetMapping
	public List<CorsoResponse> findAll(){
		return corsoService.findAll();
	}
	
	@GetMapping("/primo")
	public CorsoResponse findFirst() {
		return corsoService.findFirst();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		corsoService.delete(id);		
	}
	
	@GetMapping("/{id}")
	public CorsoResponse findById(@PathVariable Long id) {
		return corsoService.findById(id);
	}
	
	@GetMapping("/java")
	public CorsoResponse findByNome(@PathVariable String nome) {
		return corsoService.findByNome(nome);
	}
	
	@GetMapping("/spring")
	public CorsoResponse findSpring(@PathVariable String nome) {
		return corsoService.findSpring(nome);
	}
	
}
