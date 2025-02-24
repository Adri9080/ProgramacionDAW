package tema4;

import java.util.Scanner;

public class Actividad418_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba la cantidad de numeros");
		cantidad=sc.nextInt();
		System.out.println("Escriba el numero maximo del rango");
		max=sc.nextInt();
		System.out.println("Escriba el numero minimo del rango");
		min=sc.nextInt();
		System.out.println("Numeros: ");
		aleatorio(cantidad, max, min);
		sc.close();
	}
static void aleatorio(int cantidad,int max,int min) {
	for (int i = 0; i < cantidad; i++) {
		double numero=min+(Math.random()*(max-min));
		int num=(int)numero;
		System.out.println(num);
	}
}
}
