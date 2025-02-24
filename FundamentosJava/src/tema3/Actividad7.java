package tema3;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escriba un numero");
		num=sc.nextInt();
		if (num<0 || num>7) {
			System.out.println("Debes introducir un numero del 1 al 7");
		}else {
			
			switch (num) {
			case 1: {
				System.out.println("Lunes");
				break;
			}
			case 2: {
				System.out.println("Martes");
				break;
			}
			case 3:{
				System.out.println("Miercoles");
				break;
			}
			case 4:{
				System.out.println("Jueves");
				break;
			}
			case 5:{
				System.out.println("Viernes");
				break;
			}
			case 6: {
				System.out.println("Sabado");
				break;
			}
			case 7:{
				System.out.println("Domingo");
				break;
			}
				
			
			}
		}
		
		
	}

}
