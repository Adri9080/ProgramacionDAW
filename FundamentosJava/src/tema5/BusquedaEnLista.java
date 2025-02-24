package tema5;

import java.util.Scanner;

public class BusquedaEnLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t= {4,1,-44,100,50,30,10,-3};
		int Clave;
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("Introduzca el numero que quiere buscar: ");
		Clave=scanner.nextInt();
		scanner.close();
		System.out.println (buscar(t, Clave, false));
	}
static int buscar(int t[],int Clave,boolean Busqueda) {
	int posicion=0;
	for (int i : t) {
		if (i==Clave) {
			Busqueda=true;
			break;
		}
		posicion++;
	}
	if (Busqueda==true) {
		return posicion;
	}else {
		return -1;
	}
}
}
