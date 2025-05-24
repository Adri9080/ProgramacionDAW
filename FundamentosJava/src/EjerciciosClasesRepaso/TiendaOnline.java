/**
 * @Author AdrianGomez
 * @version 1.0
 */
package EjerciciosClasesRepaso;

import java.util.ArrayList;

/**
 * EJERCICIO 5
 */
public class TiendaOnline {

	private ArrayList<TiendaOnline> carrito;
	
	/**
	 * @param carrito
	 */
	public TiendaOnline() {
		
		this.carrito = new ArrayList<>();
	}
	public void anadirCarritoRopa(Ropa ropa){
		if(ropa.stock > 0) {
			System.out.println("ERROR NO HAY STOCK DEL PRODUCTO: "+ ropa.descripcion );
		}else {
			System.out.println("Añadiendo el producto "+ ropa.descripcion +" al carrito. ");
			carrito.add(ropa);
			ropa.stock--;
			}
		
	}
	public void anadirCarritoElectronica(Electronico electronico) {
		if(electronico.stock > 0) {
			System.out.println("Añadiendo el producto "+ electronico.descripcion +" al carrito. ");
			carrito.add(electronico);
			electronico.stock--;
		}else {
			System.out.println("ERROR NO HAY STOCK DEL PRODUCTO: "+ electronico.descripcion );
			
			}
	}
	public void eliminarProductoRopa(Ropa ropa) {
		if(carrito.contains(ropa)) {
			System.out.println("Eliminando producto "+ ropa.descripcion + " del carrito ");
			carrito.remove(ropa);
			ropa.stock++;
		}else {
			System.out.println("No se puede eliminar el elemento " + ropa.descripcion +" porque no esta en el carrito ");

		}
		
	}
	public void eliminarProductoElectronica(Electronico electronico) {
		if(carrito.contains(electronico)) {
			System.out.println("Eliminando producto "+ electronico.descripcion + " del carrito ");
			carrito.remove(electronico);
			electronico.stock++;
		}else {
			System.out.println("No se puede eliminar el elemento " + electronico.descripcion +" porque no esta en el carrito ");

		}
	}
	public void totalCarrito() {
		double total =0;
		for (TiendaOnline producto : carrito) {
			total += producto.getPrecio();
		}
		System.out.println("El total del carrito es: "+ total);
	}
	
}
