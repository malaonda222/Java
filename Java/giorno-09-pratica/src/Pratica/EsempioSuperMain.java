package Pratica;

import java.util.*;

public class EsempioSuperMain {
	public static void main(String[] args) {
		List<Integer> interi = new ArrayList<>();
		EsempioSuperDemo.aggiungiInteri(interi);
		System.out.println(interi);
		
		List<Number> numeri = new ArrayList<>();
		EsempioSuperDemo.aggiungiInteri(numeri);
		System.out.println(numeri);
		
		List<Object> oggetti = new ArrayList<>();
		EsempioSuperDemo.aggiungiInteri(oggetti);
		System.out.println(oggetti);
	}
}
