/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio1;

/**
 * EJERCICIO 1
 */
public abstract class Producto {
	protected String id;
	protected String nombre;
	protected double precio;
	/**
	 * @param string
	 * @param nombre
	 * @param precio
	 */
	public Producto(String id, java.lang.String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getid() {
		return id;
	}
	public void setString(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public abstract void calcularPrecioFinal();
}
