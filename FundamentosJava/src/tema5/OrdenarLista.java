package tema5;

import java.util.Iterator;

public class OrdenarLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista= {4,1,-44,100,50,30,10,-3};
		boolean intercambio;
	int tamaño=lista.length;
	do {
		intercambio=false;
		for (int i = 0; i < tamaño-1; i++) {
			if (lista[i]>lista[i+1]) {
				int temp=lista[i];
				lista[i]=lista[i+1];
				lista[i + 1] = temp;
				intercambio=true;
			}
	}} while (intercambio==true);
	
		for (int y : lista) {
			System.out.println("Elemento: "+ y);
		}
	}

}
