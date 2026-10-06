package Pratica;

import java.util.List;

public class EsempioSuperDemo {
	public static void aggiungiInteri(List<? super Integer> lista) {
		lista.add(10);
		lista.add(20);
		lista.add(30);
	}
}
