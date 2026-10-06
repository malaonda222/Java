package it.corsojava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OrdineReader {
	public Ordine leggi() throws IOException{
		Path p = Path.of("//src//ordine.txt");
		String contenuto = Files.readString(p);
		String[] righe = contenuto.split("\n");
		
		String cliente = righe[0].trim();
		String prodotto = righe[1].trim();
		int quantita;
		double prezzoUnitario;
		
		try {
			quantita = Integer.parseInt(righe[2].trim());
		}catch (NumberFormatException e) {
			throw new OrdineNonValidoException("Quantità non valida");
		}
		
		try {
			prezzoUnitario = Double.parseDouble(righe[3].trim());
		}catch (NumberFormatException e) {
			throw new OrdineNonValidoException("Prezzo unitario non valido!");
		}
		
		
	
		return new Ordine(cliente, prodotto, quantita, prezzoUnitario);
	}
}
