package Modulo7;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		Map<String, Integer> persone = new HashMap<>();
		
		persone.put("Mario", 44);
		persone.put("Luigi", 23);
		persone.put("Rino", 25);
		
		persone.keySet();
		
		String nomeMax = null;
		int etaMax = 0;
		
		for(Map.Entry<String, Integer> entry : persone.entrySet()) {
			if(entry.getValue() > etaMax) {
				etaMax = entry.getValue();
				nomeMax = entry.getKey();
		}
		}
		System.out.println("Persona più vecchia: " + nomeMax + "; Età: " + etaMax);
		
	}
}
