/**
 * 
 */
package lecturaFicheros;
import java.io.*;

/**
 * 
 */
public class Ejercicio1_AdrianGomez {
	
	public static void main(String[] args) {
		int contador=0;
		 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adrian.gomizq\\Desktop\\notas.txt"))) {
		 String linea;
		 while ((linea = br.readLine()) != null) {
		 System.out.println(linea);
		 contador++;
		 }} catch (IOException e) {
			 e.printStackTrace();
		 }finally {
			 System.out.println("Numero de Lineas: "+ contador);
		 }
		 }
		 
	}