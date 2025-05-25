/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.Ejercicio3;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblio = new Biblioteca();
		Libro libro1 = new Libro("1", "Hola1", "Pedro Sanchez");
		Libro libro2 = new Libro("2", "Hola2", "Pepe");
		Libro libro3 = new Libro("3", "Hola3", "Antonio");
		biblio.añadirLibro(libro1);
		biblio.añadirLibro(libro2);
		biblio.añadirLibro(libro3);
		Libro libroBuscar = biblio.buscarPorISBN("1");
		System.out.println("Titulo libro por ISBN: "+ libroBuscar.getTitulo() + " Autor: "+ libroBuscar.getAutor() + " ISBN: "+ libroBuscar.getISBN());
		biblio.mostrarCatalogo();
	}

}
