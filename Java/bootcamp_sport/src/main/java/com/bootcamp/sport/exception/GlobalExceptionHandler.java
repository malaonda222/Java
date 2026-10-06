package com.bootcamp.sport.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SquadraNonTrovataException.class)
	public ResponseEntity<Object> handleSquadraNonTrovata(SquadraNonTrovataException ex) {
		return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
	}

	@ExceptionHandler(GiocatoreNonTrovatoException.class)
	public ResponseEntity<Object> handleGiocatoreNonTrovato(GiocatoreNonTrovatoException ex) {
		return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
	}

	@ExceptionHandler(SquadraDuplicataException.class)
	public ResponseEntity<Object> handleSquadraDuplicata(SquadraDuplicataException ex) {
		return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
	}

	@ExceptionHandler(NumeroMagliaGiaUsatoException.class)
	public ResponseEntity<Object> handleNumeroMagliaGiaUsato(NumeroMagliaGiaUsatoException ex) {
		return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handleIllegalArgument(IllegalArgumentException ex) {
		return buildResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
	}

	private ResponseEntity<Object> buildResponse(HttpStatus status, String message) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("status", status.value());
		body.put("errore", message);
		return new ResponseEntity<>(body, status);
	}
}