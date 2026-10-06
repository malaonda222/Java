package it.corsojava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistroErrori_1 {
	public static void main(String[] args) {
		Path input = FileFinder.trova("input.txt");
		Path output = FileFinder.trova("output.txt");	
		
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
