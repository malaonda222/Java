package Pratica;

import java.util.*;

public class Repository <T>{
	private final List<T> elementi = new ArrayList<>();
	
	public void save(T elemento) {
		elementi.add(elemento);
	}
	
	public List<T> findAll(){
		return elementi;
	}
	
	public Optional<T> findFirst(){
		if(elementi.isEmpty()) return Optional.empty();
		return Optional.of(elementi.get(0));
	}
	
	public int count() {
		return elementi.size();
	}
}
