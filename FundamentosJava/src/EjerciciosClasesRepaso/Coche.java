/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERICIO 4
 */
public class Coche extends Vehiculo {

	/**
	 * @param marca
	 * @param modelo
	 * @param velocidadMaxima
	 */
	public Coche(String marca, String modelo, int velocidadMaxima) {
		super(marca, modelo, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}

	@Override
	void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Metiendo llave y arrancando motor");
	}

	@Override
	void detener() {
		// TODO Auto-generated method stub
		System.out.println("Pisando el freno");

	}

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Pisando el acelerador");
	}

}
