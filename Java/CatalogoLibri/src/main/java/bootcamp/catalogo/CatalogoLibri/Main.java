package bootcamp.catalogo.CatalogoLibri;

import bootcamp.catalogo.dto.LibroRequest;
import bootcamp.catalogo.dto.LibroResponse;
import bootcamp.catalogo.exception.LibroNonTrovatoException;
import bootcamp.catalogo.exception.TitoloGiaDuplicatoException;
import bootcamp.catalogo.mapper.LibroMapper;
import bootcamp.catalogo.model.CategoriaLibro;
import bootcamp.catalogo.repository.InMemoryLibroRepository;
import bootcamp.catalogo.repository.LibroRepository;
import bootcamp.catalogo.service.LibroService;

public class Main {
	public static void main(String[] args) {
		
		LibroRepository repository = new InMemoryLibroRepository();
		LibroMapper mapper = new LibroMapper();
		LibroService service = new LibroService(repository, mapper);
		
		
		LibroRequest request = new LibroRequest(
				"Il nome della rosa",
				"Eco",
				CategoriaLibro.NARRATIVA,
				450,
				24.90
		);
		
		LibroRequest request1 = new LibroRequest(
				"Tre piani",
				"Nevo", 
				CategoriaLibro.SAGGISTICA,
				250,
				13.40
		);
		
		LibroRequest request2 = new LibroRequest(
				"Il Signore degli Anelli",
				"Tolkien",
				CategoriaLibro.ALTRO,
				670,
				50.80
		);
		
	/*	LibroRequest request3 = new LibroRequest(
				" ",
				"Rowling",
				CategoriaLibro.SCIENTIFICO,
				200,
				35.09
		);*/
		
		LibroResponse response = service.creaLibro(request);
		response.titolo();
		
		LibroResponse response1 = service.creaLibro(request1);
		response1.autore();
		
		LibroResponse response2 = service.creaLibro(request2);
		response2.pagine();
		
		/*LibroResponse response3 = service.creaLibro(request3);
		response3.prezzo(); */
		
		try {
			service.trovaPerId(1L);
		}catch(LibroNonTrovatoException e) {
			System.out.println("Errore: " + e.getMessage());
		}
		
		
		try {
			service.trovaPerId(999L);
		}catch(LibroNonTrovatoException e) {
			System.out.println("Errore: " + e.getMessage());
		}
		
		try {
			service.creaLibro(request1);
		}catch(TitoloGiaDuplicatoException e) {
			System.out.println("Errore: " + e.getMessage());
		}
		
		System.out.println("Elenco libri: " + service.trovaTutti());
		
		System.out.println("Libri con categoria 'PROGRAMMAZIONE' : " + service.trovaPerCategoria(CategoriaLibro.PROGRAMMAZIONE));
		
		System.out.println("Elenco libri costosi: " + service.trovaLibriCostosi(30.00));
		
		service.rimuoviPerId(1L);
		System.out.println("Verifica eliminazione: " + service.trovaTutti());
		
	}
}