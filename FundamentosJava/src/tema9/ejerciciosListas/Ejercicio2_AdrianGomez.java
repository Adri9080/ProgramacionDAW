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
public class Ejercicio2_AdrianGomez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo la lista tipo Integer
		List<Integer> numeros = new ArrayList<Integer>();
		//Añado los valores especificados en el enunciado
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		//Muestro la lista despues de añadir los valores
		System.out.println("***********************");
		System.out.println("Lista por defecto: ");
		System.out.println(numeros.toString());
		System.out.println("***********************");
		System.out.println("Cambiamos el valor de la posicion 2");
		//Cambio el valor de la posicion 2 por el numero 35, con la funcion set puedes
		// reemplazar un elemento de la lista por otro pasandole la posicion y el valor que vas a poner
		numeros.set(1, 35);
		System.out.println(numeros.toString());
		System.out.println("***********************");
	}

}
