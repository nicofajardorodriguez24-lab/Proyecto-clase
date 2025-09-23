package co.edu.poli.actividad3.model;

public class Comprador {

	private String idCliente;
    private String tipoNecesidad;
    private String nombre;
    private int edad;
    private String email;
    private String direccion;
    private String telefono;
    private Receta receta;
	
    
    
    public Comprador(String idCliente, String tipoNecesidad, String nombre, int edad, String email, String direccion,
			String telefono, Receta receta) {
		super();
		this.idCliente = idCliente;
		this.tipoNecesidad = tipoNecesidad;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.receta = receta;
	}



	public String getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}



	public String getTipoNecesidad() {
		return tipoNecesidad;
	}



	public void setTipoNecesidad(String tipoNecesidad) {
		this.tipoNecesidad = tipoNecesidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Receta getReceta() {
		return receta;
	}



	public void setReceta(Receta receta) {
		this.receta = receta;
	}



	@Override
	public String toString() {
		return "Comprador [idCliente=" + idCliente + ", tipoNecesidad=" + tipoNecesidad + ", nombre=" + nombre
				+ ", edad=" + edad + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", receta=" + receta + "]";
	}
	







}
