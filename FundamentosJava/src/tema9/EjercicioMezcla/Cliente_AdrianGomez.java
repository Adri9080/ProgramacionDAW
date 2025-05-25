package tema9.EjercicioMezcla;

public class Cliente_AdrianGomez {
	private Integer codigoCliente,codigoEmpleadoreVentas,limiteCredito;
	private String nombreCliente,nombreContacto,apellidoContacto,telefono,fax,
	lineaDireccion1,lineaDireccion2,ciudad,region,pais,codigoPostal;
	/**
	 * @param codigoCliente
	 * @param codigoEmpleadoreVentas
	 * @param limiteCredito
	 * @param nombreCliente
	 * @param nombreContacto
	 * @param apellidoContacto
	 * @param telefono
	 * @param fax
	 * @param lineaDireccion1
	 * @param lineaDireccion2
	 * @param ciudad
	 * @param region
	 * @param pais
	 * @param codigoPostal
	 */
	public Cliente_AdrianGomez(Integer codigoCliente,  String nombreCliente, String nombreContacto, String apellidoContacto, String telefono, String fax, String lineaDireccion1,
			String lineaDireccion2, String ciudad, String region, String pais, String codigoPostal, Integer codigoEmpleadoreVentas, Integer limiteCredito) {
		super();
		this.codigoCliente = codigoCliente;
		this.codigoEmpleadoreVentas = codigoEmpleadoreVentas;
		this.limiteCredito = limiteCredito;
		this.nombreCliente = nombreCliente;
		this.nombreContacto = nombreContacto;
		this.apellidoContacto = apellidoContacto;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion1 = lineaDireccion1;
		this.lineaDireccion2 = lineaDireccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
	}
	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public Integer getCodigoEmpleadoreVentas() {
		return codigoEmpleadoreVentas;
	}
	public void setCodigoEmpleadoreVentas(Integer codigoEmpleadoreVentas) {
		this.codigoEmpleadoreVentas = codigoEmpleadoreVentas;
	}
	public Integer getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(Integer limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getApellidoContacto() {
		return apellidoContacto;
	}
	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getLineaDireccion1() {
		return lineaDireccion1;
	}
	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}
	public String getLineaDireccion2() {
		return lineaDireccion2;
	}
	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
}
