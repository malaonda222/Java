package bootcamp.gestionepalestra.service;

import java.util.List;

import bootcamp.gestionepalestra.dto.CorsoRequest;
import bootcamp.gestionepalestra.dto.CorsoResponse;
import bootcamp.gestionepalestra.exception.CorsoNonTrovatoException;
import bootcamp.gestionepalestra.mapper.CorsoMapper;
import bootcamp.gestionepalestra.mapper.TipoCorso;
import bootcamp.gestionepalestra.model.Corso;
import bootcamp.gestionepalestra.repository.CorsoRepository;

public class CorsoService {
	
	private final CorsoRepository repository;
	private final CorsoMapper mapper;
	private long nextId = 4L;
	
	public CorsoService(CorsoRepository repository, CorsoMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public void valida(CorsoRequest request){
		if(request.nome() == null || request.nome().trim().isBlank()) {
			throw new IllegalArgumentException("Nome non valido");
		}
		if(request.istruttore() == null || request.istruttore().trim().isBlank()) {
			throw new IllegalArgumentException("Istruttore non valido");
		}
		if(request.tipo() == null) {
			throw new IllegalArgumentException("Tipologia non valida");
		}
		if(request.durataMinuti() <= 0) {
			throw new IllegalArgumentException("Le durata non può essere inferiore o uguale a 0");
		}
		if(request.prezzo() < 0) {
			throw new IllegalArgumentException("Il prezzo non può essere inferiore a 0");
		}
		if(request.orario() < 1 || request.orario() > 12) {
			throw new IllegalArgumentException("L'orario non è valido");
		}
	}
	
	public CorsoResponse creaCorso(CorsoRequest request) {
		valida(request);
		Corso c = mapper.toModel(nextId++, request);
		repository.save(c);
		return mapper.toResponse(c);
	}
	
	public CorsoResponse trovaPerId(Long id) {
		CorsoResponse corso = repository.findById(id)
			.map(mapper::toResponse)
			.orElseThrow(() -> new CorsoNonTrovatoException(id));
		return corso;
	}
	
	public List<CorsoResponse> trovaTutti(){
		return repository.findAll().stream()
				.map(mapper::toResponse)
				.toList();
	}
	
	public List<CorsoResponse> trovaPerTipo(TipoCorso tipo){
		return repository.findByTipo(tipo).stream()
				.map(mapper::toResponse)
				.toList();
	}
	
	public List<CorsoResponse> trovaCorsiMattutini(){
		return repository.findAll().stream()
				.filter(c -> c.isMattutino())
				.map(mapper::toResponse)
				.toList();
	}
	
	public void rimuoviPerId(Long id) {
		repository.deleteById(id);
	}
}; 
