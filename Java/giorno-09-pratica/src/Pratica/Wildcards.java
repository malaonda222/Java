package Pratica;

import java.util.List;

public class Wildcards {
	
	public static void main(String[] args) {
		stampaLista(List.of("Anna", "Marco"));
		stampaLista(List.of(1, 2, 3));
	}
	public static void stampaLista(List<?> lista) {
		for(Object elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	
}
