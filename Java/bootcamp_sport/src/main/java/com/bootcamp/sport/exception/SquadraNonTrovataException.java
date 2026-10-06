package com.bootcamp.sport.exception;

@SuppressWarnings("serial")
public class SquadraNonTrovataException extends RuntimeException {
	public SquadraNonTrovataException(Long id) {
			super("Id della squadra: " + id + " : non trovato");
		}
}
