package Pratica;

import java.util.List;
import java.util.ArrayList;

public class PecsDemo {
	public static <T> void copia(
		List<? extends T> sorgente,
		List<? super T> destinazione
		
	 ) {
		for(T elemento : sorgente) {
			destinazione.add(elemento);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> interi = List.of(1, 2, 3);
		List<Number> numeri = new ArrayList<>();
		
		copia(interi, numeri);
		System.out.println(numeri);
	}
}
