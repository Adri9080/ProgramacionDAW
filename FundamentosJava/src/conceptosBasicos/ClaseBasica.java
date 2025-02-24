package conceptosBasicos;

import java.time.LocalTime;
import java.util.Scanner;

public class ClaseBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 10;
//		int suma = a+b;
//		byte num = 400;
//		a = (int)(a+b);
//		LocalTime horaactual= java.time.LocalTime.now();
//		System.out.println("La suma de los 2 numeros es " + b);
//		System.out.println("La suma de " + a + " mas " + b + " es "+ suma);
//		System.out.println("La hora actual es " + horaactual);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce tu edad");
//		Integer edad=sc.nextInt();
//		System.out.println("Tu edad es: "+ edad);
		int num;
		System.out.print("Escriba un numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Valor introducido: " + num);
	}

}
