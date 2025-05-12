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
public class Ejercicio5_AdrianGomez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo una lista tipo Integer
		List<Integer> numeros110 = new ArrayList<Integer>();
		//Con un bucle for voy añadiendo numeros del 1 al 10 en la lista
		//segun el valor de i
		for (int i = 1; i <= 10; i++) {
			numeros110.add(i);
		}
		//Despues muestro con el metodo get el elemento que este en la posicion segun el valor de i
		for (int i = 0; i < numeros110.size(); i++) {
			System.out.println("Elemento "+ i + " de la lista: "+ numeros110.get(i));
		}
	}

}
