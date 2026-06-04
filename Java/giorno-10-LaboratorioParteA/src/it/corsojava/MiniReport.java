package it.corsojava;

import java.util.Comparator;
import java.util.List;

public class MiniReport {
public static void report(List<Prodotto> prodotti) {
	List<Prodotto> prodotti1 = List.of(
			new Prodotto("Borraccia", "Sport", 30.0),
			new Prodotto("Monitor", "Tecnologia", 40.0),
			new Prodotto("Zaino", "Abbigliamento", 20.90),
			new Prodotto("Webcam", "Tecnologia", 45.80),
			new Prodotto("Orologio", "Accessori", 190.90),
			new Prodotto("Cellulare", "Tecnologia", 1700.0)
			);
	
	System.out.println(prodotti1);
	
	long totaleProdotti = prodotti1.stream()
			.count();
	
	System.out.println(totaleProdotti);

	List<String> prodottiEconomici = prodotti1.stream()
			.filter(p -> p.getPrezzo() < 30)
			.map(p -> p.getNome())
			.toList();
	prodottiEconomici.forEach(System.out::println);
	
	List<String> prodottiCostosi = prodotti1.stream()
			.filter(p -> p.getPrezzo() > 50)
			.sorted(Comparator.comparing(Prodotto::getNome))
			.map(Prodotto::getNome)
			.toList();
	prodottiCostosi.forEach(System.out::println);
	
	double sommaPrezzi = prodotti1.stream()
			.map(p -> p.getPrezzo())
			.reduce(0.0, (totale, numero) -> totale + numero);
			System.out.println(sommaPrezzi);
	}
}
