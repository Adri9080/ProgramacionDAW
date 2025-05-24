/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 4
 */
abstract public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int velocidadMaxima;
	/**
	 * @param marca
	 * @param modelo
	 * @param velocidadMaxima
	 */
	public Vehiculo(String marca, String modelo, int velocidadMaxima) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
	}
	abstract void arrancar();
	abstract void detener();
	abstract void acelerar();
	
	
}
