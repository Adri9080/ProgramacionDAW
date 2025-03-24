package tema6;
import java.util.Scanner;
public class PruebaCadenaReversa {
/**
 * Esta clase contiene un método para invertir una cadena de texto.
 * 
 * @author Adrian Gomez Izquierdo
 * @version 1.0
 * 
 * 
 * @param args La cadena de texto que se desea invertir.
 * */
	// We are going to create a function that takes a string and returns it reversed.
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String antes, despues;
	        System.out.print("Write a string: ");
	        antes = sc.nextLine();
	        despues = alReves(antes); // use the function
	        System.out.println(despues); // display the result
	        sc.close();
	    }

	    // We will traverse the original string in the writing direction: from
	    // left to right. Each character will be concatenated at the beginning of the
	    // new string. This way, we achieve the reversal.
	    /**
	     * 
	     * @param original Se le pasara a la funcion alReves la cadena introducida por consola
	     * @return La funcion alReves devolverla un String. Devolverá la cadena introducida al reves
	     * 
	     * 
	     * */
	    
	    
	    
	    
	    static String alReves(String original) {
	        String nueva = "";
	        for (int i = original.length(); i > 1; i--) {
	            nueva = original.charAt(i) + nueva; // concatenate the character before
	            // nueva
	        }
	        return nueva;
	    }
	}


