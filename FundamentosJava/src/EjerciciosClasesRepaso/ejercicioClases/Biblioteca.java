/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso.ejercicioClases;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */
public class Biblioteca {
	HashMap<String, Libro> listaLibros = new HashMap<String, Libro>();
	ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	public void agregarLibro(Libro libro) {
		if(listaLibros.containsKey(libro.ISBN)) {
			System.out.println("Este libro ya esta en la lista");
		}else {
			listaLibros.put(libro.ISBN, libro);
			System.out.println("Libro agregado");
		}
		
	}
	public void registrarUsuario(Usuario usuario) {
		if(listaUsuarios.contains(usuario)) {
			System.out.println("Este usuario ya esta registrado");
		}else {
			listaUsuarios.add(usuario);
			System.out.println("Usuario Añadido");
		}
	}
	public void buscarLibro(String ISBN) {
		if(listaLibros.containsKey(ISBN)) {
			System.out.println(listaLibros.get(ISBN));
		}else {
			System.out.println("El libro con ISBN + "+ ISBN + " no esta añadido a la lista");
		}
	}
	public void mostrarLibrosDisponibles() {
		System.out.println("Libros Disponibles: ");
		for (Libro libro : listaLibros.values()) {
			if(libro.disponible) {
				libro.mostrarDetalles();
			}
		}
	}
}
