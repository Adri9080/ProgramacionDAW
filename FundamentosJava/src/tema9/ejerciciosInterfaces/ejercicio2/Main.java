/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.ejerciciosInterfaces.ejercicio2;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reproducible video = new Video();
		video.play();
		video.stop();
		Reproducible cancion = new Cancion();
		cancion.play();
		cancion.stop();
	}

}
