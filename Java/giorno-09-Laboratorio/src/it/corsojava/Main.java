package it.corsojava;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		Coppia<String, Integer> nomeEta = new Coppia<>("Luisa", 24);
		Coppia<Integer, Double> prodottoPrezzo = new Coppia<>(1001, 2500.0);
		
		System.out.println("Prima coppia: " + nomeEta);
		System.out.println("Seconda coppia: " + prodottoPrezzo);
		
		String[] parole = {"ciao", "mi", "chiamo"};
		Integer[] numeri = {1, 2, 4, 6};
		
		Swap.swap1(parole, 0, 2);
		Swap.swap1(numeri, 1,  2);
		
		List<Integer> interi = new ArrayList<>();
		interi.add(8);
		interi.add(8);
		interi.add(8);
		Wildcards.sommaTutti(interi);
		System.out.println(interi);
		
		List<Double> decimali = new ArrayList<>();
		decimali.add(10.0);
		decimali.add(10.0);
		decimali.add(10.0);
		Wildcards.sommaTutti(decimali);
		System.out.println(decimali);
		
		Wildcards.riempi(interi, 5);
		System.out.println(interi);
		
		//non funziona con LONG
//		List<Long> lunghi = new ArrayList<>();
//		lunghi.add(1000);
//		lunghi.add(1000);
//		lunghi.add(1000);
//		Wildcards.sommaTutti(lunghi);
//		System.out.println(lunghi);
		
		ProdottoRepository prodottoRepo = new ProdottoRepository();
		prodottoRepo.save(new Prodotto(123, "PC", 2500.0));
		prodottoRepo.save(new Prodotto(456, "Mouse", 25.0));
		
		prodottoRepo.findByNome("PC").ifPresent(n -> System.out.println("Trovato: " + n.nome()));
		
		Prodotto p = prodottoRepo.findById(456).orElse(new Prodotto(0, "Anonimo", 90.0));
		System.out.println(p.nome());
		
		Prodotto p2 = prodottoRepo.findById(123).orElseThrow(() -> new RuntimeException("Prodotto non trovato"));
		System.out.println(p2.nome());	
	}
}

