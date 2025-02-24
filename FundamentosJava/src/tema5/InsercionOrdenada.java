package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class InsercionOrdenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista= {4,7,1,3,87,100,99};
		Arrays.sort(lista);
		int num,indice;
		indice=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el numero que quieras insertar en la lista");
		num=scanner.nextInt();
		insertar(lista,num,indice);
		
		scanner.close();
	}
	static void insertar(int lista[],int num,int indice){
		indice=Arrays.binarySearch(lista, num);
		if (indice<0) {
			indice= -indice-1;
			
		}
		int[] lista2= new int[lista.length+1];
		System.arraycopy(lista, 0, lista2,0,indice);
		System.arraycopy(lista, indice, lista2, indice+1, lista.length-indice);
		lista2[indice]=num;
		System.out.println(Arrays.toString(lista2));
	
	}

}
