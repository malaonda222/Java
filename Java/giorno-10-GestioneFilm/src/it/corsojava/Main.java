package it.corsojava;

import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Film> films = List.of(
		    new Film("Inception", "Fantascienza", 8.8),
		    new Film("Il Padrino", "Drammatico", 9.2),
		    new Film("Titanic", "Romantico", 7.8),
		    new Film("Interstellar", "Fantascienza", 8.6),
		    new Film("The Dark Knight", "Azione", 9.0),
		    new Film("La La Land", "Musical", 8.0)
		);
		
	List<String> filmDiSuccesso = films.stream()
			.filter(f -> f.getVoto() > 8)
			.map(f -> f.getTitolo())
			.toList();
	System.out.println(filmDiSuccesso);
	
	films.stream()
	.sorted((p1, p2) -> Double.compare(p1.getVoto(), p2.getVoto()))
	.forEach(f -> System.out.println(f.getTitolo() + " - " + f.getVoto()));
	
	films.stream()
	.map(Film::getTitolo)
	.sorted()
	.forEach(System.out::println);
	
	//oppure
	//List<String> listaOrdinata = films.stream()
	       // .map(Film::getTitolo)
	       // .sorted()
	       // .toList();

	//System.out.println(listaOrdinata);
	
	double sommaVoti = films.stream()
			.map(f -> f.getVoto())
			.reduce(0.0, (totale, voto) -> totale + voto);
	System.out.println(sommaVoti);		
	
	double mediaVoti = sommaVoti / films.size();
	System.out.println(mediaVoti);	
	
	boolean esisteAlmenoUnDieci = films.stream()
			.anyMatch(f -> f.getVoto() >= 10);
	System.out.println(esisteAlmenoUnDieci);	
	
	long contaFantasy = films.stream()
			.filter(f -> f.getGenere().equals("Fantasy"))
			.count();
	System.out.println(contaFantasy);
	
	Film votoPiuAlto = films.stream()
		.max(Comparator.comparing(Film::getVoto)).orElse(null);	
	System.out.println(votoPiuAlto.getTitolo());
	}
	
	
	
	
	
	

}
