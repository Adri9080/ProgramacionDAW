/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.ejerciciosInterfaces.ejercicio2;

/**
 * 
 */
public class Cancion implements Reproducible {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cancion reproduciendose");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Cancion parada");
	}

}
