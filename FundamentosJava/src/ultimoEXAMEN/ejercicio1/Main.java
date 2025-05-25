/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio1;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portatil portatil1 = new Portatil("1", "Portatil 1", 100.33, 16.2);
		portatil1.calcularPrecioFinal();
		Portatil portatil2 = new Portatil("2", "Portatil 2", 50.33, 13);
		portatil2.calcularPrecioFinal();
		Telefono telefono1 = new Telefono("3", "Telefono 1", 300.50, 70);
		telefono1.calcularPrecioFinal();
		Telefono telefono2 = new Telefono("4", "Telefono 2", 150.50, 64);
		telefono2.calcularPrecioFinal();
		Producto[] productos = {portatil1,portatil2,telefono1,telefono2};
		for (Producto producto : productos) {
			System.out.println("Precio de producto: " + producto.getNombre() + " ---> "+ producto.getPrecio());
		}
	}

}
