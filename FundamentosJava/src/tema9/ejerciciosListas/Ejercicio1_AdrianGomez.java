/**
 * @author AdrianGomez
 * @version 1.0
 */
package ejerciciosListas;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Ejercicio1_AdrianGomez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo la lista tipo String
		List<String> nombres = new ArrayList<String>();
		//Añado los valores especificados en el enunciado
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Laura");
		nombres.add("Marta");
		//Muestro la lista despues de añadir los elementos
		System.out.println("************************");
		System.out.println("Lista por defecto: ");
		System.out.println(nombres.toString());
		System.out.println("************************");
		//Con la funcion remove puedo eliminar de la lista lo que le pase por parametro
		//en este caso eliminaremos el nombre Juan de la lista
		nombres.remove("Juan");
		System.out.println("Eliminamos a Juan de la lista");
		System.out.println("************************");
		//Despues muestro la lista para comprobar que se ha eliminado del nombre
		System.out.println(nombres.toString());
		System.out.println("************************");

		
	}

}
