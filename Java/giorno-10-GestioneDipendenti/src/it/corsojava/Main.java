package it.corsojava;

import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	List<Dipendente> dipendenti = List.of(
		    new Dipendente("Marco Rossi", "IT", 2500.0),
		    new Dipendente("Laura Bianchi", "HR", 2200.0),
		    new Dipendente("Giulia Verdi", "Marketing", 2400.0),
		    new Dipendente("Luca Neri", "IT", 2700.0),
		    new Dipendente("Sara Galli", "Vendite", 2100.0),
		    new Dipendente("Davide Conti", "Finanza", 3000.0)
		);
	

		List<String> stipendioAlto = dipendenti.stream()
		        .filter(d -> d.getStipendio() > 2500)
		        .map(d -> d.getNome())
		        .toList();
		System.out.println("Dipendenti con stipendio alto: " + stipendioAlto);
		
		dipendenti.stream()
		        .sorted((p1, p2) -> Double.compare(p1.getStipendio(), p2.getStipendio()))
		        .forEach(f -> System.out.println(f.getNome() + " - " + f.getStipendio()));
		
		System.out.println();
		
		System.out.println("Dipendenti ordinati alfabeticamente: ");
		dipendenti.stream()
		        .map(f -> f.getNome())
		        .sorted()
		        .forEach(System.out::println);
		
		System.out.println();

		double totaleStipendi = dipendenti.stream()
				.map(d -> d.getStipendio())
				.reduce(0.0,  (totale, stipendio) -> totale + stipendio);
		System.out.printf("Totale stipendi: %.2f", totaleStipendi);
		
		System.out.println();
		
		double stipendioMedio = totaleStipendi / dipendenti.size();
		System.out.println("Stipendio medio: " + String.format("%.2f", stipendioMedio));
		
		System.out.printf("Stipendio medio: %.2f ", stipendioMedio);
		
		System.out.println();
		
		boolean esisteFinance = dipendenti.stream()
				.anyMatch(d -> d.getReparto().equals("Finance"));
		System.out.println("Esiste almeno una persona che lavora in Finance? " + esisteFinance);
		
		System.out.println();
		
		long contaIT = dipendenti.stream()
				.filter(d -> d.getReparto().equals("IT"))
				.count();
		System.out.println("Persone che lavorano nel reparto IT: " + contaIT);
		
		System.out.println();
		
		Dipendente stipendioPiuAlto = dipendenti.stream()
				.max(Comparator.comparing(Dipendente::getStipendio)).orElse(null);	
			System.out.println("Dipendente con stipendio più alto: " + stipendioPiuAlto.getNome());
		
}	
}
