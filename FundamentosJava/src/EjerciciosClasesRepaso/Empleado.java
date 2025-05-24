/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 3
 */
abstract public class Empleado {
	protected String nombre;
	protected int salarioAnual;
	/**
	 * @param nombre
	 * @param salario
	 */
	public Empleado(String nombre, int salarioAnual) {
		super();
		this.nombre = nombre;
		this.salarioAnual = salarioAnual;
	}
	abstract void calcularBonoAnual();


}
