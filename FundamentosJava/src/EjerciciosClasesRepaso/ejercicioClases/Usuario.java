/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso.ejercicioClases;

import java.util.ArrayList;

/**
 * 
 */
public class Usuario {
	private String nombre;
	private String id;
	private ArrayList<Libro> librosPrestados= new ArrayList<Libro>();
	/**
	 * @param nombre
	 * @param id
	 * @param librospPrestados
	 */
	public Usuario(String nombre, String id) {
		super();
		this.nombre = nombre;
		this.id = id;
		
	}
	public void tomarPrestado(Libro libro) {
		if (libro.disponible==true) {
			System.out.println("Se tomo prestado el libro: "+ libro.mostrarDetalles());
			librosPrestados.add(libro);
			libro.prestar();
		}else {
			System.out.println("Este libro ya esta prestado");
		}
	}
	public void devolverLibro(Libro libro) {
		if (libro.disponible==false) {
			System.out.println("Se delvolvio el libro: "+ libro.mostrarDetalles());
			librosPrestados.remove(libro);
			libro.devolver();
		}else {
			System.out.println("Este libro ya esta devuelto");
			
		}
	}
	
	
}