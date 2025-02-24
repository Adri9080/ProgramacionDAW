package tema3;

import java.util.Scanner;

public class Actividad31_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad,min,max,salir;
		Scanner sc = new Scanner(System.in);
		min=0;
		max=0;
		salir=0;
		do {
			System.out.println("Introduce una edad ");
			edad=sc.nextInt();
			if (edad<0) {
				salir=-1;
			}else {
				if (edad>max) {
					max=edad;
				}else {
					min=edad;
					
				}
			}
			
			
			
			
		}while(salir>=0);
		
		System.out.println("La edad maxima es: "+ max);
		System.out.println("La edad minima es: "+ min);
		
		
	
		
	
	sc.close();
	}

}
