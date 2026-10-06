package Modulo5;

public class Switch {
	Object oggetto;
	
	public Switch(Object oggetto) {
		this.oggetto = oggetto;
	};
	
	public void analizza() {
		String messaggio;
		
		if (oggetto instanceof String s) {
			messaggio = "Stringa: " + s.toUpperCase();
		}else if (oggetto instanceof Integer i) {
			messaggio = "Intero doppio: " + (i * 2);
		}else if (oggetto instanceof Boolean b) {
			messaggio = "Contrario: " + !b;
		}else{
			messaggio = "Tipo non gestito";
		};
	
		System.out.println(messaggio);
	}
	
	
	
}
