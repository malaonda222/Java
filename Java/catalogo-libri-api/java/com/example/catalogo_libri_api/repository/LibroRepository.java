package com.example.catalogo_libri_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.catalogo_libri_api.model.CategoriaLibro;
import com.example.catalogo_libri_api.model.Libro;

@Repository
public interface LibroRepository {
	Libro save(Libro libro);
	
	Optional<Libro> findById(Long id);
	
	List<Libro> findAll();
	
	List<Libro> findByCategoria(CategoriaLibro c);
	
	void deleteById(Long id);
	
	boolean existsById(Long id);
}