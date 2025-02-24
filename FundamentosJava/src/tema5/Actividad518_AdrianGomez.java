package tema5;

import java.util.Scanner;

public class Actividad518_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean comprobar=matrizmagica();
		if (comprobar == true) {
			System.out.println("La lista es magica");
		}else {
			System.out.println("La lista no es magica");
		}
		
	}
	public static boolean matrizmagica() {
		Scanner scanner=new Scanner(System.in);
		int referencia,comparacion,comparacion2;
		comparacion=0;
		comparacion2=0;
		referencia=0;     
	       int xy[][]= new int[4][4];
//La estructura de la lista es la siguiente:
// El eje y seran las columnas y el eje x seran las filas
	       //FORMATO DE LA LISTA:
////	        {2, 1, 0, 2}, Fila 0
//	            {1, 2, 1, 1}, Fila 1
//	            {1, 1, 2, 1}, Fila 2
//	            {1, 1, 2, 1}  Fila 3
//	            };
	       for (int f = 0; f < xy.length; f++) { //Recorremos la lista con dos bucles for andiados, el segundo 
	    	   									 //bucle tiene la longitud en ese caso de una fila(en este caso : 4)
				for (int h = 0; h < xy[f].length; h++) {
					System.out.println("Introduce el dato para la posicion " + f + " - "+ h );
					xy[f][h]=scanner.nextInt();
				}
			scanner.close();
		}
	       //Sacamos un numero de referencia para poder comparar en los demas bucles
			for (int j = 0; j < 4; j++) {
				referencia+=xy[0][j];
			
			}
			//Estos bucles recorren la lista, en este caso recorren las columnas, si hay una suma que no da
			// el valor de la variable referencia retornara falso parando asi la ejecucion del programa
			for (int i = 0; i < 16; i++) {
				comparacion=0;
				for (int m = 0; m < 4; m++) {
					comparacion+=xy[0][m];
				}
				if (comparacion!=referencia) {
					return false;
				}
			//Estos bucles recorren la lista fila por fila, si en algun caso la suma de una fila no da
			// el valor de la variable se saldra del bucle y retornara falso parando la ejecucion del programa
			}
			for (int k = 1; k < xy.length; k++) {
				comparacion2=0;
				for (int n = 0; n < xy[0].length; n++) {
				
					comparacion2+=xy[k][n];
				}
				if (comparacion2!=referencia) {
					return false;
				}
			}
			//Si se han recorrido los bucles retornara true, ya que todas las filas y columnas tienen
			// el mismo valor que la variable referencia
			return true;
		
		
		
	}

}