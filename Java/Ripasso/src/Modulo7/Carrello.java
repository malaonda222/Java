package Modulo7;

import java.util.HashMap;
import java.util.Map;

public class Carrello {
	
	
	public static void main(String[] args) {
		Map<Prodotto, Integer> carrello = new HashMap<>();
		
		carrello.put(new Prodotto("bottiglia", 10.0), 2);
		carrello.put(new Prodotto("bottiglia", 10.0), 2); 
		
		System.out.println("Dimensione carrello: " + carrello.size());
		
	}
}
