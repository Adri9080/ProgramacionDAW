package tema2;

import java.util.Scanner;

public class ActividadPropuesta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean comprobarnegativo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num=sc.nextInt();
		comprobarnegativo = num < 0 ? true : false;
		System.out.println("Es negativo? "+comprobarnegativo);
	sc.close();
	}

}
