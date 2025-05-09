/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.ejerciciosInterfaces;

/**
 * 
 */
public class Cuadrado implements Figura {
	private double lado;
	
	/**
	 * @param lado
	 */
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

}
