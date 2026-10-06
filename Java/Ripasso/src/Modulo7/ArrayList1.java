package Modulo7;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	
	public static void main(String[] args) {
		List<String> cittaItaliane = new ArrayList<>();
		cittaItaliane.add("Firenze");
		cittaItaliane.add("Roma");
		cittaItaliane.add("Milano");
		cittaItaliane.add("Bologna");
		cittaItaliane.add("Lecce");
		
		cittaItaliane.remove("Firenze");
		System.out.println("La lista contiene Milano? " + cittaItaliane.contains("Milano"));
		System.out.println("Citta: " + cittaItaliane);
		
		for(String citta:cittaItaliane) {
			System.out.println(citta);
		}
	}
}
