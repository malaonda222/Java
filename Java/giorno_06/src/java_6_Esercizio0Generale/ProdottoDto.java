package java_6_Esercizio0Generale;

public record ProdottoDto(String nome, double prezzo) {
	public ProdottoDto {
		if(nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome obbligatorio");
		}
		if(prezzo < 0) {
			throw new IllegalArgumentException("Prezzo non valido " + prezzo);
		}
}
}