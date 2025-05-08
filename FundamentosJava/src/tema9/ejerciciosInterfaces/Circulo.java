/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.ejerciciosInterfaces;


public class Circulo implements Figura {
	private double radio;
	
	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double calcularArea() {
		return Math.pow(this.radio, 2)*Math.PI;
	}


	
}
