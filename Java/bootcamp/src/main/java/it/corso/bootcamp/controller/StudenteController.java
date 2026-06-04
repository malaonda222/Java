package it.corso.bootcamp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.corso.bootcamp.dto.StudenteResponse;
import it.corso.bootcamp.service.StudenteService;

@RestController
@RequestMapping("/studenti")
public class StudenteController {
	
	private final StudenteService studenteService;
	
	public StudenteController(StudenteService ss) {
		this.studenteService = ss;
	}
	
	@GetMapping
	public List<StudenteResponse> findAll(){
		return studenteService.findAll();
	}
	
	@GetMapping("/primo")
	public StudenteResponse findFirst() {
		return studenteService.findFirst();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int matricola) {
		studenteService.delete(matricola);
	}
	
	@GetMapping("/{id}")
	public StudenteResponse findByMatricola(@PathVariable int matricola) {
		return studenteService.findByMatricola(matricola);
	}
}
