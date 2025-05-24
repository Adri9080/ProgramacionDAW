/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERICIO 4
 */
public class Bicicleta extends Vehiculo {

	/**
	 * @param marca
	 * @param modelo
	 * @param velocidadMaxima
	 */
	public Bicicleta(String marca, String modelo, int velocidadMaxima) {
		super(marca, modelo, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}

	@Override
	void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Pedalando");
	}

	@Override
	void detener() {
		// TODO Auto-generated method stub
		System.out.println("Presionando frenos");
	}

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Pedaleando mas rapido");

	}

}
