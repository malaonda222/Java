package bootcamp.gestionepalestra.exception;

public class CorsoNonTrovatoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CorsoNonTrovatoException(Long id) {
		super("Corso con id: " + id + " non trovato");
	}
}
