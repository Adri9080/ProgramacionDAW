/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

/**
 * EJERCICIO 5
 */
public class Electronico extends TiendaOnline {
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	protected double precio;
	protected String descripcion;
	protected int stock;
	/**
	 * @param precio
	 * @param descripcion
	 * @param stock
	 */
	public Electronico(double precio, String descripcion, int stock) {
		super();
		this.precio = precio;
		this.descripcion = descripcion;
		this.stock = stock;
	}
	


}
