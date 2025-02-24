package tema1;

import java.util.Scanner;

public class mutiplo7 {

	public static void main(String[] args) {
		int num;
		int resultado;
		int resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero");
        num=sc.nextInt();
        resto=num%7;
        if (resto==0) {
        	System.out.println("El numero introducido es multiplo de 7");
        }
        else {
        	 resultado= num < 7 ? (7-resto) : 7-resto;
             System.out.println("Para que sea multiplo de 7 hay que sumar "+resultado);
		}
        		
        sc.close();	
        }
       
	}


