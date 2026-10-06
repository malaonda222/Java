package it.corso.Mavenn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScontoServiceTest {
	@Test
	void scontoValidoPrezzoRidotto() {
		// Arrange
		ScontoService s = new ScontoService();

		// Act
		double risultato = s.applicaSconto(200.0, 0.3);

		// Assert
		assertEquals(140, risultato);
	}
	
	@Test
	void prezzoNegativoLanciaEccezione() {
		//Arrange
		ScontoService p = new ScontoService();
		
		assertThrows(IllegalArgumentException.class, () -> p.applicaSconto(-3, 0.3));
	}
	
	@Test 
	void percentualeNegativaLanciaEccezione() {
		ScontoService p1 = new ScontoService();
		
		assertThrows(IllegalArgumentException.class, () -> p1.applicaSconto(390.0, -1));
	}
	
	@Test 
	void percentualeScontoNegativi() {
		ScontoService p2 = new ScontoService();
		
		assertThrows(IllegalArgumentException.class, () -> p2.applicaSconto(-1, -1));
	}
}
