package com.example.catalogo_libri.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.catalogo_libri.entity.CategoriaLibro;
import com.example.catalogo_libri.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	
	List<Libro> findByCategoria(CategoriaLibro categoria);
	List<Libro> findByPrezzoGreaterThan(BigDecimal prezzo);
	List<Libro> findByAutore(String autore);
	List<Libro> findByPrezzoLessThan(BigDecimal prezzo);

	@Query(value = "SELECT * FROM libri WHERE prezzo > :soglia", nativeQuery = true)
	List<Libro> findLibriCostosi(@Param("soglia") BigDecimal soglia);
	
	@Query(value = "SELECT * FROM libri WHERE categoria = :categoria AND prezzo < :prezzo", nativeQuery = true)
	List<Libro> findByCategoriaEPrezzo(
			@Param("categoria") CategoriaLibro categoria,
			@Param("prezzo") BigDecimal prezzo);
	
}

//Noi scriviamo il contratto (l'interfaccia), Spring genera il comportamento (l'implementazione SQL). Elimina completamente la classe 
// InMemoryLibroRepository e la 
// Map<Long, Libro>.
