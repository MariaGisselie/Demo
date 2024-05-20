package com.tuuniversidad.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tuuniversidad.Libro;
@Repository 
public class LibroRepositoryImp implements LibroRepository {
	private List<Libro>libros = new ArrayList<>();
	
	
	public LibroRepositoryImp() {
		libros.add(new Libro(978-270-800L,"INTRODUCCION A LA PROGRAMACION","FRANCISCO","ANAYA MULTIMEDIA","2022"));
		libros.add(new Libro(978-843-6954-302L,"INTRODUCCION A LOS ALGORITMOS","THOMAS H","MIT PRESS","1989"));
		libros.add(new Libro(978-844-8173-937L,"METODOLODIA DE LA PROGRAMACION","CARELIA GUADALUPE","PLAZA Y VALDES","2008"));	
	}

	public Libro getLibro(Long id) {
		for(Libro libro: libros) {
			if(id==libro.getId())
				return libro;
		}
		return null;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	@Override
	public Libro nuevoLibro(Libro libro) {
		libros.add(libro);
		return libro;
	}

}
