package tema2;

import java.util.Scanner;

public class Actividadpropuesta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		boolean comprobar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        num1=sc.nextInt();
        System.out.println("Escriba el segundo numero");
        num2=sc.nextInt();
        comprobar= num1 != num2 || num1==0 || num2==0 ? true:false;
        System.out.println("Los numeron son distintos o alguno es 0? "+comprobar);	
        sc.close();
	}

}
