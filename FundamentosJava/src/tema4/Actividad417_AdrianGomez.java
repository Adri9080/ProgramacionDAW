package tema4;

import java.util.Scanner;

public class Actividad417_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba el primer numero");
		a=sc.nextInt();
		System.out.println("Escriba el segundo numero");
		b=sc.nextInt();
		if (resultadofinal(a, b)==true) {
			System.out.println("Son Amigos");
		}else {
			System.out.println("No son Amigos");
		}
		sc.close();
	}
	static boolean resultadofinal(int a, int b) {
		int suma1=0;
		int suma2=0;
		for (int i=1;i<a;i++ ) {
			if (a%i==0) {
				suma1+=i;
			}else {
				continue;
			}}
				
		for (int j=1;j<b;j++) {
			if (b%j==0) {
				suma2+=j;
			}else {
				continue;
			}}
			if (suma1==b && suma2==a) {
				return true;
			}else {
				return false;
			}
		
		
		
	}
}
