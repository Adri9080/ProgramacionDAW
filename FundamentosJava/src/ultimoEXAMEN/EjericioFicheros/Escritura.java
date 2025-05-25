/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.EjericioFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 
 */
public class Escritura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))){
			String linea;
			while((linea = br.readLine()) != null ) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter("notas_copia.txt",true))){
					if (linea.toLowerCase().startsWith("a")) {
						bw.write(linea);
						bw.newLine();
					}
					System.out.println("Lineas escritas correctamente");
					
				} catch (Exception e) {
					System.out.println("No ha sido posible escribir el fichero");
					e.getStackTrace();
				}
			
			
			}
			
			
		} catch (Exception e) {
			System.out.println("No ha sidop posible leer el fichero");
			e.getStackTrace();
		}
	}
	}


