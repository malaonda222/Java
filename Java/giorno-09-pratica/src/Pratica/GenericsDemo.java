package Pratica;

import java.util.*;

public class GenericsDemo {
	public static void main(String[] args) {

// Solo String ammesse: il compilatore controlla
		List<String> lista = new ArrayList<>();
		lista.add("Java");
		lista.add("Spring");
//		lista.add(42); // ERRORE a compile-time

// Nessun cast necessario
		String testo = (String) lista.get(2);
		System.out.println(testo.toUpperCase()); // JAVA
	}
}
