/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio1;

/**
 * 
 */
public class Portatil extends Producto {
	protected double pulgadas;
	/**
	 * @param string
	 * @param nombre
	 * @param precio
	 */
	public Portatil(String id, String nombre, double precio, double pulgadas) {
		super(id, nombre, precio);
		this.pulgadas = pulgadas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularPrecioFinal() {
		// TODO Auto-generated method stub
		if(this.pulgadas > 15) {
			this.precio += 100;
			
		}
		
	}

}
