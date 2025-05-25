/**
 * @Author AdrianGomez
 * @version 1.0
 */
package ultimoEXAMEN.ejercicio4;

/**
 * 
 */
public class Empleado {
	private Integer id;
	private String nombre;
	private String departamento;
	private Integer salario;
	/**
	 * @param id
	 * @param nombre
	 * @param departamento
	 * @param salario
	 */
	public Empleado(Integer id, String nombre, String departamento, Integer salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	
}
