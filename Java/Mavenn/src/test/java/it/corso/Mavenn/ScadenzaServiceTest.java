package it.corso.Mavenn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ScadenzaServiceTest {
	@Test
	void oggiNull() {
		ScadenzaService s = new ScadenzaService();
		
		assertThrows(IllegalArgumentException.class, () -> s.giorniMancanti(null, LocalDate.of(2026,  5, 28)));
	}
	
	@Test
	void scadenzaNull() {
		ScadenzaService s1 = new ScadenzaService();
		
		assertThrows(IllegalArgumentException.class, () -> s1.giorniMancanti(LocalDate.of(2026,  5, 28), null));
	}
	
	@Test 
	void scadenzaPassata() {
		ScadenzaService s2 = new ScadenzaService();
		LocalDate oggi = LocalDate.now();
		LocalDate scadenza = LocalDate.of(2026, 5, 1);
		assertTrue(s2.isScaduta(oggi,  scadenza));
	}
	
	@Test
	void scadenzaFutura() {
		ScadenzaService s3 = new ScadenzaService();
		LocalDate oggi = LocalDate.now();
		LocalDate scadenza = LocalDate.of(2026, 5, 28);
		assertFalse(s3.isScaduta(oggi, scadenza));
	}
	
	@Test 
	void dateValide() {
		ScadenzaService s4 = new ScadenzaService();
		
		long giorniDifferenza = s4.giorniMancanti(LocalDate.of(2026, 5, 26), LocalDate.of(2026, 5, 29));
		
		assertEquals(3, giorniDifferenza);
	}
	
}
