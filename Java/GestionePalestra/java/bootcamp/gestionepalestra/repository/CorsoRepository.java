package bootcamp.gestionepalestra.repository;

import java.util.List;
import java.util.Optional;

import bootcamp.gestionepalestra.mapper.TipoCorso;
import bootcamp.gestionepalestra.model.Corso;

public interface CorsoRepository {
	Corso save(Corso corso);
	
	Optional<Corso> findById(Long id);
	
	List<Corso> findAll();
	
	List<Corso> findByTipo(TipoCorso tipo);
	
	void deleteById(Long id);
	
	boolean existsById(Long id);
}
