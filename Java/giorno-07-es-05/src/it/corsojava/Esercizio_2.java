package it.corsojava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Esercizio_2 {
	public static String leggiContenuto(String nomeFile) throws IOException{
		return Files.readString(Path.of(nomeFile));
	}
}
