/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 */
public class Datos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Connection conectar() {
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String USU = "JARDINERIA";
		String PASS = "oracle123";
		 

		try (Connection conn = DriverManager.getConnection(URL,USU,PASS)){
			return conn;
			
			
		} catch (Exception e) {
			System.out.println("No ha sido posible conectar a la base de datos");
			e.getStackTrace();
		}
		
		return null;
	}
	public ArrayList<Empleado> cogerDatos(){
		
		ArrayList<Empleado> datosEmpleados = new ArrayList<Empleado>();
		try (Connection conn = conectar()){
			try (BufferedReader br = new BufferedReader(new FileReader("empleados.txt"))){
				String linea;
				while ((linea = br.readLine()) != null) {
					String dato[] = linea.split(";");
					Empleado empleado = new Empleado(Integer.parseInt(dato[0]), dato[1], dato[2], Integer.parseInt(dato[3]));
					datosEmpleados.add(empleado);
				}
				return datosEmpleados;
				
				
			} catch (Exception e) {
				System.out.println("No ha sido posible leer el archivo");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public void insertarDatos(ArrayList<Empleado> datos) {
		String sql = "INSERT INTO EMPLEADOS(ID,NOMBRE,DEPARTAMENTO,SALARIO) VALUES (?,?,?,?)";
		try (Connection conn = conectar()){
			try (PreparedStatement ps = conn.prepareStatement(sql)){
				for (Empleado empleado : datos) {
					ps.setInt(1, empleado.getId());
					ps.setString(2, empleado.getNombre());
					ps.setString(3, empleado.getDepartamento());
					ps.setInt(4, empleado.getSalario());
					ps.executeUpdate();
				}
				System.out.println("Se han insertado los datos correctamente");
			} catch (Exception e) {
				System.out.println("No se han podido insertar los datos");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public void leerDatos() {
		HashMap<Integer, String> datos = new HashMap<Integer, String>();
		String sql = "SELECT ID,NOMBRE FROM EMPLEADOS WHERE SALARIO > 30000";
		try (Connection conn = conectar()){
			try (PreparedStatement ps = conn.prepareStatement(sql)){
				try (ResultSet rs = ps.executeQuery()){
					while (rs.next()) {
						datos.put(rs.getInt("ID"), rs.getString("NOMBRE"));
					}
					try (BufferedWriter bw = new BufferedWriter(new FileWriter("Resultado_empleados.txt",true))){
						for (Map.Entry<Integer, String> entry : datos.entrySet()) {
							bw.write(entry.getKey() + " : " + entry.getValue());
							bw.newLine();
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				} catch (Exception e) {
					System.out.println("No ha sido posible ejecutar la query");
				}
			} catch (Exception e) {
				System.out.println("No ha sido posible ejecutar la query");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
