package tema7.Ejercicio721_22_AdrianGomez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto listaConjunto=new Conjunto();
		Conjunto listaConjunto2=new Conjunto();
		Integer numInteger=5;
		System.out.println("Se pudo insertar el numero 5 en Conjunto 1?: "+listaConjunto.insertar(numInteger));
		numInteger=2;
		System.out.println("Se pudo insertar el numero 2 en Conjunto 2?: "+listaConjunto2.insertar(numInteger));
		listaConjunto.muestra();
		listaConjunto2.muestra();
		
		
		System.out.println("\nSe pudo combinar las dos listas?: "+listaConjunto.insertar(listaConjunto2));
		listaConjunto.muestra();
		numInteger=6;
		System.out.println("\nSe pudo insertar el numero 6 en Conjunto 1?: "+listaConjunto.insertar(numInteger));
		numInteger=2;
		System.out.println("Se pudo insertar el numero 2 en Conjunto 2?: "+listaConjunto2.insertar(numInteger));
		numInteger=8;
		System.out.println("Se pudo insertar el numero 8 en Conjunto 2?: "+listaConjunto2.insertar(numInteger));
		numInteger=6;
		System.out.println("Se pudo insertar el numero 6 en Conjunto 2?: "+listaConjunto2.insertar(numInteger));
		
		numInteger=5;
		System.out.println("\nSe pudo eliminar el numero 5 del Conjunto 1: "+listaConjunto.eliminarElemento(numInteger));
		System.out.println("Se pudo eliminar los numeros al menos un numero de 2,8,6 del Conjunto 1?: "+listaConjunto.eliminarConjunto(listaConjunto2));
		
		numInteger=8;
		System.out.println("Pertenece el numero 8 al Conjunto 2?: "+listaConjunto2.pertenece(numInteger));
		numInteger=5;
		System.out.println("Pertenece el numero 5 al Conjunto 1?: "+listaConjunto.pertenece(numInteger));
	}

}
