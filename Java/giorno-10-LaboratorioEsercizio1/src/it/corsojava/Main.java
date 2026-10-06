package it.corsojava;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Studente> studenti = List.of(
			new Studente("Mario", 29.0, "Filosofia"),
			new Studente("Luigi", 25.5, "Arte"),
			new Studente("Arianna", 27.2, "Informatica"),
			new Studente("Alessio", 30.0, "Matematica")
			);
		
		List<String> promossi = studenti.stream()
				.filter(s -> s.getMedia() >= 18.0)
				.map(s -> s.getNome())
				.sorted()
				.toList();
		System.out.println(promossi);
		
		long mediaAlta = studenti.stream()
				.filter(s -> s.getMedia() >= 27)
				.count();
		System.out.println(mediaAlta);
		
		boolean mediaAltissima = studenti.stream()
				.anyMatch(s -> s.getMedia() == 30);
		System.out.println(mediaAltissima);
	}

}
