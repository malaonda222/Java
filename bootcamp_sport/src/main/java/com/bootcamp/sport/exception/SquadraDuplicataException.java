package com.bootcamp.sport.exception;

@SuppressWarnings("serial")
public class SquadraDuplicataException extends RuntimeException{

	public SquadraDuplicataException(String nome) {
		super("Squadra " + nome + " : duplicata");
	}
}
