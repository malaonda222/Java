package java_6_Esercizio0Generale;

public enum CategoriaProdotto {
	ELETTRODOMESTICI("Prodotti per la casa"),
	ESTETICA("Prodotti di bellezza"),
	SPORT("Attrezzatura e accessori sportivi");
	
	private final String categoria;

	CategoriaProdotto(String categoria){
		this.categoria = categoria;
	}
	
	public String categoria() {
		return categoria;
	}
}