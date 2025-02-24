package tema5;


import java.util.Scanner;

public class ActividadPropuesta53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int negativos,positivos,ceros,contadorneg,contadorpos,contador0;
		double dmediaposi,dmedianeg;
		negativos=0;
		positivos=0;
		ceros=0;
		contadorneg=0;
		contadorpos=0;
		contador0=0;
		dmediaposi=0;
		dmedianeg=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros que vas a introducir");
		int cantidad=sc.nextInt();
		System.out.println("-----------------------------------");
		int lista[] = new int[cantidad];
		CalcularMedia(negativos, positivos, ceros, contadorneg, contadorpos, contador0, dmediaposi, dmedianeg, cantidad, lista);
		sc.close();
		
		
	}
public static void CalcularMedia(int negativos,int positivos,int ceros,int contadorneg,int contadorpos,int contador0,double dmediaposi,double dmedianeg,int cantidad,int lista[] ){
	Scanner sc= new Scanner(System.in);
	for (int i = 0; i < cantidad; i++) {
		System.out.println("Introduce un numero");
		lista[i]=sc.nextInt();
		System.out.println("-----------------------------------");
	}
	for(int ilista: lista) {
		if (ilista<0) {
			negativos+=ilista;
			contadorneg++;
		}
		if (ilista>=1) {
			positivos+=ilista;
			contadorpos++;
		}
		if (ilista==0) {
			contador0++;
		}
	}
	if (contadorneg==0) {
		System.out.println("No se puede calcular la media de los negativos(se esta dividiendo entre 0)");
	}else {
		dmedianeg=(double)negativos/contadorneg;
		System.out.println("Media de numeros negativos "+dmedianeg);
	}if (contadorpos==0) {
		System.out.println("No se puede calcular la media de los positivos(se esta dividiendo entre 0)");
		
	}else {
		dmediaposi=(double)positivos/contadorpos;
		System.out.println("Media de numeros positivos "+dmediaposi);
	}
	System.out.println("Numero de ceros introducidos "+contador0);
	sc.close();
}
}
