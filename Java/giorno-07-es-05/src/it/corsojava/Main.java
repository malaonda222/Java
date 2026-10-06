package it.corsojava;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
			String testo = Esercizio_2.leggiContenuto("\\src\\itcorsojava\\testo.txt");
			System.out.println(testo);
		}catch(IOException e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}
}
