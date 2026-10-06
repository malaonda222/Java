package Pratica;

import java.util.*;
import java.util.Optional;

public class UtenteRepository {
	private final List<Utente> utenti = new ArrayList<>();
	
	public void save(Utente u) {utenti.add(u);}
	
	public Optional<Utente> findByEmail(String email){
		return utenti.stream().filter(u -> u.email().equals(email)).findFirst();
	}
	
	public Optional<Utente> findById(int id){
		return utenti.stream().filter(u -> u.id() == id).findFirst();
	}
	
	
}

