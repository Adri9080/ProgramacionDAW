/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 2
 */
public class Rectangulo implements Figura {
	private int base;
	private int altura;
	
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area del Rectangulo: "+ (this.base*this.altura));
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		System.out.println("Perimetro del Rectangulo: "+ (2*(this.base+this.altura)));
	}

}
