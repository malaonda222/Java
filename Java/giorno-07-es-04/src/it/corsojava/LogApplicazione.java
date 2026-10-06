package it.corsojava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class LogApplicazione {
	public static void main(String[] args) {
		Path cartella = Path.of("src\\it\\corsojava\\output_logs");
		
		try {
			Files.createDirectories(cartella);
			
			Path appLog = cartella.resolve("app_log.txt");
			Files.writeString(appLog, "Log iniziale\nApplicaizone avviata");
			
			System.out.println("Directory e file creati correttamente");
			System.out.println("Path: " + appLog.toAbsolutePath());
		}catch(IOException e) {
			System.out.println("Errore I/O: " + e.getMessage());
		}
	}
	
}
