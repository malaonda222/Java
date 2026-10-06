package it.corso.Mavenn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;

public class DateUtilsTest {
	@Test 
	void dateValide() {
		DateUtils o = new DateUtils();
		
		long differenzaGiorni = o.giorniAllaScadenza(LocalDate.of(2026, 5, 27), LocalDate.of(2026, 5, 28));
		
		assertEquals(1, differenzaGiorni);
	}
	
	@Test 
	void oggiNull() {
		DateUtils o1 = new DateUtils();
		
		assertThrows(IllegalArgumentException.class, () -> o1.giorniAllaScadenza(null, LocalDate.of(2026, 5, 27)));
	}
	
	@Test
	void dataNull() {
		DateUtils o2 = new DateUtils();
		
		assertThrows(IllegalArgumentException.class, () -> o2.giorniAllaScadenza(LocalDate.now(), null));
	}
	
	@Test
	void dateNonValide(){
		DateUtils o3 = new DateUtils();
		
		assertThrows(IllegalArgumentException.class, () -> o3.giorniAllaScadenza(null, null));
	}
}
