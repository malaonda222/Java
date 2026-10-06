package it.corsojava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConfigurazioneReader {
	public ConfigurazioneApp leggi() throws IOException {
		Path p = Path.of("src//it//corsojava//config.txt");
		String contenuto = Files.readString(p);
		String[] righe = contenuto.split("\n");
		
		String nomeApplicazione = righe[0].trim();
		String versione = righe[1].trim();
		String ambiente = righe[2].trim();
		int porta = Integer.parseInt(righe[3].trim());
		
		return new ConfigurazioneApp(nomeApplicazione, versione, ambiente, porta);
	}
}
