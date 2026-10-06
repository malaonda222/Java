package it.corso.MiniCatalogo;

import java.util.List;

import it.corso.MiniCatalogo.dto.ProdottoRequest;
import it.corso.MiniCatalogo.dto.ProdottoResponse;
import it.corso.MiniCatalogo.repository.InMemoryProdottoRepository;
import it.corso.MiniCatalogo.repository.ProdottoRepository;
import it.corso.MiniCatalogo.service.ProdottoService;

public class Main {
	public static void main(String[] args) {
		
		//1. Crea le dipendenze
		ProdottoRepository repository = new InMemoryProdottoRepository();
		ProdottoService service = new ProdottoService(repository);
		
		//2. Crea un nuovo prodotto
		service.creaProdotto(new ProdottoRequest("Webcam", 79.99));
		
		//3. Recupera tutti i prodotti
		List<ProdottoResponse> prodotti = service.trovaTutti();
		
		//4. Mostra i risultati
		for (ProdottoResponse prodotto:prodotti) {
			System.out.println(prodotto.nome() + " - euro " + prodotto.prezzo());
		}
	}
}
