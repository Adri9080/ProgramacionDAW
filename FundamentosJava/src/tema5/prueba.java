package tema5;

import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lista[]= {1,2};
		
	
		lista=Arrays.copyOf(lista, lista.length+1);
		int posicion=Arrays.binarySearch(lista, 2);
		
		lista[posicion+1]=lista[posicion-1];
		lista[posicion]=lista[posicion-1];
		System.out.println(Arrays.toString(lista));
	}

}
