package ClasseGenerica;

import java.util.ArrayList;
import java.util.Optional;

public class Pila <T>{
	private ArrayList<T> elementi = new ArrayList<>();
	
	public void push(T elemento) {
		elementi.add(elemento);
	};
	
	public Optional<T> pop(){
		if(elementi.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(elementi.remove(elementi.size() - 1));
	}
	
	public int size() {
		return elementi.size();
	};
	
}
