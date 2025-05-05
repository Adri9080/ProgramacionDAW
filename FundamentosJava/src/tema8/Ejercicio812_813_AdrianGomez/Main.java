/**
 * @author AdrianGomez
 * @version 1.0
 */
package tema8.Ejercicio812_813_AdrianGomez;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("=========================================");
	        System.out.println("  PRUEBA DE CLASES CAJA Y CAJA CARTÓN   ");
	        System.out.println("=========================================");
	        System.out.println();

	        // ========== PRUEBA CON UNIDADES EN CENTÍMETROS (cm) ==========
	        System.out.println("\n🔵 CASO 1: Medidas en centímetros (cm)");
	        System.out.println("-----------------------------------------");
	        
	        // Crear una caja normal en cm
	        Caja cajaNormalCm = new Caja(30, 50, 20, "cm", "Caja pequeña cm");
	        System.out.println("📦 Caja Normal (cm):");
	        System.out.println(cajaNormalCm.toString());
	        System.out.printf("📏 Volumen real: %.2f m³\n", cajaNormalCm.getVolumen());
	        
	        // Crear una caja de cartón en cm
	        CajaCarton cajaCartonCm = new CajaCarton(30, 50, 20, "cm", "CajaCartón cm");
	        System.out.println("\n📦 Caja de Cartón (cm):");
	        System.out.println(cajaCartonCm.toString());
	        System.out.printf("📏 Volumen útil (80%%): %.2f cm³\n", cajaCartonCm.getVolumen());
	        System.out.printf("📐 Superficie total: %.2f cm²\n", cajaCartonCm.getSuperficieTotal());

	        // ========== PRUEBA CON UNIDADES EN METROS (m) ==========
	        System.out.println("\n🟢 CASO 2: Medidas en metros (m)");
	        System.out.println("-----------------------------------------");
	        
	        // Crear una caja normal en m
	        Caja cajaNormalM = new Caja(1, 2, 1, "m", "Caja grande m");
	        System.out.println("📦 Caja Normal (m):");
	        System.out.println(cajaNormalM.toString());
	        System.out.printf("📏 Volumen real: %.2f m³\n", cajaNormalM.getVolumen());
	        
	        // Crear una caja de cartón en m (se convierte internamente a cm)
	        CajaCarton cajaCartonM = new CajaCarton(1, 2, 1, "m", "CajaCartón m");
	        System.out.println("\n📦 Caja de Cartón (m → convertida a cm):");
	        System.out.println(cajaCartonM.toString());
	        System.out.printf("📏 Volumen útil (80%%): %.2f cm³\n", cajaCartonM.getVolumen());
	        System.out.printf("📐 Superficie total: %.2f cm²\n", cajaCartonM.getSuperficieTotal());

	        // ========== PRUEBA DE ETIQUETAS ==========
	        System.out.println("\n🟣 CASO 3: Prueba de etiquetas");
	        System.out.println("-----------------------------------------");
	        
	        // Intentar etiqueta larga (más de 30 caracteres)
	        System.out.println("⚠️ Intentando asignar etiqueta larga:");
	        cajaNormalCm.setEtiqueta("Esta etiqueta es demasiado larga y no debería ser aceptada");
	        System.out.println("✅ Etiqueta actual: '" + cajaNormalCm.getEtiqueta() + "'");

	        // Asignar etiqueta válida
	        cajaNormalCm.setEtiqueta("Etiqueta correcta");
	        System.out.println("\n✅ Etiqueta válida asignada:");
	        System.out.println(cajaNormalCm.toString());

	        System.out.println("\n=========================================");
	        System.out.println("           PRUEBAS COMPLETADAS           ");
	        System.out.println("=========================================");
	}

}
