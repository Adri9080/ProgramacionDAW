package tema7.Ejercicio721_22_AdrianGomez;

import java.util.Arrays;

/**
 * 
 * @author AdrianGomez
 * @version 1.0
 * 
 */
public class Conjunto {
private Integer[] conjunto;

//CONTRUCTOR DE LA CLASE
public Conjunto() {
	conjunto=new Integer[0];
}
//Metodo que devuelve el numero de elementos del array
/**
 * @param
 * */
public int numeroElementos() {
	return conjunto.length;
}
/**
 * @param nuevo
 * */
//Metodo que inserta un nuevo elemento en el array si no existe en el array
public boolean insertar(Integer nuevo) {
	boolean insertar=false;
	conjunto=Arrays.copyOf(conjunto, conjunto.length+1);
	for (Integer m : conjunto) {
		if (m != null && m.equals(nuevo)) {
			return false;
		}else {
			insertar=true;
		}
	}
	if (insertar) {
		conjunto[conjunto.length-1]=nuevo;
		return true;
	}
	return false;
}
/**
 * @param otroConjunto
 * */
//Metodo que combina un array con otro si el array segundo no tiene numeros que se repiten en el array 1
public boolean insertar(Conjunto otroConjunto) {
	boolean insertar=false;
	int longitud=conjunto.length;
	for (int i = 0; i < conjunto.length; i++) {
		insertar=true;
		for (int j = 0; j < otroConjunto.conjunto.length; j++) {
			if (pertenece(otroConjunto.conjunto[j])) {
				insertar=false;
				break;
			}else {
				insertar=true;
			}
			
		}
		
		}
		
	if (insertar) {
		conjunto=Arrays.copyOf(conjunto, conjunto.length+otroConjunto.conjunto.length);
		System.arraycopy(otroConjunto.conjunto, 0, conjunto, longitud, otroConjunto.conjunto.length);
		return true;
	}
	return false;


}
/**
 * @param elemento
 * */
//Metodo que elimina un numero del array, si existe guarda su indice y lo elimina
public boolean eliminarElemento(Integer elemento) {
	int indice=-1;
	for (int i = 0; i < conjunto.length; i++) {
		if (conjunto[i].equals(elemento)) {
			indice=i;
			break;
		}
	}
	if (indice>=0) {
		System.arraycopy(conjunto, indice+1, conjunto, indice, conjunto.length-indice-1);
		conjunto=Arrays.copyOf(conjunto, conjunto.length-1);
		return true;
	}
	return false;
}
/**
 * @param otroConjunto
 * */
//Metodo que elimina del array los numeros que esten en el array 1
public boolean eliminarConjunto(Conjunto otroConjunto) {
	boolean eliminadoAlMenosUno=false;
	for (Integer num : otroConjunto.conjunto) {
		if (eliminarElemento(num)) {
			eliminadoAlMenosUno=true;
		}
	}
	return eliminadoAlMenosUno;
	
}
/**
 * @param elemento
 * */
//Metodo que comprueba que un numero existe en el array
public boolean pertenece(Integer elemento) {
	for (Integer i : conjunto) {
		if (i != null && i.equals(elemento)) {
			return true;
		}
	}
	return false;
}
/**
 * @param
 * */
//Metodo que muestra el array
public void muestra() {
	System.out.println("\nConjunto Actual: "+Arrays.toString(conjunto));
}

//static boolean incluido(Conjunto c1, Conjunto c2) {
//
//}
}
