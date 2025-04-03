/**
 * 
 */
package tema7.Ejercicio716_AdrianGomez;


/**
 * @author AdrianGomez
 * @version 1.0
 */
public class Punto {
	//ATRIBUTOS X, Y
private double x;
private double y;
/**
 * @return the x
 */
public double getX() {
	return x;
}
/**
 * @param x the x to set
 */
public void setX(double x) {
	this.x = x;
}
/**
 * @return the y
 */
public double getY() {
	return y;
}
/**
 * @param y the y to set
 */
public void setY(double y) {
	this.y = y;
}
/**
 * @param x
 * @param y
 */

// CONSTRUCTOR DE LA CLASE
public Punto(double x, double y) {
	super();
	this.x = x;
	this.y = y;
}
/**
 * @param dx
 */
// PROCEDIMIENTO QUE SUMARA A X EL VALOR DEL PARAMETRO DX
public void desplazaX(double dx) {
	this.x += dx;
}
/**
 * @param dy
 * */
//PROCEDIMIENTO QUE SUMARA A Y EL VALOR DEL PARAMETRO DY
public void desplazaY(double dy) {
	this.y += dy;
}
/**
 * @param double dx
 * @param double dy
 * */
//PROCEDIMIENTO QUE SUMARA A X,Y EL VALOR DE LOS PARAMETROS DX, DY
public void desplaza(double dx, double dy) {
	this.x += dx;
	this.y += dy;
}
/**
 * @param Punto otro
 * */
// PROCEDIMEINTO QUE CALCULARA LA DISTANCIA EUCLIDEA SEGUN LA FORMULA PARA CALCULARLA
//√((x2 - x1)² + (y2 - y1)²)
public void distanciaEuclidea(Punto otro) {
	double d;
	double restax=otro.x-x;
	double restay=otro.y-y;
	d=Math.sqrt((Math.pow(restax,2)+Math.pow(restay, 2)));
	System.out.println("La distancia euclidea es: "+ d);
}
void muestra() {
	System.out.println("X = "+x);
	System.out.println("Y = "+y);
}
}
