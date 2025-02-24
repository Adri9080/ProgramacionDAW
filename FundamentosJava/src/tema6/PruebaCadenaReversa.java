package tema6;
import java.util.Scanner;
public class PruebaCadenaReversa {

	// We are going to create a function that takes a string and returns it reversed.
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String antes, despues;
	        System.out.print("Write a string: ");
	        antes = sc.nextLine();
	        despues = alReves(antes); // use the function
	        System.out.println(despues); // display the result
	    }

	    // We will traverse the original string in the writing direction: from
	    // left to right. Each character will be concatenated at the beginning of the
	    // new string. This way, we achieve the reversal.
	    static String alReves(String original) {
	        String nueva = "";
	        for (int i = original.length(); i > 1; i--) {
	            nueva = original.charAt(i) + nueva; // concatenate the character before
	            // nueva
	        }
	        return nueva;
	    }
	}


