package tema4;

import java.util.Scanner;

public class Actividad413_AdrianGomez {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba un numero");
		n=sc.nextInt();
		muestraPares(n);
		sc.close();
	}

	static void muestraPares(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.println(2 * i);
	        }
		}
	
	 }
