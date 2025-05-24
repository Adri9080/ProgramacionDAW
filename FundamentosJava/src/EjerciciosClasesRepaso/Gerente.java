/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 3
 */
public class Gerente extends Empleado {


	/**
	 * @param nombre
	 * @param salario
	 */
	public Gerente(String nombre, int salarioAnual) {
		super(nombre, salarioAnual);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcularBonoAnual() {
		// TODO Auto-generated method stub
		System.out.println("Bono Anual: " + (salarioAnual*0.10));
	}

}
