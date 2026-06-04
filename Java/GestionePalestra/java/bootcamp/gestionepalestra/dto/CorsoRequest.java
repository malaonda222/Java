package bootcamp.gestionepalestra.dto;

import bootcamp.gestionepalestra.mapper.TipoCorso;

public record CorsoRequest(
		String nome, 
		String istruttore,
		TipoCorso tipo,
		int durataMinuti, 
		double prezzo,
		int orario) {
}
