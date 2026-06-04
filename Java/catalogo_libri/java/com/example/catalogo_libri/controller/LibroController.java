package com.example.catalogo_libri.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogo_libri.dto.LibroRequest;
import com.example.catalogo_libri.dto.LibroResponse;
import com.example.catalogo_libri.entity.CategoriaLibro;
import com.example.catalogo_libri.service.LibroService;

@RestController
@RequestMapping("/libri")

public class LibroController {
	
	private LibroService service;
	
	public LibroController(LibroService service) {
		this.service = service;
	}
	
	@GetMapping
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/trovaTutti")
	public List<LibroResponse> trovaLibri() {
		return service.trovaTutti();
	}
	
	@GetMapping("/trovaId/{id}")
	public LibroResponse trovaPerId(@PathVariable Long id) {
		return service.trovaPerId(id);
	}
	
	@PostMapping("/aggiungi")
	public LibroResponse aggiungiLibro(
			@RequestBody LibroRequest request) {
		return service.creaLibro(request);
	}
	
	@DeleteMapping("/{id}")
	public void eliminaLibro(@PathVariable Long id) {
		service.rimuoviPerId(id);
	}
	
	@GetMapping("/categoria/{categoria}")
	public List<LibroResponse> trovaPerCategoria(@PathVariable CategoriaLibro categoria) {
		 return service.trovaPerCategoria(categoria);
	}
	
	@GetMapping("/categoria1")
	public List<LibroResponse> trovaPerCategoria1(@RequestParam CategoriaLibro categoria){
		return service.trovaPerCategoria(categoria);
	}
	
	@GetMapping ("/costosi")
	public List<LibroResponse> isCostoso(@RequestParam BigDecimal minPrezzo){
		return service.trovaLibriCostosi(minPrezzo);
	}
}
