package it.corsojava;

import java.util.List;

public class Wildcards {
	public static double sommaTutti(List<? extends Number> lista) {
		double totale = 0;
		for(Number numero:lista) {
			totale += numero.doubleValue();
		}
		return totale;
	}
	
	public static void riempi(List<? super Integer> lista, int quanti) {
		for(int i = 0; i < quanti; i ++) {
			lista.add(i);
		}
	}
}
