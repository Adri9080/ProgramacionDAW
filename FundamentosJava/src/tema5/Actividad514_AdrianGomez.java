package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad514_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,
		contador=0,
		suma=0;
		int lista[]= new int[0];
		num=0;
		
		sueldos(contador, num, suma, lista);
			
			
			
			
		
		
		
	}
	static void sueldos(int contador, int num, int suma,int lista[]) {
		Scanner scanner=new Scanner(System.in);
		do {
			lista=Arrays.copyOf(lista, lista.length+1);
			System.out.println("Introduce un numero");
			num=scanner.nextInt();
			System.out.println("------------------");
			if (num>=0) {
				lista[contador]=num;
				contador++;
			}
			
		} while (num>=0);
		
		if (contador==0) {
			System.out.println("No has introducido ningun sueldo");
		}else {
			lista=Arrays.copyOf(lista, lista.length-1);
			Arrays.sort(lista);
			System.out.print("*******************");
			System.out.print("\n Lista decreciente: " + "[");
			for (int i = contador-1; i >= 0; i--) {
				System.out.print(lista[i] + ", " );
			}
			
			System.out.print("]");
			System.out.print("\n El sueldo mas alto es: "+ lista[contador-1]);
			System.out.print("\n El sueldo mas bajo es: "+ lista[0]);
			
			for (int i : lista) {
				suma+=i;
			}
			
			System.out.print("\n La media de los sueldos es: "+ suma/contador);
			System.out.print("\n*******************");
		}
		scanner.close();
	}
}
