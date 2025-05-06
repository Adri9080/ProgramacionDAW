package tema8.Ejercicio822_823_AdrianGomez;

public class Triangulo extends Poligono {
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		return (base*altura)/2;
	}
	
}
