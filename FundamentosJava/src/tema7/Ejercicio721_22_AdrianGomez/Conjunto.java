package tema7.Ejercicio721_22_AdrianGomez;

import java.util.Arrays;

/**
 * 
 * @author AdrianGomez
 * @version 1.0
 * 
 */
public class Conjunto {
private Integer[] lista;

//CONTRUCTOR DE LA CLASE
public Conjunto() {
	lista=new Integer[0];
}

//Metodo que devuelve el numero de elementos del array
/**
 * @param
 * */
public int numeroElementos() {
	return lista.length;
}
/**
 * @param nuevo
 * */
//Metodo que inserta un nuevo elemento en el array si no existe en el array
public boolean insertar(Integer nuevo) {
	boolean insertar=false;
	lista=Arrays.copyOf(lista, lista.length+1);
	for (Integer m : lista) {
		if (m != null && m.equals(nuevo)) {
			insertar=false;
			break;
		}else {
			insertar=true;
		}
	}
	if (insertar) {
		lista[lista.length-1]=nuevo;
		return true;
	}else {
		lista=Arrays.copyOf(lista, lista.length-1);
		return false;
	}
	
}
/**
 * @param otroConjunto
 * */
//Metodo que combina un array con otro si el array segundo no tiene numeros que se repiten en el array 1
public boolean insertar(Conjunto otroConjunto) {
	boolean insertar=false;
	int longitud=lista.length;
	for (int i = 0; i < lista.length; i++) {
		insertar=true;
		for (int j = 0; j < otroConjunto.lista.length; j++) {
			if (pertenece(otroConjunto.lista[j])) {
				insertar=false;
				break;
			}else {
				insertar=true;
			}
			
		}
		
		}
		
	if (insertar) {
		lista=Arrays.copyOf(lista, lista.length+otroConjunto.lista.length);
		System.arraycopy(otroConjunto.lista, 0, lista, longitud, otroConjunto.lista.length);
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
	for (int i = 0; i < lista.length; i++) {
		if (lista[i].equals(elemento)) {
			indice=i;
			break;
		}
	}
	if (indice>=0) {
		System.arraycopy(lista, indice+1, lista, indice, lista.length-indice-1);
		lista=Arrays.copyOf(lista, lista.length-1);
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
	for (Integer num : otroConjunto.lista) {
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
	for (Integer i : lista) {
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
	System.out.println("\nConjunto Actual: "+Arrays.toString(lista));
}

static boolean incluido(Conjunto c1, Conjunto c2) {
	int contador=0;
	for (Integer i : c1.lista) {
		for (int j = 0; j < c2.lista.length; j++) {
			if (i==c2.lista[j]) {
				contador++;
				break;
			}
		}
	}
	if (contador==c1.lista.length) {
		return true;
	}else {
		return false;
	}
}
static Conjunto union(Conjunto c1, Conjunto c2) {
	Conjunto c3= new Conjunto();
	c3.lista=Arrays.copyOf(c3.lista, c1.lista.length+c2.lista.length);
	System.arraycopy(c1.lista, 0, c3.lista, 0, c1.lista.length);
	System.arraycopy(c2.lista, 0, c3.lista, c1.lista.length-1, c2.lista.length);
	c3.lista=Arrays.copyOf(c3.lista, c3.lista.length-1);
	return c3;
}
static Conjunto interseccion(Conjunto c1, Conjunto c2) {
	Conjunto c3= new Conjunto();
	for (int i = 0; i < c1.lista.length; i++) {
		for (int j = 0; j < c2.lista.length; j++) {
			if (c1.lista[i]==c2.lista[j]) {
				c3.lista=Arrays.copyOf(c3.lista, c3.lista.length+1);
				c3.lista[j]=c1.lista[i];
				break;
			}
		}
	}
	return c3;
}
static Conjunto diferencia(Conjunto c1, Conjunto c2) {
	Conjunto c3= new Conjunto();
	boolean insertar=false;
	Arrays.copyOf(c3.lista, c3.lista.length+1);
	for (int i = 0; i < c1.lista.length; i++) {
		for (int j = 0; j < c2.lista.length; j++) {
			if (c1.lista[i]!=c2.lista[j]) {
				insertar=true;
				continue;
			}else {
				insertar=false;
				break;
			}
		}
		if (insertar) {
			c3.lista=Arrays.copyOf(c3.lista, c3.lista.length+1);
			c3.lista[i]=c1.lista[i];
		}
	}
	return c3;
}
}
