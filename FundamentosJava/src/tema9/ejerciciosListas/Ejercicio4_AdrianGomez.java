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
public class Ejercicio4_AdrianGomez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo una lista vacia
		List<String> vacia = new ArrayList<String>();
		//Con la funcion isEmpty puedo comprobar si una lista esta vacia o no, devolvera true
		// si esta vacia o false si tiene elementos en la lista.
		System.out.println("La lista esta vacia?: "+vacia.isEmpty());
		//Añado un valor a la lista
		vacia.add("Hola");
		System.out.println("Añadimos un elemento a la lista");
		System.out.println(vacia.toString());
		// En este caso la funcion isEmpty devolvera false ya que he añadido un valor antes
		System.out.println("La lista esta vacia?: "+vacia.isEmpty());

	}

}
