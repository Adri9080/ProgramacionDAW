/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 2
 */
public class Circulo implements Figura {

	private double radio;
	
	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area del Ciruclo: "+ (Math.PI*this.radio*this.radio));
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		System.out.println("Perimetro del Ciruclo: "+ (2*Math.PI*this.radio));
	}

}
