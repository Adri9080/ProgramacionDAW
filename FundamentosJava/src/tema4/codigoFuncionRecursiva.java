package tema4;

import java.util.Scanner;

public class codigoFuncionRecursiva {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba un numero");
		n=sc.nextInt();
		long resultado=factorial(n);
		System.out.println (resultado);

	}
	static long factorial(int n) {
	    long resultado;
	    if (n == 0) { // si n es 0
	        resultado = 1; // caso base
	    } else {
	        resultado = n * factorial(n - 1); // llamada recursiva
	    }
	    return (resultado);
	}

}
