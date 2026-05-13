package java_5_Esercizio2Veicolo;

public class Veicolo {
	private String marca;
	private String modello;
	private int anno;
	
	public Veicolo(String marca, String modello, int anno) {
		setMarca(marca);
		setModello(modello);
		setAnno(anno);
	}
	
	public void setMarca(String marca) {
		if (marca == null | marca.trim().isBlank()) {
			throw new IllegalArgumentException("Marca inserita non valida!");
		}
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModello(String modello) {
		if (modello == null | modello.trim().isBlank()) {
			throw new IllegalArgumentException("Modello inserito non valido!");
		}
		this.modello = modello;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setAnno(int anno) {
		if (anno == 0 | anno < 1990 | anno > 2026) {
			throw new IllegalArgumentException("Anno inserito non valido!");
		}
		this.anno = anno;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public String getVeicoloCompleto() {
		return getMarca() + " " + getModello() + " " + getAnno();
	}
	
	public String muoviti() {
		return ("Veicolo: " + getVeicoloCompleto());
	}
}
