package tema4;

import java.util.Scanner;
/* Las soluciones irán acompañadas de una función main que sirva de prueba.
   * El prototipo de la función es: void eco(int n). */
public class ActividadResuelta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        System.out.println("--Antes de llamar a la función--");
        
        eco(n); // Invocamos la función
        System.out.println("--Después de llamar a la función--");
    }
    
    // La función lo único que hace es mostrar un mensaje repetido mediante un bucle
    static void eco(int a) { 
        // El parámetro no tiene por qué llamarse como en la llamada
        for (int i = 0; i < a; i++) {
            System.out.println("Eco...");
        }
    }
}
