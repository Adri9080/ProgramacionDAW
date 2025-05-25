/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio2;

/**
 * 
 */
public class Circulo implements Forma {
	private double radio;
	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area del circulo: " + Math.PI * (this.radio *this.radio));
	}

	@Override
	public void calcularPerrimetro() {
		// TODO Auto-generated method stub
		System.out.println("Perimetro del circulo: " +  (2 *(Math.PI *this.radio)));

	}

}
