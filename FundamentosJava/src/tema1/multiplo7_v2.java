package tema1;

import java.util.Scanner;

public class multiplo7_v2 {
	public static void main(String[] args) {
		int num;
		int num2;
		int resultado;
		int resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero");
        num=sc.nextInt();
        System.out.println("Escriba el segundo numero");
        num2=sc.nextInt();
        resto=num%num2;
        if (resto==0) {
        	System.out.println("El numero introducido es multiplo de "+num2);
        }
        else {
        	 resultado= num < num2 ? (num2-resto) : num2-resto;
             System.out.println("Para que sea multiplo de "+ num2 +" hay que sumar "+resultado);
		}
        		
        sc.close();	
        }
       
	}

