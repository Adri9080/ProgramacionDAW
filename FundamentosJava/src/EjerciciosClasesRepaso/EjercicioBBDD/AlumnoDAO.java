package EjerciciosClasesRepaso.EjercicioBBDD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * EJERCICIO SIN ACABAR
 * 
 * **/
public class AlumnoDAO {

	public Connection conectar() {
		try  {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "examen","examen123");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No ha sido posible conectar a la base de datos");
			e.printStackTrace();
		}
		return null;
	}
	public void insertarAlumno(int id,String nombre, int edad) {
		String sql = "INSERT INTO ALUMNOS(ID,NOMBRE,EDAD) VALUES (?, ?, ?)";
		try (Connection conn = conectar()){
			try (PreparedStatement ps = conn.prepareStatement(sql)){
				ps.setInt(1, edad);
				ps.setString(2, nombre);
				ps.setInt(3, edad);
				ps.executeUpdate();
			} catch (Exception e) {
				System.out.println("No ha sido posible insertar los datos");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	public ArrayList<Alumno> listarAlumnos(){
		String sql = "SELECT * FROM ALUMNOS";
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		try (Connection conn = conectar()){
			try (PreparedStatement ps = conn.prepareStatement(sql)){
				try (ResultSet rs = ps.executeQuery()){
					while (rs.next()) {
						int id = rs.getInt("id");
						String nombre = rs.getString("nombre");
						int edad = rs.getInt("edad");
						Alumno alumno = new Alumno(id, nombre, edad);
						listaAlumnos.add(alumno);
					}
					return listaAlumnos;
				} catch (Exception e) {
					System.out.println("No se ha podido hacer el select");
					return null;
				}
			} catch (Exception e) {
				e.getStackTrace();
				return null;
			}
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
	}
	public ArrayList<Alumno> listarAlumnosMayores(int edadMinima){}
}
