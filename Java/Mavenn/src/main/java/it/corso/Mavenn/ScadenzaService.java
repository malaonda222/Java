package it.corso.Mavenn;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ScadenzaService {
	public long giorniMancanti(LocalDate oggi, LocalDate scadenza) {
		if (oggi == null || scadenza == null) 
			throw new IllegalArgumentException("Giorni inseriti non validi");
		return ChronoUnit.DAYS.between(oggi, scadenza);
	}
		
	public boolean isScaduta(LocalDate oggi, LocalDate scadenza) {
		if(oggi == null || scadenza == null) {
			throw new IllegalArgumentException("Giorni inseriti non validi");
		}
		return giorniMancanti(oggi, scadenza) < 0;
	}
}
