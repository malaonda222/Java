package ClasseGenerica;

public class Main {
	public static void main(String[] args) {
		Coppia <String, Integer> coppia1 = new Coppia<>("Fabio", 44);
		Coppia <Double, Boolean> coppia2 = new Coppia<>(10.0, true);
		
		coppia1.stampa();
		coppia2.stampa();

		Pila<String> stack = new Pila<>();
		stack.push("Mario");
		stack.push("Luigi");
		
		String risultato = stack.pop().orElse("Pila vuota");
		System.out.println(risultato);
		
		stack.pop().ifPresent(elemento -> System.out.println("Estratto: " + elemento));
		
		System.out.println("Dimensione: " + stack.size());
		
	}
}
