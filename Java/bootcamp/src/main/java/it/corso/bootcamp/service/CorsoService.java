package it.corso.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.corso.bootcamp.dto.CorsoResponse;

@Service 
public class CorsoService {
	public List<CorsoResponse> findAll(){
		return List.of(
				new CorsoResponse(1234L, "java", "Prof. Rossi"),
				new CorsoResponse(5678L, "spring", "Prof. Bianchi")
				);
	}
	
	public CorsoResponse findFirst() {
		return findAll().get(0);
	}
	
	public CorsoResponse findById(Long id) {
		return findAll().stream()
				.filter(c -> c.id() == id)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Id non trovato"));
	}
	
	public void delete(Long id) {
		CorsoResponse corso = findById(id);
		System.out.println("Corso eliminato: " + corso.nome());
	}
	
	public CorsoResponse findByNome(String nome) {
		return findAll().stream()
				.filter(c -> c.nome() == nome)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Corso java non presente"));
	}
	
	public CorsoResponse findSpring(String nome) {
		return findAll().stream()
				.filter(c -> c.nome() == "spring")
				.findFirst() 
				.orElseThrow(() -> new IllegalArgumentException("Corso Spring non trovato"));
	}
}
