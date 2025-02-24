package tema3;

import java.util.Scanner;

public class Actividad311_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resto,binario,factor,num;
		binario=0;
		factor=1;
		resto=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Escriba un numero decimal");
		num=sc.nextInt();
		
		while(num>0) {
			resto = num % 2;
			binario = binario + resto * factor; // Colocamos el bit en la posición correcta
			factor = factor * 10;         // Movemos el factor a la izquierda (posición siguiente)	         
		    num = num / 2;    // Dividimos entre 2 para procesar el siguiente bit

			
		}
		System.out.println(binario);
	}

}
