package tema7.Ejercicio716_AdrianGomez;

public class Main {

	public static void main(String[] args) {
		//CREACION DE OBJETO PUNTO 1
		Punto p1= new Punto(10.5, 11.2);
		//CREACION DE OBJETO PUNTO 2
		Punto p2= new Punto(2.3, 7.3);
		System.out.println("");
		p1.distanciaEuclidea(p2);
		p1.desplaza(1.0, 0.5);
		p2.desplaza(10.2, 3.7);
		System.out.println("\nPunto 1:");
		p1.muestra();
		
		System.out.println("\nPunto 2:");
		p2.muestra();		

	}

}
