package tema5;

import java.util.Arrays;
import java.util.Scanner;


public class ListasBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[4];
		int b[]= new int[4];
		int c[]= new int[4];
		int d[]= new int[4];
		int e[]= new int[4];
		int g[][]= {a,b,c,d,e};
		Scanner scanner= new Scanner(System.in);
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Introduce el elemento: "+ i + " - "+ j);
				g[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		for (int i = 0; i < g.length; i++) {
			System.out.println("***********************");
			for (int j = 0; j < 4; j++) {
				System.out.println("Elemento "+ i +" - "+ j + ": "+ g[i][j]);
			}
		}
		System.out.println("Utilizando el metodo Arrays: ");
		System.out.println(Arrays.deepToString(g));
	}

}
