package it.corso.MiniCatalogo.mapper;

import it.corso.MiniCatalogo.dto.ProdottoRequest;
import it.corso.MiniCatalogo.dto.ProdottoResponse;
import it.corso.MiniCatalogo.model.Prodotto;

public class ProdottoMapper {

	//Da Model a DTO di risposta (output)
	public static ProdottoResponse toResponse(
			Prodotto prodotto) {
		return new ProdottoResponse(
				prodotto.getId(),
				prodotto.getNome(),
				prodotto.getPrezzo()
				);
	}
	
	//Da DTO di richiesta a Model (input)
	public static Prodotto toModel(
			ProdottoRequest request) {
		return new Prodotto(
				null,
				request.nome(),
				request.prezzo()
				);
	}
	
	
}
