package it.corso.bootcamp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.corso.bootcamp.dto.ProdottoResponse;
import it.corso.bootcamp.service.ProdottoService;

@RestController 
@RequestMapping("/api/prodotti")
public class ProdottoController {
	
	private final ProdottoService prodottoService;
	
	public ProdottoController(ProdottoService ps) {
		this.prodottoService = ps;
	}
	
	@GetMapping
	public List<ProdottoResponse> findAll(){
		return prodottoService.findAll();
	}
	
	@GetMapping("/primo")
	public ProdottoResponse findFirst() {
		return prodottoService.findFirst();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		prodottoService.delete(id);
	}
	
	@GetMapping("/{id}")
	public ProdottoResponse findById(@PathVariable Long id) {
		return prodottoService.findById(id); 
	}
}