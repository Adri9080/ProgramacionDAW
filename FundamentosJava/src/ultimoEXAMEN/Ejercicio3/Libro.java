/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.Ejercicio3;

/**
 * 
 */
public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 */
	public Libro(String iSBN, String titulo, String autor) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
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
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}
