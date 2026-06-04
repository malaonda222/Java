package Pratica;

import java.util.Optional;

public class OptionalCreazioneDemo {
	public static void main(String[] args) {
		Optional<String> vuoto = Optional.empty();
		Optional<String> pieno = Optional.of("Java");
		
		String valore = null;
		Optional<String> forse = Optional.ofNullable(valore);
		
		System.out.println(vuoto.isPresent());
		System.out.println(pieno.isPresent());
		System.out.println(forse.isPresent());
		System.out.println(pieno.get());
	}
}
