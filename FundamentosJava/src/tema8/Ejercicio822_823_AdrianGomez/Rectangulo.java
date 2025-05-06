/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema8.Ejercicio822_823_AdrianGomez;


public class Rectangulo extends Poligono {

	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		return base*altura;
	}
	

}
