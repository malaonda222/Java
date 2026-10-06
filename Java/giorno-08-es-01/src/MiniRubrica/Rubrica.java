package MiniRubrica;

import java.util.*;

public class Rubrica {
	public List<Contatto> contatti = new ArrayList<>();
	private Set<String> emailRegistrate = new HashSet<>();
	private Map<String, Contatto> perEmail = new HashMap<>();
	
	public void aggiungiContatto(Contatto c) {
		if (emailRegistrate.contains(c.getEmail())) {
			throw new IllegalArgumentException("Email già presente in rubrica: " + c.getEmail());
		}
		contatti.add(c);
		emailRegistrate.add(c.getEmail());
		perEmail.put(c.getEmail(), c);
	}
	
	public Contatto cercaPerEmail(String email) {
		if (!perEmail.containsKey(email)) {
			throw new IllegalArgumentException("La mail inserita non è presente in rubrica");
		}
		return perEmail.get(email);
	}
	
	public void stampaTutti() {
		for(Contatto c : contatti) {
			System.out.println(c.toString());
		}
	}
	
}
