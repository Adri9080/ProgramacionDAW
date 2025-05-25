/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio2;

/**
 * 
 */
public class Rectangulo implements Forma {
	private double base;
	private double altura;
	
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area del Rectangulo: " + (this.base*this.altura));
	}

	@Override
	public void calcularPerrimetro() {
		// TODO Auto-generated method stub
		System.out.println("Perimetro del Rectangulo: " + 2*(this.base+this.altura));

	}

}
