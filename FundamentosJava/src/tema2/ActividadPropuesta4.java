package tema2;

import java.util.Scanner;

public class ActividadPropuesta4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		boolean comprobar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        num1=sc.nextInt();
        System.out.println("Escriba el segundo numero");
        num2=sc.nextInt();
        comprobar= num1%num2==0 ? true:false;
        System.out.println("El numero "+num1+" es múltiplo de "+num2+"? -> "+comprobar);
        sc.close();
	}

}
