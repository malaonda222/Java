package it.corsojava;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		OrdineReader reader = new OrdineReader();
		OrdineValidator validator = new OrdineValidator();
		ReportWriter writer = new ReportWriter();
		
		try {
			Ordine ordine = reader.leggi();
			validator.controlla(ordine);
			writer.scrivi(ordine.riepilogo());
			System.out.println(ordine.riepilogo());
			System.out.println("Report scritto in. report-ordine.txt");
			
		}catch(IOException e) {
			System.out.println("Errore file: " + e.getMessage());
			try {
				writer.scrivi("Importazione fallita. Motivo: " + e.getMessage());
			}catch(IOException ex) {
				System.out.println("Errore file: " + ex.getMessage());
			}
			
		}catch (OrdineNonValidoException e){
			System.out.println("Ordine non valido: " + e.getMessage());
			try{
				writer.scrivi("Importazione fallita. Motivo: " + e.getMessage());
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
		}
	}
}
}
