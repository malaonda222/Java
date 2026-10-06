package it.corso.Mavenn;

public class ScontoService {
	public double applicaSconto(
			double prezzo, double percentuale) {
		if(prezzo < 0)
			throw new IllegalArgumentException("Prezzo non valido!");
		if(percentuale < 0 || percentuale > 1) 
			throw new IllegalArgumentException(
					"Percentuale non valida!");
		return prezzo - (prezzo*percentuale);
	}
};
