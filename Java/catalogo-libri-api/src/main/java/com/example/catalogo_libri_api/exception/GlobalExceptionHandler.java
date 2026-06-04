package com.example.catalogo_libri_api.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.catalogo_libri_api.dto.ErrorDto;

import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(LibroNonTrovatoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorDto gestisciNonTrovato(LibroNonTrovatoException ex) {
		return new ErrorDto(ex.getMessage(), 404);
	}
	
	@ExceptionHandler(LibroNonValidoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDto gestisciNonValido(LibroNonValidoException ex) {
		return new ErrorDto(ex.getMessage(), 400);
	}
	
	@ExceptionHandler(TitoloGiaDuplicatoException.class)
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	public ErrorDto gestisciDuplicato(TitoloGiaDuplicatoException ex) {
		return new ErrorDto(ex.getMessage(), 400);
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorDto gestisciGenerico(Exception ex) {
		return new ErrorDto("Errore interno", 500);
	}	
}
