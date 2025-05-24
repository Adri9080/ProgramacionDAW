/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 3
 */
public class Asistente extends Empleado {

	/**
	 * @param nombre
	 * @param salarioAnual
	 */
	public Asistente(String nombre, int salarioAnual) {
		super(nombre, salarioAnual);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcularBonoAnual() {
		// TODO Auto-generated method stub
		System.out.println("Bono Anual: " + (salarioAnual*0.05));
	}

}
