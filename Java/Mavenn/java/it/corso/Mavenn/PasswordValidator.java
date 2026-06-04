package it.corso.Mavenn;

public class PasswordValidator {
	public boolean isValida(String password) {
		if(password == null)
			throw new IllegalArgumentException("Password obbligatoria");
		
		if(password.length() < 8)
			throw new IllegalArgumentException("Password troppo corta");
		
		boolean haNumero = false;
		boolean haMaiuscola = false;
		for (char c : password.toCharArray()){
			if(Character.isDigit(c)) {
				haNumero = true;
			}
			if(Character.isUpperCase(c)) {
				haMaiuscola = true;
			}
		}
		if(!haNumero) {
			return false;
		}
		if(!haMaiuscola) {
			return false;
		}
		return true;
		
	}
}
