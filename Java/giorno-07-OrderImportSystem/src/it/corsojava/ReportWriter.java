package it.corsojava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReportWriter {
	public void scrivi(String contenuto) throws IOException{
		Path p = Path.of("//src//report-ordine.txt");
		Files.writeString(p, contenuto);
		
	}
}
