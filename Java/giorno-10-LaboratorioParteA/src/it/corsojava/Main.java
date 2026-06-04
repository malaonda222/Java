package it.corsojava;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Prodotto> prodotti = List.of(
				new Prodotto("Borraccia", "Sport", 30.0),
				new Prodotto("Monitor", "Tecnologia", 40.0),
				new Prodotto("Zaino", "Abbigliamento", 20.90),
				new Prodotto("Webcam", "Tecnologia", 45.80),
				new Prodotto("Orologio", "Accessori", 190.90),
				new Prodotto("Cellulare", "Tecnologia", 1700.0)
				);
		
		List<String> prodottiCostosi = prodotti.stream()
				.filter(p -> p.getPrezzo() > 50)
				.map(p-> p.getNome()) //Prodotto::getNome
				.sorted()
				.toList();
		
		prodottiCostosi.forEach(System.out::println);
		
		double totalePrezzo = prodotti.stream()
				.map(p -> p.getPrezzo())
				.reduce(0.0, (totale, numero) -> totale + numero);
		System.out.println(totalePrezzo);
		
		long prodottiEconomici = prodotti.stream()
				.filter(p -> p.getPrezzo() < 30)
				.count();
		System.out.println(prodottiEconomici);
		
		boolean prodottiCostosissimi = prodotti.stream()
				.anyMatch(p -> p.getPrezzo() > 200);
		System.out.println(prodottiCostosissimi);
		
		prodotti.stream()
		.sorted((p1, p2) -> Double.compare(p1.getPrezzo(),p2.getPrezzo()))
		.forEach(p -> System.out.println(p.getNome() + " - " + p.getCategoria() + " - " + p.getPrezzo()));
		
		
	
	}
}
