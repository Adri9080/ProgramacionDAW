package tema7.Persona;

public class Persona {

	//Atributos de la clase
	String nombre;
	int edad;
	int estatura;
	static String DNI;
	/**
	 * @param nombre
	 * @param edad
	 * @param estatura
	 */
	public Persona(String nombre, int edad, int estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	
	void saludar() {
		System.out.println("Hola. Mi nombre es "+ nombre);
		System.out.println("Encantado de conocerte");
	}
	
	void cumplirAños() {
		edad++;
	}
	void crecer(int incremento) {
		estatura+=incremento;
	}


}
