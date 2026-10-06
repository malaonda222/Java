package it.corsojava;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Ordine> ordini = List.of(
				new Ordine("A100", "Mario Rossi", 300.20),
				new Ordine("B101", "Luigi Bianchi", 4002.10),
				new Ordine("C101", "Marco Verdi", 456382.01)
				);
		
		List<Ordine> ordiniCostosi = ordini.stream()
				.filter(o -> o.getTotale() > 100)
				.toList();
		System.out.println(ordiniCostosi);
		
		double totalePrezzi = ordini.stream()
				.map(o -> o.getTotale())
				.reduce(0.0, (totale, numero) -> totale + numero);
		System.out.println(totalePrezzi);
		
		ordini.stream()
				.sorted((o1, o2) -> Double.compare(o1.getTotale(), o2.getTotale()))
				.forEach(o -> System.out.println(o.getCliente() + " - " + o.getTotale()));
		
		List<String> nomiClienti = ordini.stream()
				.map(o -> o.getCliente())
				.toList();
		
		System.out.println(nomiClienti);
	}

}
