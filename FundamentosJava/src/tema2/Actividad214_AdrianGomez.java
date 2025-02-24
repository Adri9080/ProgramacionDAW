//Adrián Gómez Izquierdo
package tema2;
import java.util.Scanner;
public class Actividad214_AdrianGomez {
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un numero entre 1 y 99: ");
	        int numero = scanner.nextInt();
	        if (numero < 1 || numero > 99) {
	            System.out.println("El numero tiene que estar entre 1 y 99");
	        } else {
	            String resultado = "";

	            if (numero <= 29) {
	                switch (numero) {
	                    case 1 -> resultado = "uno";
	                    case 2 -> resultado = "dos";
	                    case 3 -> resultado = "tres";
	                    case 4 -> resultado = "cuatro";
	                    case 5 -> resultado = "cinco";
	                    case 6 -> resultado = "seis";
	                    case 7 -> resultado = "siete";
	                    case 8 -> resultado = "ocho";
	                    case 9 -> resultado = "nueve";
	                    case 10 -> resultado = "diez";
	                    case 11 -> resultado = "once";
	                    case 12 -> resultado = "doce";
	                    case 13 -> resultado = "trece";
	                    case 14 -> resultado = "catorce";
	                    case 15 -> resultado = "quince";
	                    case 16 -> resultado = "dieciseis";
	                    case 17 -> resultado = "diecisiete";
	                    case 18 -> resultado = "dieciocho";
	                    case 19 -> resultado = "diecinueve";
	                    case 20 -> resultado = "veinte";
	                    case 21 -> resultado = "veintiuno";
	                    case 22 -> resultado = "veintidos";
	                    case 23 -> resultado = "veintitres";
	                    case 24 -> resultado = "veinticuatro";
	                    case 25 -> resultado = "veinticinco";
	                    case 26 -> resultado = "veintiseis";
	                    case 27 -> resultado = "veintisiete";
	                    case 28 -> resultado = "veintiocho";
	                    case 29 -> resultado = "veintinueve";
	                }
	            } else {
	                int decenas = numero / 10;
	                int unidades = numero % 10;

	                switch (decenas) {
	                    case 3 -> resultado = "treinta";
	                    case 4 -> resultado = "cuarenta";
	                    case 5 -> resultado = "cincuenta";
	                    case 6 -> resultado = "sesenta";
	                    case 7 -> resultado = "setenta";
	                    case 8 -> resultado = "ochenta";
	                    case 9 -> resultado = "noventa";
	                }

	                if (unidades > 0) {
	                    resultado += " y ";
	                    switch (unidades) {
	                        case 1 -> resultado += "uno";
	                        case 2 -> resultado += "dos";
	                        case 3 -> resultado += "tres";
	                        case 4 -> resultado += "cuatro";
	                        case 5 -> resultado += "cinco";
	                        case 6 -> resultado += "seis";
	                        case 7 -> resultado += "siete";
	                        case 8 -> resultado += "ocho";
	                        case 9 -> resultado += "nueve";
	                    }
	                }
	            }
	         
	            System.out.println("El número en letras es: " + resultado);
	        
	        }
	    }
	

}


