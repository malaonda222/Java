package java_6_Esercizio1StudenteDto;

public record StudenteDto(String nome, String cognome, double media) {
	public StudenteDto{
		if(nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome obbligatorio!");
		}
		
		if(cognome == null || cognome.trim().isBlank()) {
			throw new IllegalArgumentException("Cognome obbligatorio!");
		}
		
		if(media <= 0 || media > 30) {
			throw new IllegalArgumentException("Media non valida!");
		}
	}

	public boolean isPromosso() {
		return media >= 18;
	}
}

