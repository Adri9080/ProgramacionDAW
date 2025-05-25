/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.Ejercicio3;

import java.util.ArrayList;

/**
 * 
 */
public class Biblioteca {
	private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	public void añadirLibro(Libro l) {
		if(listaLibros.contains(l)) {
			System.out.println("El libro: " + l.getTitulo() + " con ISBN " + l.getISBN() + " ya esta añadido");
		}else {
			listaLibros.add(l);
			System.out.println("Libro añadido");
		}
	}
	public Libro buscarPorISBN(String isbn) {
		for (Libro libro : listaLibros) {
			if(libro.getISBN().equals(isbn)) {
				return libro;
			}
		}
		return null;
	}
	public void mostrarCatalogo() {
		for (Libro libro : listaLibros) {
			System.out.println("Titulo: " +libro.getTitulo() + " || " + "Autor: "+ libro.getAutor() + " || " +"ISBN: "+ libro.getISBN());
			
		}
	}
}
