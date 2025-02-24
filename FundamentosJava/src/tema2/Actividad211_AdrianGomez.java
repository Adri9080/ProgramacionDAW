package tema2;

import java.util.Scanner;

public class Actividad211_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe un numero del 0 al 9999");
		 num1=sc.nextInt();
		 if (num1<0 ||num1>9999 ) {
			 System.out.println("El numero tiene que estar entre 0 y 9999");
		 }else if(comprobar(num1)) {
			 System.out.println("El numero "+num1+" es capicua");
		 }else {
			 System.out.println("El numero "+num1+ " no es capicua");
		 }
	sc.close();
	}
	


public static boolean comprobar(int num1) {
	int unidad=num1%10;
	int decena=(num1/10)%10;
	int centena=(num1/100)%10;
	int millar=(num1/1000);
	
	if (num1<10) {
		return true;
		
	}else if(num1<100) {
		return decena==unidad;
	}else if (num1<1000) {
		return centena==unidad;
	}else if(num1<10000) {
		return millar==unidad && centena==decena;
	}
	return false;
}}