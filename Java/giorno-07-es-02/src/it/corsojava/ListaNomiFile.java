package it.corsojava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class ListaNomiFile {
	public static void main(String[] args) {
		Path input = Path.of("src\\it\\corsojava\\nomi.txt").toAbsolutePath();
		
		try {
			String contenuto = Files.readString(input);
			String maiuscolo = contenuto.toUpperCase();
			Files.writeString(input, maiuscolo);
			System.out.println("File aggiornato con successo");
		}catch (IOException e){
			System.out.println("Errore nella lettura/scrittura del file");
			System.out.println("Messaggio di errore: " + e.getMessage());
		}
}
}
