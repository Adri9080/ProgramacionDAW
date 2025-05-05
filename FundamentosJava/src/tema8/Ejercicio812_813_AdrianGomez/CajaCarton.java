/**
 * 
 */
package tema8.Ejercicio812_813_AdrianGomez;

/**
 * 
 */
public class CajaCarton extends Caja{

	/**
	 * @param ancho
	 * @param alto
	 * @param fondo
	 * @param unidad
	 * @param etiqueta
	 */
	//Contructor, hereda de la clase Caja
	public CajaCarton(int ancho, int alto, int fondo, String unidad, String etiqueta) {
		super(ancho, alto, fondo, unidad, etiqueta);
		// Si la unidad es metros, las medidas se pasaran a centimetros
		if (this.equals("m")) {
			this.ancho= ancho * 100;
			 this.alto=alto * 100;
			 this.fondo=fondo*100;
		}
	}
	
	//Calcula el 80% de los metros cubicos
	public double getVolumen() {

				return (alto * ancho * fondo) * 0.8;
				
		}
	 //Metodo para calcular la superficie total del carton en centimetros cuadrados
	  public double getSuperficieTotal() {
	        // Area de las 6 caras
	        double areaAnchoAlto = ancho * alto;
	        double areaAnchoFondo = ancho * fondo;
	        double areaAltoFondo = alto * fondo;

	        // Sumao todas las caras (cada una aparece 2 veces)
	        return 2 * (areaAnchoAlto + areaAnchoFondo + areaAltoFondo);
	    }
	 //Metodo to string para imprimir por pantalla el valor de los parametros y el metodo getVolumen
	@Override
	public String toString() {
		return "CajaCarton [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad
				+ ", etiqueta=" + etiqueta + ", getVolumen()=" + getVolumen() + "]";
	}
		
	
	}




