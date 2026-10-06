package it.corso.Mavenn;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
	@Test
	void passwordNulla() {
		PasswordValidator password = new PasswordValidator();
		
		assertThrows(IllegalArgumentException.class, () -> password.isValida(null));		
	}
	
	@Test
	void passwordTroppoCorta() {
		PasswordValidator password1 = new PasswordValidator();
		
		assertThrows(IllegalArgumentException.class, () -> password1.isValida("ciao"));
	}
	
	@Test
	void passwordSenzaNumero() {
		PasswordValidator password2 = new PasswordValidator();
		
		assertFalse(password2.isValida("maven-java"));
	}
	
	@Test
	void passwordSenzaMaiuscola() {
		PasswordValidator password3 = new PasswordValidator();
		
		assertFalse(password3.isValida("mavenjava8"));
	}
	
	@Test
	void passwordValida() {
		PasswordValidator password4 = new PasswordValidator();
		
		assertTrue(password4.isValida("MavenJava999"));
	}
	
	
}
