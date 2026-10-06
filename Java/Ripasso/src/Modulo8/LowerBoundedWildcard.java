package Modulo8;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
	public static void riempiLista(List<? super Integer> lista, int quantita){ 
		for(int i = 0; i <= quantita; i++) {
			lista.add(i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> interi = new ArrayList<>();
		List<Number> numeri = new ArrayList<>();
		List<Object> oggetti = new ArrayList<>();
		
		riempiLista(interi, 5);
		riempiLista(numeri, 4);
		riempiLista(oggetti, 2);
		System.out.println("Interi: " + interi);
		System.out.println("Numeri: " + numeri);
		System.out.println("Oggetti: " + oggetti);
		
	}
}
