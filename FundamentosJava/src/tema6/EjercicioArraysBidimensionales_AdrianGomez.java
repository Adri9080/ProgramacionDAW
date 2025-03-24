package tema6;
import java.util.Scanner;

public class EjercicioArraysBidimensionales_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int opt=1;
		String jugadoras[][] = new String[4][5];
		/** Estructura del Array
		 * [
		 * Jugadora 1 [][][][]
		 * Jugadora 2 [][][][]
		 * Jugadora 3 [][][][]
		 * Jugadora 4 [][][][]
		 * ]
		 */
		jugadoras=insertarDatos(jugadoras,sc);
		do {
			System.out.println("------------------------------");
			System.out.println("1.Mostrar datos de jugadoras");
			System.out.println("2.Añadir Jugadoras");
			System.out.println("3.Eliminar una Jugadora");
			System.out.println("0.Salir");
			System.out.print("Elige una opcion: ");
			opt=sc.nextInt();
			System.out.println("------------------------------");
			sc.nextLine(); //Limpio el buffer del scanner para evitar problemas
			switch (opt) {
			case 1:
				datosJugadoras(jugadoras,sc);
				break;
			case 2:
				jugadoras=añadirJugadora(jugadoras,sc);
				break;
			case 3:
				jugadoras=eliminarJugadora(jugadoras,sc);
				break;
			default:
				break;
			}
		} while (opt!=0);
		sc.close();
		
	}
public static String[][] insertarDatos(String jugadoras[][],Scanner sc) {
	String datos[]= {"Nombre","Apellido 1","Apellido 2","Posicion","Ciudad de Nacimiento"}; //Array para decir que dato tiene que introducir
	for (int i = 0; i < jugadoras.length; i++) {
		System.out.println("*****************");
		System.out.println("Jugadora "+i);
		for (int j = 0; j < jugadoras[i].length; j++) {
			System.out.println("Introduce el siguiente dato: "+datos[j]);
			jugadoras[i][j]=sc.nextLine();
			
		}
		
	}
	return jugadoras;
}
public static void datosJugadoras(String jugadoras[][],Scanner sc) {
	String datos[]= {"Nombre","Apellido 1","Apellido 2","Posicion","Ciudad de Nacimiento"};
	//Recorro el array para mostrar los datos
	for (int i = 0; i < jugadoras.length; i++) {
		System.out.println("*****************");
		System.out.println("Datos de la Jugadora: "+i);
		for (int j = 0; j < jugadoras[i].length; j++) {
			System.out.println("\t"+datos[j]+":"+jugadoras[i][j]);
		}
		
	}
}

public static String[][] añadirJugadora(String jugadoras[][],Scanner sc) {
	String datos[]= {"Nombre","Apellido 1","Apellido 2","Posicion","Ciudad de Nacimiento"};
	String jugadorasnueva[][]=new String[jugadoras.length+1][jugadoras[0].length];
	//Copiamos los datos de la tabla antigua
	for (int i = 0; i < jugadoras.length; i++) {
		 System.arraycopy(jugadoras[i], 0, jugadorasnueva[i], 0, jugadoras[i].length);
		
	}
	//For que recorrera el array que hemos creado y el usuario introducira los datos especificados
	for (int i = 0; i < jugadoras[jugadoras.length-1].length; i++) {
		System.out.println("Introduce el siguiente dato: "+datos[i]);
		jugadorasnueva[jugadorasnueva.length-1][i]=sc.nextLine();
	}
	System.out.println("Jugadora añadida correctamente");
	return jugadorasnueva;
}

public static String[][] eliminarJugadora(String jugadoras[][],Scanner sc){
	int opt;
	//Creo un array con uno de longitud menos que el array jugadoras
	String jugadorasnueva[][]=new String[jugadoras.length-1][jugadoras[0].length];
	datosJugadoras(jugadoras,sc); //Llamo a la funcion de motrar datos para que el usuario decida que jugadora borrar e introduzca un indice correcto
	System.out.println("¿Que jugadora quieres eliminar?");
	opt=sc.nextInt();
	 if (opt < 0 || opt > jugadoras.length) { //Compruebo que el indice es correcto, si no lo es devuelve un mensaje y no hace nada
	        System.out.println("Índice inválido. No se eliminó ninguna jugadora.");
	        return jugadoras;
	    }
	 //Copio primero los arrays que hay antes de la jugadora que quiere eliminar
	System.arraycopy(jugadoras, 0, jugadorasnueva, 0, opt);
	//Copio los arrays que hay despues de la jugadora que quiere eliminar y asi eliminaremos la jugadora que ha elegido
	System.arraycopy(jugadoras, opt+1, jugadorasnueva, opt, jugadorasnueva.length-opt);
	System.out.println("Jugadora "+opt+ "eliminada correctamente");
	return jugadorasnueva;
}

}
