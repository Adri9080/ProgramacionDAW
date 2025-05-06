/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema8.Ejercicio822_823_AdrianGomez;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("====================================");
	        System.out.println("  PRUEBA DE CLASES DE POLÍGONOS  ");
	        System.out.println("====================================");
	        System.out.println();

	        // Probando Triángulo
	        Triangulo triangulo = new Triangulo(5.0, 3.0);
	        System.out.println("--- TRIÁNGULO ---");
	        System.out.println("Base: " + triangulo.base);
	        System.out.println("Altura: " + triangulo.altura);
	        System.out.printf("Área: %.2f\n", triangulo.area());
	        System.out.println();

	        // Probando Rectángulo
	        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
	        System.out.println("--- RECTÁNGULO ---");
	        System.out.println("Base: " + rectangulo.base);
	        System.out.println("Altura: " + rectangulo.altura);
	        System.out.printf("Área: %.2f\n", rectangulo.area());
	        System.out.println();

	        System.out.println("====================================");
	        System.out.println("       PRUEBA FINALIZADA       ");
	        System.out.println("====================================");

	}

}
