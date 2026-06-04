package bootcamp.catalogo.CatalogoLibri;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import bootcamp.catalogo.dto.LibroRequest;
import bootcamp.catalogo.dto.LibroResponse;
import bootcamp.catalogo.exception.LibroNonTrovatoException;
import bootcamp.catalogo.exception.TitoloGiaDuplicatoException;
import bootcamp.catalogo.mapper.LibroMapper;
import bootcamp.catalogo.model.CategoriaLibro;
import bootcamp.catalogo.repository.InMemoryLibroRepository;
import bootcamp.catalogo.service.LibroService;

import org.junit.jupiter.api.Test;

public class AppTest {
	LibroService service = new LibroService(new InMemoryLibroRepository(), new LibroMapper());

	@Test
	void creaLibroConDatiValidi() {
		LibroRequest request = new LibroRequest("Il nome della Rosa", "Eco", CategoriaLibro.NARRATIVA, 450, 24.90);
		LibroResponse response = service.creaLibro(request);
		assertNotNull(response);
		assertEquals("Il nome della Rosa", response.titolo());
		assertEquals("Eco", response.autore());
	}

	@Test 
	void creaLibroConTitoloNull() {
		LibroRequest request = new LibroRequest(null, "Eco", CategoriaLibro.NARRATIVA, 450, 24.90);
		assertThrows(IllegalArgumentException.class,
				() -> service.creaLibro(request));
	}
	
	@Test
	void creaLibroConTitoloDuplicato() {
		LibroRequest request = new LibroRequest("Il nome della Rosa", "Eco", CategoriaLibro.NARRATIVA, 450, 24.90);;
		service.creaLibro(request);
		
		assertThrows(TitoloGiaDuplicatoException.class, () -> service.creaLibro(request));
	}
	
	@Test
	void trovaPerIdConIdEsistente() {
		LibroRequest request = new LibroRequest("Tre piani", "Nevo", CategoriaLibro.NARRATIVA, 450, 24.90);
		service.creaLibro(request);
		assertThrows(IllegalArgumentException.class, () -> service.trovaPerId(1L));
	}
	
	@Test
	void trovaPerIdConIdInesistente() {
		assertThrows(LibroNonTrovatoException.class, () -> service.trovaPerId(9999L));
	}
	
	@Test
	void rimuoviPerId() {
		assertThrows(LibroNonTrovatoException.class, () -> service.rimuoviPerId(1L));
	}
	
	@Test
	void trovaLibriCostosiTotali() {
		 service.creaLibro(new LibroRequest("Clean Code", "Martin", CategoriaLibro.PROGRAMMAZIONE, 431, 35.90));
		 service.creaLibro(new LibroRequest("Una vita come tante", "Yanagihara", CategoriaLibro.NARRATIVA, 450, 21.00));
		 
		 List<LibroResponse> costosi = service.trovaLibriCostosi(30.00);
		 assertEquals(1, costosi);
	}
	
}
