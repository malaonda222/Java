package Modulo8;

import java.util.List;
import java.util.ArrayList;

public class UpperBoundedWildcards {
	public static double sommaTotale(List<? extends Number> lista) {
		double totale = 0;
		for(Number numero:lista) {
			totale += numero.doubleValue();
		}
		return totale;
	}
	
	public static void main(String[] args) {
		List<Integer> interi = new ArrayList<>();
		List<Double> doubles = new ArrayList<>();
		List<Float> floats = new ArrayList<>();
		
		interi.add(30);
		interi.add(30);
		
		doubles.add(3000.3);
		doubles.add(30.5);
		
		floats.add(4.5f);
		floats.add(3.5f);
		
		System.out.println("Interi: " + interi);
		System.out.println("Decimali: " + doubles);
		System.out.println("Floats: " + floats);
	}
}
