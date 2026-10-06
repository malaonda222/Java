package com.bootcamp.sport.exception;

@SuppressWarnings("serial")
public class GiocatoreNonTrovatoException extends RuntimeException{
	public GiocatoreNonTrovatoException(Long id) {
		super("Id del giocatore : " + id + " : non trovato");
	}
}
