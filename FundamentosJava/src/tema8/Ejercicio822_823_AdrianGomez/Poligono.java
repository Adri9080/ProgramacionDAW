/**
 * @author AdrianGomez
 * @version 1.0
 * 
 * */
package tema8.Ejercicio822_823_AdrianGomez;

public abstract class Poligono {
	protected double base;
	protected double altura;
	/**
	 * @param base
	 * @param altura
	 */
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	abstract double area();
	
}
