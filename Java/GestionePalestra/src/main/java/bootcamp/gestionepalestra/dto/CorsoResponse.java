package bootcamp.gestionepalestra.dto;

public record CorsoResponse(
		Long id,
	    String nome,
	    String istruttore,
	    String tipo,
	    int durataMinuti,
	    double prezzo,
	    int orario
) {}
