/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.ejerciciosInterfaces.ejercicio2;

/**
 * 
 */
public class Video implements Reproducible {
	

	public Video() {
		super();
	}

	@Override
	public void play() {
		System.out.println("Video Reproduciendose");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Video parado");
		
	}

}
