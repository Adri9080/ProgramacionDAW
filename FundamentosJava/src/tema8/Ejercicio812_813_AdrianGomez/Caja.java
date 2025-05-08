package tema8.Ejercicio812_813_AdrianGomez;

/*
 * @author AdrianGomez
 * @ version 1.0
 */

public class Caja {

	protected final double ancho;
	protected final double alto;
	protected final double fondo;
	protected final String unidad;
	protected String etiqueta;
	
	/**
	 * @param ancho
	 * @param alto
	 * @param fondo
	 * @param unidad
	 * @param etiqueta
	 */
	
	//Constructor
	public Caja(int ancho, int alto, int fondo, String unidad, String etiqueta) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
		this.etiqueta = etiqueta;
	}

	//Getter y Setters
	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @return the fondo
	 */
	public double getFondo() {
		return fondo;
	}

	/**
	 * @return the etiqueta
	 */
	public String getEtiqueta() {
		return etiqueta;
	}


	/**
	 * @param etiqueta the etiqueta to set
	 */
	//Se comprueba que la etiqueta tenga 30 caracteres o menos, en el caso de que no sea asi se devuelve un mensaje de error
	public void setEtiqueta(String etiqueta) {
		if (etiqueta.length() > 30) {
			System.out.println("Solo se permiten 30 caractéres");
		}else {
			this.etiqueta = etiqueta;
		}
		
	}

	/**
	 * @return the unidad
	 */
	public String getUnidad() {
		return unidad;
	}

	/**
	 * @return the volumen
	 */
	// En el caso de que la unidad introducida sea en metros solo se calculara los metros cubicos,
	// en cambio si la unidad introducida es en centimetros se parasara a metros y se devolveran los metros cubicos
	public double getVolumen() {
		
		switch (unidad) {
		
		case "m":
			return alto * ancho * fondo;
		case "cm":
			double altom = alto/100;
			double anchom = ancho/100;
			double fondom = fondo/100;
			
			return altom * anchom * fondom;
			
		default:
			System.out.println("Solo se permiten las medidas en m o cm");
			return 0;
		}
	}

	//Metodo to String para imprimir los valores por pantalla
	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta=" + etiqueta + "]";
	}
	
	
	
	


	
	
}
