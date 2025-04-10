package tema7.Ejercicio721_22_AdrianGomez;

import java.util.Arrays;

public class Conjunto_2_0 {
	private Lista tabla;
	
	//Constructor
	public Conjunto_2_0() {
		tabla=new Lista();
	}
	//Llama al metodo numeroElementos de la clase lista ya que devuelve el numero de elementos de la lista
	public int numeroElementos() {
		return tabla.numeroElementos();
	}
	//Comprueba que el elemento que se va a insertar no existe, si existiera retornaria false y no haria nada, si no existe lo inserta
	//llamando al metodo insertarFinal que redimensiona la tabla y inserta el elemento
	public boolean insertar(Integer nuevo) {
		
			if (tabla.buscar(nuevo)>=0) {
				return false;
			}
		
		tabla.insertarFinal(nuevo);
		return true;
	}
	//Comprueba que los elementos de la tabla 2 no esten en la tabla, si un elemento no esta no se insertara,
	//si no insertara todos los elementos de la tabla 1 en la tabla 1 con el metodo de la clase lista insertarFinal
	//ya que este metodo esta sobrecargado y puede insertar otras listas de su tipo.
	
	public boolean insertar(Conjunto_2_0 otroConjunto_2_0) {
		for (Integer i : otroConjunto_2_0.tabla.tabla) {
			if (tabla.buscar(i)>=0) {
				return false;
			}
			
		}
		tabla.insertarFinal(otroConjunto_2_0.tabla);
		return true;
	}
	//Buscara el elemento en la lista si existe lo eliminara con el metodo de la clase lista eliminar
	// Si no existiera retornara false.
	public boolean eliminarElemento(Integer elemento) {
		
		if(tabla.buscar(elemento)>=0) {
			tabla.eliminar(tabla.buscar(elemento));
			return true;
		}
		return false;
	}
	//Buscara elemento por elemento de la tabla 2 en la tabla 1 si exitiera lo elimina con el metodo de la clase lista eliminar
	//OJO solo retornara true cuando se eliminen todos los elementos
	public boolean eliminarConjunto(Conjunto_2_0 otroConjunto_2_0) {
		int indice;
		for (Integer i : otroConjunto_2_0.tabla.tabla) {
			indice=tabla.buscar(i);
			if(indice>=0) {
				tabla.eliminar(indice);
			}else {
				return false;
			}
		}
		return true;
	}
	//Busco con el metodo de la clase lista buscar si existe en la lista y devuelvo true o false
	public boolean pertenece(Integer elemento) {
		int indice=tabla.buscar(elemento);
		if (indice>=0) {
			return true;
		}else {
			return false;
		}
	}
	//Llama al metodo de la clase lista llamado mostrar que este imprimira por pantalla la lista
	public void muestra() {
		tabla.mostrar();
	}
	
	public static boolean incluido(Conjunto_2_0 c1, Conjunto_2_0 c2) {
		int indice;
		
		for (Integer i : c1.tabla.tabla) {
			indice=c2.tabla.buscar(i);
			if (indice<=0) {
				return false;
			}
		}
		return true;
	}
	public static Conjunto_2_0 union(Conjunto_2_0 c1, Conjunto_2_0 c2) {
		int indice;
		for (Integer i : c1.tabla.tabla) {
			indice=c2.tabla.buscar(i);
			if (indice>=0) {
				return c1; // No se puede unir porque hay elementos repetidos
			}
		}
		Conjunto_2_0 c3= new Conjunto_2_0();
		Arrays.copyOf(c3.tabla.tabla, c1.tabla.tabla.length+c2.tabla.tabla.length);
		System.arraycopy(c1, 0, c3, 0, c1.tabla.tabla.length);
		System.arraycopy(c2, 0, c3, c1.tabla.tabla.length+1, c2.tabla.tabla.length);
		return c3;
	}
	public static Conjunto_2_0 interseccion(Conjunto_2_0 c1, Conjunto_2_0 c2) {
		int indice;
		Conjunto_2_0 c3= new Conjunto_2_0();
		for (int i = 0; i < c1.tabla.tabla.length; i++) {
			indice=c2.tabla.buscar(c1.tabla.tabla[i]);
			if (indice>=0) {
				c3.tabla.insertarFinal(c1.tabla.tabla[i]);
			}
			
		}
		return c3;
	}
	public static Conjunto_2_0 diferencia(Conjunto_2_0 c1, Conjunto_2_0 c2) {
		int indice;
		Conjunto_2_0 c3= new Conjunto_2_0();
		for (int i = 0; i < c1.tabla.tabla.length; i++) {
			indice=c2.tabla.buscar(c1.tabla.tabla[i]);
			if (indice<=0) {
				c3.tabla.insertarFinal(c1.tabla.tabla[i]);
			}
			
		}
		return c3;
	}

	
	
	
}
