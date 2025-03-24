package tema6;


import java.util.Scanner;

public class Actividad612_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Jugador A: Escribe una palabra");
	
		String palabra= scanner.next();
		palabra=palabra.toLowerCase();
		String guiones= guiones(palabra);
		adivinar(palabra, scanner, guiones);
	}
public static String guiones(String palabra) {
	String guiones= "";
	String guionesimprimir="";
	for (int i = 0; i < palabra.length(); i++) {
		guiones = "_" + guiones;
		guionesimprimir="_ "+guionesimprimir;
	}
	System.out.println(guionesimprimir);
	return guiones;
}
public static void adivinar(String palabra,Scanner scanner,String guiones) {
	int intentos=0;
	char letra;
	int pos;
	do {
		System.out.println("Jugador 2: Introduce una letra");
		letra=scanner.next().charAt(0);
		if (palabra.indexOf(letra)<0) {
			System.out.println("La letra "+ letra + "no esta en la palabra");
			intentos++;
		}else {
			pos=0;
			while (pos != -1 ) {
				pos = palabra.indexOf(letra, 0);
				guiones= guiones.substring(0, pos) + letra + guiones.substring(pos+1);
				System.out.println(guiones);
				intentos++;
				break;
				
			}
			if (guiones.equals(palabra)) {
				System.out.println("Felicidades has ganado!");
				break;
				
			}
		}
		
	
	} while (intentos < 8);
	if (intentos>=8) {
		System.out.println("Lo siento, has perdido");
		
	}
		
	
		
	
}
}
