/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 2
 */
public class Triangulo implements Figura {
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	private int lado3;
	
	/**
	 * @param area
	 * @param altura
	 */
	public Triangulo(int base, int altura,int lado1,int lado2,int lado3) {
		
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3= lado3;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area del Triangulo: "+ ((base*altura)/2));
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		System.out.println("Perimetro del Triangulo: "+ (this.lado1+this.lado2+this.lado3));

	}

}
