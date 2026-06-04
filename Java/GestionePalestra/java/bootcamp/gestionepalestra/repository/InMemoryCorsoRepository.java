package bootcamp.gestionepalestra.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import bootcamp.gestionepalestra.mapper.TipoCorso;
import bootcamp.gestionepalestra.model.Corso;

public class InMemoryCorsoRepository implements CorsoRepository {
	
	private final Map<Long, Corso> archivio = new HashMap<>();
	
	public InMemoryCorsoRepository() {
		 Corso c1 = new Corso(1L, "Yoga del mattino", "Mario Rossi",
				 TipoCorso.YOGA, 60, 15.00, 8);
		 Corso c2 = new Corso(2L, "Spinning avanzato", "Laura Bianchi",
				 TipoCorso.SPINNING, 45, 20.00, 18);
		 Corso c3 = new Corso(3L, "Pilates base", "Anna Verdi",
				 TipoCorso.PILATES, 50, 12.00, 10);
	 
		 archivio.put(c1.getId(), c1);
		 archivio.put(c2.getId(), c2);
		 archivio.put(c3.getId(), c3);
	}
	
	@Override
	public Corso save(Corso corso) {
		archivio.put(corso.getId(), corso);
		return corso;
	}
	
	@Override
	public Optional<Corso> findById(Long id){
		return Optional.ofNullable(archivio.get(id));
	}
	
	@Override
	public List<Corso> findAll() {
		return new ArrayList<>(archivio.values());
	}
	
	@Override
	public List<Corso> findByTipo(TipoCorso tipo) {
		List<Corso> risultato = new ArrayList<>();
		for (Corso c:archivio.values()) {
			if(c.getTipo() == tipo) {
				risultato.add(c);
			}
		}
		return risultato;
	}
	
	@Override
	public void deleteById(Long id) {
		archivio.remove(id);
	}
	
	@Override
	public boolean existsById(Long id) {
		return archivio.containsKey(id);
	}
}