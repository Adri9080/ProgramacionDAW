/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso.ejercicioClases;

/**
 * 
 */
public class Libro implements Prestable {
	String titulo;
	String autor;
	String ISBN;
	boolean disponible;
	/**
	 * @param titulo
	 * @param autor
	 * @param iSBN
	 * @param disponible
	 */
	public Libro(String titulo, String autor, String iSBN, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.disponible = disponible;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	public String mostrarDetalles() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + "]";
	}
	@Override
	public void prestar() {
		this.disponible = false;
		
	}
	@Override
	public void devolver() {
		this.disponible = true;
		
	}
}
