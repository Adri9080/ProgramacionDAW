package tema1;

import java.util.Scanner;

public class baseTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base,altura,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la base del triangulo");
        base= sc.nextDouble();
        System.out.println("Ahora escriba la altura del triangulo");
        altura=sc.nextDouble();
        area=(base*altura)/2;
        System.out.println("El area del triangulo es: "+area);
      sc.close();
	}
}
