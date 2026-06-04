package it.corso.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import it.corso.bootcamp.dto.StudenteResponse;

@Service
public class StudenteService {
	public List<StudenteResponse> findAll() {
		return List.of(new StudenteResponse("Mario", "Rossi", 12345), 
					new StudenteResponse("Luigi", "Bianchi", 678910));
	}

	public StudenteResponse findFirst() {
		return findAll().get(0);
	}
	
	public StudenteResponse findByMatricola(int matricola) {
		return findAll().stream()
				.filter(s -> s.matricola() == matricola)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Studente non trovato"));
	}
	
	public void delete(int matricola) {
		StudenteResponse studente = findByMatricola(matricola);
		System.out.println("Studente eliminato: " + studente.nome());
	}
	
}
