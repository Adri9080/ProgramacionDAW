package tema7.Ejercicio721_22_AdrianGomez;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println("=== TESTEO DE LA CLASE Conjunto_2_0 ===");
	        System.out.println("---------------------------------------");
	        
	        // 1. Creación de conjuntos
	        Conjunto_2_0 conjuntoA = new Conjunto_2_0();
	        Conjunto_2_0 conjuntoB = new Conjunto_2_0();
	        System.out.println("Conjuntos creados (vacíos):");
	        System.out.print("Conjunto A: "); conjuntoA.muestra();
	        System.out.print("Conjunto B: "); conjuntoB.muestra();
	        System.out.println();
	        
	        // 2. Inserción de elementos
	        System.out.println("Insertando elementos en Conjunto A (1, 2, 3):");
	        System.out.println("Insertar 1: " + conjuntoA.insertar(1));
	        System.out.println("Insertar 2: " + conjuntoA.insertar(2));
	        System.out.println("Insertar 3: " + conjuntoA.insertar(3));
	        System.out.println("Insertar 2 (duplicado): " + conjuntoA.insertar(2));
	        System.out.print("Conjunto A: "); conjuntoA.muestra();
	        System.out.println("Número de elementos: " + conjuntoA.numeroElementos());
	        System.out.println();
	        
	        // 3. Pertenencia de elementos
	        System.out.println("Comprobando pertenencia:");
	        System.out.println("¿1 está en A? " + conjuntoA.pertenece(1));
	        System.out.println("¿5 está en A? " + conjuntoA.pertenece(5));
	        System.out.println();
	        
	        // 4. Eliminación de elementos
	        System.out.println("Eliminando elementos:");
	        System.out.println("Eliminar 2: " + conjuntoA.eliminarElemento(2));
	        System.out.println("Eliminar 5 (no existe): " + conjuntoA.eliminarElemento(5));
	        System.out.print("Conjunto A: "); conjuntoA.muestra();
	        System.out.println();
	        
	        // 5. Operaciones con otro conjunto
	        System.out.println("Preparando Conjunto B (2, 3, 4):");
	        conjuntoB.insertar(2);
	        conjuntoB.insertar(3);
	        conjuntoB.insertar(4);
	        System.out.print("Conjunto B: "); conjuntoB.muestra();
	        System.out.println();
	        
	        // 6. Inserción de conjunto
	        System.out.println("Insertar Conjunto B en A:");
	        System.out.println("Resultado: " + conjuntoA.insertar(conjuntoB));
	        System.out.print("Conjunto A: "); conjuntoA.muestra();
	        System.out.println();
	        
	        // 7. Eliminar conjunto
	        System.out.println("Eliminar elementos de B en A:");
	        System.out.println("Resultado: " + conjuntoA.eliminarConjunto(conjuntoB));
	        System.out.print("Conjunto A: "); conjuntoA.muestra();
	        System.out.println();
	        
	        // 8. Operaciones entre conjuntos
	        Conjunto_2_0 conjuntoC = new Conjunto_2_0();
	        conjuntoC.insertar(1);
	        conjuntoC.insertar(3);
	        conjuntoC.insertar(5);
	        
	        System.out.println("Preparando Conjunto C (1, 3, 5):");
	        System.out.print("Conjunto C: "); conjuntoC.muestra();
	        System.out.println();
	        
	        System.out.println("Operaciones entre B y C:");
	        System.out.println("¿B incluido en C? " + Conjunto_2_0.incluido(conjuntoB, conjuntoC));
	        System.out.println("¿C incluido en B? " + Conjunto_2_0.incluido(conjuntoC, conjuntoB));
	        
	        System.out.println("Unión B y C:");
	        Conjunto_2_0 union = Conjunto_2_0.union(conjuntoB, conjuntoC);
	        union.muestra();
	        
	        System.out.println("Intersección B y C:");
	        Conjunto_2_0 interseccion = Conjunto_2_0.interseccion(conjuntoB, conjuntoC);
	        interseccion.muestra();
	        
	        System.out.println("Diferencia B - C:");
	        Conjunto_2_0 diferencia = Conjunto_2_0.diferencia(conjuntoB, conjuntoC);
	        diferencia.muestra();
	}

}
