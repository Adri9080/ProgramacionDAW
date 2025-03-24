package tema6;

import java.util.Scanner;
//Corregido y copiado de la solucion de clase
public class Actividad613_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escriba una sentencia");
		String sentenciaString = new Scanner(System.in).nextLine();
		int inicio = sentenciaString.indexOf("/*");
		while (inicio != -1) {
			int fin= sentenciaString.indexOf("*/",inicio);
			sentenciaString=sentenciaString.substring(0,inicio) + sentenciaString.substring(fin+2);
			inicio=sentenciaString.indexOf("/*");
		}
		
	}

}
