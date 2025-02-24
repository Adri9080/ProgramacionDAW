package tema3;

import java.util.Scanner;

public class Actividad312_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin;
		int cifras;
		cifras=0;
		int resultadoDecimal=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escriba el binario");
		bin=sc.nextInt();
	
	while(bin>0) {
		int bits=bin % 10;
		resultadoDecimal+= bits*(int) Math.pow(2, cifras);
		bin/=10;
		cifras++;
		
	}
	System.out.println(resultadoDecimal);
		
		
		
		
	
}}
