package it.corsojava;

@SuppressWarnings("serial")
public class OrdineNonValidoException extends RuntimeException{
	public OrdineNonValidoException(String messaggio) {
		super(messaggio); //passa il testo alla classe madre RuntimeException che lo conserva internamente
	}
}
