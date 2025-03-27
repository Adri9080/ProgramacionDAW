package tema7;

public class ClaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1= new Persona("Adri", 18, 175);
		p1.saludar();
		p1.cumplirAños();
		System.out.println(p1.edad);
		p1.crecer(10);
		System.out.println(p1.estatura);
		
	}

}
