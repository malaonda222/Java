package Modulo6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileIO {
	public static void main(String[] args) {
		Path path = Path.of("src\\Modulo6\\nomi.txt");
		
		try {
			Files.writeString(path, "Mario\n");
			Files.writeString(path, "Luigi\n", StandardOpenOption.APPEND);
			Files.writeString(path, "Alessio",  StandardOpenOption.APPEND);
			System.out.println(System.getProperty("user.dir"));
			System.out.println("File scritto correttamente");
			System.out.println("Percorso: " + path.toAbsolutePath());
			
			String contenuto = Files.readString(path);
			System.out.println(contenuto);

		}catch(IOException e) {
			System.out.println("Errore scrittura file: " + e.getMessage());
		}
	}
}
