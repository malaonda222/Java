package java_3;

public class PasswordValidator {
	public static void main(String[] args) {
		String pwd = "Java20268";
		
		if (isPasswordValida(pwd)) {
			System.out.println("Password valida");
		}else{
			System.out.println("Password non valida");
		};
	}
	
	public static boolean haLunghezzaValida(String pwd) {
		return pwd.length() >= 8;
	}
	
	public static boolean contieneNumero(String pwd) {
		for (char c: pwd.toCharArray()) {
			if(Character.isDigit(c)) return true;
		}
		return false;
	}	
	
	public static boolean contieneMaiuscola(String pwd) {
		for (char c: pwd.toCharArray()) {
			if (Character.isUpperCase(c)) return true;
		}
		return false;
	}
	
	public static boolean isPasswordValida(String pwd) {
		return (haLunghezzaValida(pwd) 
				&& contieneNumero(pwd) 
				&& contieneMaiuscola(pwd));
	}
	
}

