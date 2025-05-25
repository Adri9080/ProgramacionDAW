/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio1;

/**
 * 
 */
public class Telefono extends Producto {
	protected int almacenamiento;
	/**
	 * @param string
	 * @param nombre
	 * @param precio
	 */
	public Telefono(String id, String nombre, double precio,int almacenamiento) {
		super(id, nombre, precio);
		this.almacenamiento = almacenamiento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularPrecioFinal() {
		// TODO Auto-generated method stub
		if (this.almacenamiento > 64) {
			this.precio += 50;
			System.out.println("Precio aumentado en 50 euros");
			
		}
	}
	

}
