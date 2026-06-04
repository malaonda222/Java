package bootcamp.catalogo.exception;

@SuppressWarnings("serial")
public class TitoloGiaDuplicatoException extends RuntimeException {
		
		public TitoloGiaDuplicatoException(String titolo) {
			super("Titolo del libro: " + titolo + " : duplicato");
		}
}