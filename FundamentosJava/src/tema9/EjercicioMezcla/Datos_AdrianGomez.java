/**
 * @Author AdrianGomez
 * @version 1.0
 */
package tema9.EjercicioMezcla;
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
public class Datos_AdrianGomez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Connection conectar() {
		String URL ="jdbc:oracle:thin:@localhost:1521:xe";
		String USU = "JARDINERIA";
		String PASS = "oracle123";
		try (Connection conn = DriverManager.getConnection(URL,USU,PASS)) {
			System.out.println("Conexion realizada corectamente a la base de datos");
			return conn;
			
		} catch (Exception e) {
			System.out.println("No ha sido posible conectarse a la base de datos");
			e.getStackTrace();
		}
		return null;
	}
	public ArrayList<Cliente_AdrianGomez> guardarDatos(String fichero){
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))){
			ArrayList<Cliente_AdrianGomez> listaClientes = new ArrayList<Cliente_AdrianGomez>();
			String[] arrayDatos;
			String linea;
			while ((linea = br.readLine()) != null) {
				arrayDatos = linea.split(";");
				Cliente_AdrianGomez clienteInsertar = new Cliente_AdrianGomez(Integer.parseInt(arrayDatos[0]), arrayDatos[1], arrayDatos[2], arrayDatos[3], arrayDatos[4], arrayDatos[5], 
						arrayDatos[6], arrayDatos[7], arrayDatos[8], arrayDatos[9], arrayDatos[10], arrayDatos[11], Integer.parseInt(arrayDatos[12]), Integer.parseInt(arrayDatos[13]));
				listaClientes.add(clienteInsertar);
			}
			return listaClientes;
		} catch (Exception e) {
				System.out.println("No ha sido posible leer el fichero especificado");
				e.getStackTrace();
		}
		return null;
	}
	public void insertarDatos() {
		String sql = "INSERT INTO CLIENTES (CODIGOCLIENTE,NOMBRECLIENTE,NOMBRECONTACTO,APELLIDOCONTACTO,"
				+ "TELEFONO,FAX,LINEADIRECCION1,LINEADIRECCION2,CIUDAD,REGION,PAIS,CODIGOPOSTAL,CODIGOEMPLEADOREPVENTAS,LIMITECREDITO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try (Connection conn = conectar()){
			try (PreparedStatement ps = conn.prepareStatement(sql)){
				ArrayList<Cliente_AdrianGomez> clientes= guardarDatos("clientes.txt");
				for (Cliente_AdrianGomez cliente : clientes) {
					ps.setInt(1, cliente.getCodigoCliente());
					ps.setString(2, cliente.getNombreCliente());
					ps.setString(3, cliente.getNombreContacto());
					ps.setString(4, cliente.getApellidoContacto());
					ps.setString(5, cliente.getTelefono());
					ps.setString(6, cliente.getFax());
					ps.setString(7, cliente.getLineaDireccion1());
					ps.setString(8, cliente.getLineaDireccion2());
					ps.setString(9, cliente.getCiudad());
					ps.setString(10,cliente.getRegion());
					ps.setString(11, cliente.getPais());
					ps.setString(12, cliente.getCodigoPostal());
					ps.setInt(13, cliente.getCodigoEmpleadoreVentas());
					ps.setInt(14, cliente.getLimiteCredito());
					ps.executeUpdate();
				}
				System.out.println("Valores insertados correctamente");
			} catch (Exception e) {
				System.out.println("No se ha podido insertar los valores");
				e.getStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void escribirDatos() {
		Map<Integer, String> info = new HashMap<Integer, String>();
		String sql = "Select CODIGOCLIENTE,NOMBRECONTACTO FROM CLIENTES";
		try (Connection conn = conectar()){
			try (PreparedStatement ps = conn.prepareStatement(sql)){
				try (ResultSet rs = ps.executeQuery()){
					try (BufferedWriter bw = new BufferedWriter(new FileWriter("Resultado_Clientes",true))){
						while(rs.next()) {
							info.put(rs.getInt("codigocliente"), rs.getString("nombrecontacto"));
						}
						for (Map.Entry<Integer, String> entry : info.entrySet()) {
							bw.write(entry.getKey() + ":" + entry.getValue());
							bw.newLine();
						}
						System.out.println("Datos escritos correctamente en el fichero Resultado_Clientes");
					} catch (Exception e) {
						System.out.println("No se ha podido escribir en el fichero");
					}
				} catch (Exception e) {
					System.out.println("No ha sido posible ejecutar la query");
					e.getStackTrace();
				}
			} catch (Exception e) {
				System.out.println("No se ha podido recuperar los datos");
				e.getStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
