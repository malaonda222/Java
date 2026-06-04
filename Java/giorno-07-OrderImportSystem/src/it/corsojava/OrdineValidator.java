package it.corsojava;

public class OrdineValidator {
	public void controlla(Ordine ordine) throws OrdineNonValidoException {
		if (ordine.getCliente() == null || ordine.getCliente().trim().isBlank()) {
			throw new OrdineNonValidoException("Cliente inserito non valido");
		}
		if (ordine.getProdotto() == null || ordine.getProdotto().trim().isBlank()) {
			throw new OrdineNonValidoException("Prodotto non valido");
		}
		if (ordine.getQuantita() <= 0){
			throw new OrdineNonValidoException("Quantità non valida");
		}
		if (ordine.getPrezzoUnitario() <= 0) {
			throw new OrdineNonValidoException("Prezzo Unitario non valido");
		}
	}
}
