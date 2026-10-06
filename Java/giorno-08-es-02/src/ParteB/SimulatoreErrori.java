package ParteB;

import java.util.*;

public class SimulatoreErrori {
	public static void main(String[] args) {
		List<String> simulatore = new ArrayList<>();
		Map<String, String> utenti = new HashMap<>();
		
		String a1 = new String("Java");
		String b1 = new String("Java");
		
		System.out.println(a1 == b1);
		System.out.println(a1.equals(b1));
		
		simulatore.add("Lucia");
		simulatore.add("Mario");
		simulatore.add("Lucia");
		
		utenti.put("f01", "Fabrizio");
		utenti.put("v02", "Marco");
		utenti.put("e05", "Carlo");
		utenti.put("t02", "Sara");
		
		
		System.out.println(simulatore.get(1));
		
		String[] persone = new String[2];
		persone[0] = "Anna";
		persone[1] = "Mario";
		
		System.out.println(persone[0]);

		for (Map.Entry<String, String> entry : utenti.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println(utenti.get("f01"));
		
		if(utenti.containsKey("f01")) {
			System.out.println("Luca fa parte degli utenti");
		}
		
		
	}
	
}
