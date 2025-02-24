package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad519_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carrera();
	}
	public static void carrera() {
		Scanner scanner=new Scanner(System.in);
		int  dorsal=0;
		int dopados[]=new int[0];
		int menores[]= new int[0];
		int corredores[]= new int[0];
		int posicion=0;
		//Incrementa la lista cada input del usuario, si se introduce -1 se sale del bucle do while, los datos los
		// guarda en la lista
		do {
			corredores=Arrays.copyOf(corredores, corredores.length+1);
			System.out.println("Introduce el dorsal en la posicion: "+ (posicion+1));
			dorsal=scanner.nextInt();
			if (dorsal>=0) {
				corredores[posicion]=dorsal;
				posicion+=1;
			}
		} while (dorsal>=0);
		//Reduzco la longitud de la lista porque pone una posicion de mas
		corredores=Arrays.copyOf(corredores, corredores.length-1);
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(corredores));
		System.out.println("-------------------------");
		//reinicio la variable dorsal para que pueda entrar al bucle y vuelva a pedir dorsales
		dorsal=0;
		// Pide los dorsales de los menores
		do {
			menores=Arrays.copyOf(menores, menores.length+1);
			System.out.println("Introduce los dorsales menores de edad (Para salir introduce -1)");
			dorsal=scanner.nextInt();
			if (dorsal>=0) {
				menores[menores.length-1]=dorsal;
			}
			
		} while (dorsal>=0);
		
		//Reduzco la longitud de la lista porque pone una posicion de mas
		menores=Arrays.copyOf(menores, menores.length-1);
		int resultado1[]=new int[corredores.length];
		System.arraycopy(corredores, 0, resultado1, 0,corredores.length);
		int posicionpri=0;
		//Recorro la lista menores, y recorro la lista con los dorsales para encontrar la posicion del elemento de la lista
		//menores que esta en el ciclo.
		for (int i : menores) {
			for (int j = 0; j < corredores.length; j++) {
				posicionpri=resultado1[j];
				if (posicionpri==i) {
					posicionpri=j;
					break;
				}else {
					posicionpri=-1;
				}
				
			}
			//Si el dorsal no existe en la lista devuelve un -1, que esto imprime un mensaje
			if (posicionpri==-1) {
				System.out.println("El dorsal: "+ i +" no existe" );
			//Creo dos variable, la primera con el valor de la posicion a la que quiero cambiar
			// y la segunda con el valor que voy a adelantar
			// cambia los valores de posicion, la variable puesto1 avanza una posicion y puesto2 se pone en la posicion de
			// puesto1
			}else {
				int puesto1=resultado1[posicionpri-1];
				int puesto2=resultado1[posicionpri];
				resultado1[posicionpri]=puesto1;
				resultado1[posicionpri-1]=puesto2;
			}
		}
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(resultado1));
		System.out.println("-------------------------");
		dorsal=0;
		//Pide los dorsales de los dopados
		do {
			dopados=Arrays.copyOf(dopados, dopados.length+1);
			System.out.println("Introduce los dorsales dopados(Para salir -1)");
			dorsal=scanner.nextInt();
			if (dorsal>=0) {
				dopados[dopados.length-1]=dorsal;
			}
		} while (dorsal>=0);
		System.out.println("-------------------------");
		dopados=Arrays.copyOf(dopados, dopados.length-1);
		int resultado2[]=new int[resultado1.length];
		//Creo una lista con los dorsales limpios, los que no han dado positivo
		int limpios[]=new int[resultado1.length];
		resultado2=resultado1;
		//Recorro la lista dopados para encontrar la posicion en la lista de resultado2
		for (int k : dopados) {
			for (int m = 0; m < corredores.length; m++) {
				posicionpri=resultado2[m];
				if (posicionpri==k) {
					posicionpri=m;
					break;
				}else {
					posicionpri=-1;
				}
				
			}
			if (posicionpri==-1) {
				System.out.println("El dorsal: "+ k +" no existe" );
			}else {
				//Copia los elementos que estan antes del elemento que quiero eliminar(lo demas lo iguala a 0).
				//Despues copia los elementos que estan despues del elemento a eliminar.
				//Copiara todos los elementos excepto el dorsal dopado.
				System.arraycopy(resultado2, 0, limpios, 0, posicionpri);
				System.arraycopy(resultado2, posicionpri+1, limpios, posicionpri, resultado2.length-posicionpri-1);
				limpios=Arrays.copyOf(limpios, limpios.length-1);
				//Referencio la tabla para 'aplicar los cambios' y que pueda hacer el proceso de copiar correctamente
				resultado2=limpios;
			}
		}
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(limpios));
		System.out.println("-------------------------");
		int morosos[]=new int [0];
		int resultado3[]= new int [resultado2.length];
		resultado3=limpios;
		dorsal=0;
		// Pido dorsales que no han pagado la cuota
		do {
			morosos=Arrays.copyOf(morosos, morosos.length+1);
			System.out.println("Introduce los dorsales que no han pagado(Para salir -1)");
			dorsal=scanner.nextInt();
			if (dorsal>=0) {
				morosos[morosos.length-1]=dorsal;
			}
		} while (dorsal>=0);
		morosos=Arrays.copyOf(morosos, morosos.length-1);
		//Recorro la lista morosos para encontrar su posicion en la lista limpios
		for (int o : morosos) {
			for (int b = 0; b < resultado2.length; b++) {
				posicionpri=limpios[b];
				if (posicionpri==o) {
					posicionpri=b;
					break;
				}else {
					posicionpri=-1;
				}
				
			}
			if (posicionpri==-1) {
				System.out.println("El dorsal: "+ o +" no existe" );
			}else {
				//Aumenta el tamaño de la lista resultado3 para que nos permita mover el dorsal a la ultima posicion.
				//Segundo, mueve el dorsal a la ultima posicion
				//Tercero, copia los elementos que estaban despues de ese dorsal
				//Reduzco la lista una posicion porque da una posicion de mas
				resultado3=Arrays.copyOf(resultado3, resultado3.length+1);
				resultado3[resultado3.length-1]=resultado3[posicionpri];
				System.arraycopy(resultado3, posicionpri+1, resultado3, posicionpri, resultado3.length-posicionpri-1);
				resultado3=Arrays.copyOf(resultado3, resultado3.length-1);
				//Referencio la lista resultado3 a limpios, para poder aplicar los cambios y seguir trabajando con la
				//misma lista
				limpios=resultado3;
			}
		}
		scanner.close();
		System.out.println("-------------------------");
		System.out.println("Resultado Final: ");
		System.out.println(Arrays.toString(resultado3));
		System.out.println("-------------------------");
		System.out.println("*************************");
		System.out.println("Primer puesto: "+ resultado3[0]);
		System.out.println("Segundo Puesto: "+ resultado3[1]);
		System.out.println("Tercer Puesto: "+ resultado3[2]);
		System.out.println("*************************");
	}
}
