package bootcamp.gestionepalestra.mapper;

import java.util.List;

import bootcamp.gestionepalestra.dto.CorsoRequest;
import bootcamp.gestionepalestra.dto.CorsoResponse;
import bootcamp.gestionepalestra.model.Corso;

public class CorsoMapper {
	
	//Request + id generato -> Model (usato in creaCorso)
	public Corso toModel(Long id, CorsoRequest request) {
		return new Corso(
				id,
				request.nome(),
				request.istruttore(),
				request.tipo(),
				request.durataMinuti(),
				request.prezzo(),
				request.orario()
			);
	}
	
	public CorsoResponse toResponse(Corso corso) {
		return new CorsoResponse(
				corso.getId(), 
				corso.getNome(),
				corso.getIstruttore(),
				corso.getTipo().name(),
				corso.getDurataMinuti(),
				corso.getPrezzo(),
				corso.getOrario()
			);
	}
	
	public List<CorsoResponse> toResponseList(List<Corso> corsi) {
		return corsi.stream()
				.map(this::toResponse)
				.toList();
	}
}