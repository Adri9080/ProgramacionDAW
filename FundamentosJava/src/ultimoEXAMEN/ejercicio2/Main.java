/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio2;

import java.util.ArrayList;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rectangulo1 = new Rectangulo(40, 20);
		Rectangulo rectangulo2 = new Rectangulo(30,15);
		Circulo circulo1 = new Circulo(20.3);
		Circulo circulo2 = new Circulo(15.2);
		ArrayList<Forma> formas = new ArrayList<Forma>();
		formas.add(rectangulo1);
		formas.add(rectangulo2);
		formas.add(circulo1);
		formas.add(circulo2);
		for (Forma forma : formas) {
			forma.calcularArea();
			forma.calcularPerrimetro();
		}
	}
	

}
