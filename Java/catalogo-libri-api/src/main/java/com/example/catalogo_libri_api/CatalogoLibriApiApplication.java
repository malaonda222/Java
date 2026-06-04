package com.example.catalogo_libri_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tomcat è già incluso dentro a Application

@SpringBootApplication
public class CatalogoLibriApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoLibriApiApplication.class, args);
	}

}
