package com.bootcamp.sport.exception;

@SuppressWarnings("serial")
public class NumeroMagliaGiaUsatoException extends RuntimeException{
	public NumeroMagliaGiaUsatoException(Long squadraId, int numeroMaglia) {
		super("Numero di maglia " + numeroMaglia + " già usato nella squadra con id: " + squadraId);
	}
}
