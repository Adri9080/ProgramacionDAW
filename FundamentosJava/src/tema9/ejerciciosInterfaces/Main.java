/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.ejerciciosInterfaces;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura circulo = new Circulo(10.2);
		System.out.println("Area Circulo: "+circulo.calcularArea());
		Figura cuadrado = new Cuadrado(5);
		System.out.println("Area Cuadrado: "+cuadrado.calcularArea());
		Figura[] lista = new Figura[4];
		lista[0]= new Circulo(5.3);
		lista[1]= new Cuadrado(2);
		lista[2] = new Circulo(7.2);
		lista[3] = new Cuadrado(4.2);
		
	for (int i = 0; i < lista.length; i++) {
		System.out.println("Area de la figura "+ i +" : "+ lista[i].calcularArea());
		
	}
		
		
		
	}
	

}
