package Modulo6;

@SuppressWarnings("serial")
public class EtaNonValidaException extends RuntimeException{
	
	public EtaNonValidaException (String messaggio){
		super(messaggio);
	}
}
