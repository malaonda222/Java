package it.corsojava;

@SuppressWarnings("serial")
public class ConfigurazioneNonValidaException extends RuntimeException{
	public ConfigurazioneNonValidaException(String messaggio) {
		super(messaggio);
	}
}
