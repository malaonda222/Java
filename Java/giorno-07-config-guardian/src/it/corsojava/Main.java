package it.corsojava;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		ConfigurazioneReader reader = new ConfigurazioneReader();
		ConfigurazioneValidator validator = new ConfigurazioneValidator();
		
		try {
			ConfigurazioneApp config = reader.leggi();
			validator.valida(config);
			System.out.println("✅ Configurazione valida!");
            System.out.println("Nome applicazione: " + config.getNomeApplicazione());
            System.out.println("Versione: " + config.getVersione());
            System.out.println("Ambiente: " + config.getAmbiente());
            System.out.println("Porta: " + config.getPorta());
		}catch (IOException e) {
			System.out.println("Errore tecnico: " + e.getMessage());
		}catch(ConfigurazioneNonValidaException e) {
			System.out.println("Errore logico: " + e.getMessage());
		}
	}
	}
	
