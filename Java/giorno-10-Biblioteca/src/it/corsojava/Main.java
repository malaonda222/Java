package it.corsojava;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
		@FunctionalInterface
		public interface Valutatore{
			boolean valuta(Libro l);
		}
		
		public static void main(String[] args) {
			List<Libro> libri = List.of(
					new Libro("Kafka sulla spiaggia", "Murakami", "drammatico", 13.40, 202),
					new Libro("Cuore", "De Amicis", "ragazzi", 11.50, 190),
					new Libro("La ragazza della neve", "Jenoff", "narrativa", 13.40, 202),
					new Libro("Harry Potter e la pietra filosofale", "JK Rowling", "avventura", 12.90, 400),
					new Libro("Il ritratto di Dorian Grey", "Wilde", "narrativa", 13.50, 200),
					new Libro("Tre piani", "Nevo", "drammatico", 15.60, 170),
					new Libro("Ikigai", "Watanabe", "scientifico", 13.40, 120),
					new Libro("Il codice Da Vinci", "Dan Brown", "Thriller", 18.0, 500)
				);
		
		Valutatore libroEconomico = l -> 
			l.getPrezzo() < 15;
			
		Valutatore libroLungo = l ->
			l.getPagine() > 300;
			
		Libro l1 = libri.get(0);
		if(libroEconomico.valuta(l1)) {
			System.out.println("Il libro è economico");
		}
		
		if(libroLungo.valuta(l1)) {
			System.out.println("Il libro è lungo");
		}
			
		Predicate<Libro> genereFantasy = l -> l.getGenere().equals("Fantasy");
		libri.stream()
			.filter(genereFantasy)
			.forEach(l -> System.out.println(l.getTitolo()));
		
		Function<Libro, String> formattato = l -> l.getTitolo() + " - " + l.getAutore() + " - " + l.getPrezzo();
		libri.stream()
			.map(formattato)
			.forEach(System.out::println);
		
		Consumer<Libro> stampa = l -> {
			System.out.println("Titolo: " + l.getTitolo());
			System.out.println("Autore: " + l.getAutore());
			System.out.println("Genere: " + l.getGenere());
			System.out.println("Prezzo: " + l.getPrezzo());
			System.out.println("Pagine: " + l.getPagine());
		};
		
		libri.forEach(stampa);
		
		Supplier<Libro> restituisciLibro = () -> new Libro("Default", "Anonimo", "Sconosciuto", 0.0, 0);
		
		Libro risultato = libri.stream()
				.filter(l -> l.getPrezzo() > 100)
				.findFirst()
				.orElseGet(restituisciLibro);
		System.out.println(risultato.getTitolo());
		
		List<String> resoconto = libri.stream()
				.filter(l -> l.getPrezzo() > 10)
				.map(Libro::getTitolo)
				.sorted()
				.toList();
		System.out.println(resoconto);
		
		double prezzoTotale = libri.stream()
				.map(Libro::getPrezzo)
				.reduce(0.0, (totale, numero) -> totale + numero);
		System.out.println(prezzoTotale);
		
		int totalePagineThriller = libri.stream()
				.filter(l -> l.getGenere().equals("Thriller"))
				.map(Libro::getPagine)
				.reduce(0, Integer::sum);
		System.out.println(totalePagineThriller);
		
		long conteggio = libri.stream()
				.filter(l -> l.getPagine() < 200)
				.count();
		System.out.println(conteggio);
		
		boolean almenoUnLibroCostoso = libri.stream()
				.anyMatch(l -> l.getPrezzo() > 25);
		System.out.println(almenoUnLibroCostoso);
		
		boolean tuttiValidi = libri.stream()
				.allMatch(l -> !l.getTitolo().isEmpty());
		System.out.println(tuttiValidi);
		
		};
		
		
		
		
				
		
		
		
		
		
		
	
	
}
