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
public class Ejercicio3_AdrianGomez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo la lista tipo character
		List<Character> caracteres = new ArrayList<Character>();
		//Añado los valores especificados en el enunciado
		caracteres.add('a');
		caracteres.add('e');
		caracteres.add('i');
		caracteres.add('o');
		caracteres.add('u');
		//Muestro la lista con sus valores
		System.out.println(caracteres.toString());
		//Con la funcion contains puedo comprobar si la lista tiene un valor que yo le pase
		//como parametro y devolvera un boleano.
		System.out.println("Contiene el caracter i ?: "+caracteres.contains('i'));
		//Devuelvo la posicion de la lista lo que yo le pase como parametro, si esta devolvera su posicion
		// si no devolvera -1
		System.out.println("Posicion: "+ caracteres.indexOf('i'));
	}

}
