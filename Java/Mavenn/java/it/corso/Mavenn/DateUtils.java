package it.corso.Mavenn;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {
	public long giorniAllaScadenza(
			LocalDate oggi, LocalDate scadenza) {
		if(oggi == null || scadenza == null)
			throw new IllegalArgumentException("Date obbligatorie");
		if(oggi.isAfter(scadenza))
			throw new IllegalArgumentException("Scadenza oltre il termine consentito");
		return ChronoUnit.DAYS.between(oggi,  scadenza);
}
};
