/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso.ejercicioClases;

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
		Libro libro1 = new Libro("Hola", "me", "1", true);
		Libro libro2 = new Libro("Hola1", "me1", "2", true);
		Libro libro3 = new Libro("Hola2", "me1", "3", true);
		Usuario usu1 = new Usuario("Pepe", "1");
		Usuario usu2 = new Usuario("Pepe1", "2");
		Usuario usu3 = new Usuario("Pepe2", "3");
		biblio.agregarLibro(libro1);
		biblio.agregarLibro(libro2);
		biblio.agregarLibro(libro3);
		
		usu1.tomarPrestado(libro2);
		usu1.devolverLibro(libro2);
		usu2.tomarPrestado(libro1);
		usu3.tomarPrestado(libro1);
		
	}

}
