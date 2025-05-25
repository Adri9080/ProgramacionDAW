/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.EjericioFicheros;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */
public class LeerFichero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))){
			String linea;
			while((linea = br.readLine()) != null ) {
				if (linea.toLowerCase().startsWith("a")) {
					System.out.println(linea);
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("No ha sidop posible leer el fichero");
			e.getStackTrace();
		}
	}

}
