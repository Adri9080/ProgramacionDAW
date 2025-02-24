package tema2;

import java.util.Scanner;

public class Actividad212_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dni;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escriba su DNI");
		 dni=sc.nextInt();
		 if (dni<00000001 || dni>99999999) {
			 System.out.println("Tienes que introducir 8 digitos");
		 }else {
			 System.out.println("La letra para el DNI "+dni+" es "+ letra(dni));
		 }
	sc.close();	 
	}
	

public static String letra(int dni) {
	int resto=dni%23;
	switch (resto) {
	case 0: 
		return "T";
	case 1:
		return "R";
	case 2:
		return "W";
	case 3:
		return "A";
	case 4:
		return "G";
	case 5:
		return "M";
	case 6:
		return "Y";
	case 7:
		return "F";
	case 8:
		return "P";
	case 9:
		return "D";
	case 10:
		return "X";
	case 11:
		return "B";
	case 12:
		return "N";
	case 13:
		return "J";
	case 14:
		return "Z";
	case 15:
		return "S";
	case 16:
		return "Q";
	case 17:
		return "V";
	case 18:
		return "H";
	case 19:
		return "L";
	case 20:
		return "C";
	case 21:
		return "K";
	case 22:
		return "E";
		
	}
	return null;
	
	
	
} }