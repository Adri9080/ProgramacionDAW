package tema7.Ejercicio721_22_AdrianGomez;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto listaConjunto=new Conjunto();
		Conjunto listaConjunto2=new Conjunto();
		Conjunto listaConjunto3=new Conjunto();
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
		numInteger=10;
		System.out.println("Se pudo insertar el numero 10 en Conjunto 1?: "+listaConjunto.insertar(numInteger));
		numInteger=2;
		System.out.println("Se pudo insertar el numero 2 en Conjunto 1?: "+listaConjunto.insertar(numInteger));
		listaConjunto.muestra();
		listaConjunto2.muestra();
		System.out.println("Todos los elementos del Conjunto 1 estan en Conjunto 2?: "+ Conjunto.incluido(listaConjunto, listaConjunto2));
		System.out.println("Unimos las dos tablas: ");
		listaConjunto3=Conjunto.union(listaConjunto, listaConjunto2);
		listaConjunto3.muestra();
		listaConjunto3=Conjunto.interseccion(listaConjunto, listaConjunto2);
		System.out.println("Lista con elementos comunes entre el Conjunto 1 y Conjunto 2: ");
		listaConjunto3.muestra();
		listaConjunto3= Conjunto.diferencia(listaConjunto, listaConjunto2);
		System.out.println("Lista con elementos que estan en el Conjunto 1 pero no en el Conjunto 2: ");
		listaConjunto3.muestra();
		
		
		
		

		
	}

}
