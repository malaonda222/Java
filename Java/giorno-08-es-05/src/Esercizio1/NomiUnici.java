package Esercizio1;

import java.util.*;

public class NomiUnici {
	public static void main(String[] args) {
		List<String> listaNomi = new ArrayList<>();
		Set<String> setNomi = new HashSet<>();
		
		listaNomi.add("Lisa");
		listaNomi.add("Anna");
		listaNomi.add("Marco");
		listaNomi.add("Marco");
		listaNomi.add("Lisa");
		listaNomi.add("Elena");
		
		for(String nome:listaNomi) {
			setNomi.add(nome);
		}
		
		int nomiLista = listaNomi.size();
		int nomiSet = setNomi.size();
		int risultato = nomiLista - nomiSet;
		System.out.println("Differenza: " + risultato);
	}
	
	
}
