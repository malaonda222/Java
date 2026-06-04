package it.corso.bootcamp.service;
import java.util.List;
import org.springframework.stereotype.Service;
import it.corso.bootcamp.dto.ProdottoResponse;

@Service 
public class ProdottoService {
	public List<ProdottoResponse> findAll(){
		return List.of(
				new ProdottoResponse(1L, "Mouse", 29.99),
				new ProdottoResponse(2L, "Monitor", 180.00)
			);
	}
	
	public ProdottoResponse findFirst() {
		return findAll().get(0);
	}
	
	public ProdottoResponse findById(Long id) {
		return findAll().stream()
				.filter(p -> p.id() == id)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Prodotto non trovato"));
	}
	
	public void delete(Long id) {
		ProdottoResponse prodotto = findById(id);
		System.out.println("Nome prodotto: " + prodotto.nome());
	}
}
