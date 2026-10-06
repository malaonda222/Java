package it.corsojava;

import java.nio.file.*;
import java.io.IOException;
 
public class FileFinder {
 
	public static Path trova(String nomeFile) {
	    try {
	        return Files.walk(Path.of(""), 4)
	                .filter(Files::isRegularFile)
	                .filter(p -> p.getParent() != null)
	                .filter(p -> p.getFileName().toString().equals(nomeFile))
	                .filter(p -> !p.normalize().startsWith(Path.of("bin"))) // esclude bin
	                .findFirst()
	                .orElse(null);
	    } catch (IOException e) {
	        return null;
	    }
	}
}