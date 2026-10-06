package it.corsojava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


public class RegistroErrori {
	public static void main(String[] args) {
		Path input = Path.of("src\\it\\corsojava\\input.txt").toAbsolutePath();
		Path output = Path.of("src\\it\\corsojava\\output.txt").toAbsolutePath();		
		try {
			String contenuto = Files.readString(input);
			String trasformato = contenuto.toUpperCase();
			Files.writeString(output, trasformato);
			
			System.out.println("File elaborato correttamente.");
			System.out.println("Risultato scritto in: " + output.toAbsolutePath());
		}catch (IOException e){
			System.out.println("Errore nella gestione del file.");
			System.out.println("Dettaglio: " + e.getMessage());
			e.printStackTrace();
		}
	}
}