/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 1
 */
public class Libro {
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean estado;
	/**
	 * @param titulo
	 * @param autor
	 * @param anioPublicacion
	 * @param estado
	 */
	public Libro(String titulo, String autor, int anioPublicacion, boolean estado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.estado = estado;
	}
	
	public void prestarlibro() {
		if (this.estado) {
			this.estado = false;
			System.out.println("Libro prestado ✅");
		}else {
			System.out.println("Este libro ya esta prestado ❌");

		}
	}
	
	public void devolverlibro() {
		if (this.estado==false) {
			this.estado = true;
			System.out.println("Libro devuelto ✅");
		}else {
			System.out.println("Este libro ya esta devuelto ❌");

		}
	}
	
	public String listarLibro(Libro libro) {
		return "Libro [titulo=" + libro.titulo + ", autor=" + libro.autor + ", anioPublicacion=" + libro.anioPublicacion
				+ ", estado=" + libro.estado + "]";
	}
	
	
	
	
	
	
	
}
