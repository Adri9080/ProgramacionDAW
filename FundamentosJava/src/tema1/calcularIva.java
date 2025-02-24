package tema1;

import java.util.Scanner;

public class calcularIva {
	public static void main(String[] args) {
	double iva,base,total;
	Scanner sc = new Scanner (System.in);
	System.out.println("Escriba el importe base");
	base= sc.nextDouble();
	System.out.println("Ahora escriba el importe de IVA");
	iva=sc.nextDouble();
	iva /= 100;
	total= (base*iva)+base;
	System.out.println("El importe total de la base "+ base +" con un IVA del "+iva+ " es "+total );
	sc.close();
	
	
	}
}
