package co.edu.poli.actividad3.model;

/**
 * Clase que representa a un comprador de medicamentos.
 * Contiene información personal, de contacto y la receta asociada.
 * 
 * Esta clase se usa en la relación con Medicamento, simulando
 * la asociación entre paciente y los medicamentos adquiridos.
 * 
 * @author Nicolas
 */
public class Comprador {

    /** Identificador único del cliente */
    private String idCliente;

    /** Tipo de necesidad médica (ej: crónica, temporal, preventiva) */
    private String tipoNecesidad;

    /** Nombre completo del comprador */
    private String nombre;

    /** Edad del comprador */
    private int edad;

    /** Correo electrónico */
    private String email;

    /** Dirección de residencia */
    private String direccion;

    /** Número de teléfono */
    private String telefono;

    /** Receta médica asociada al comprador */
    private Receta receta;

    /**
     * Constructor para inicializar un comprador.
     * 
     * @param idCliente identificador único
     * @param tipoNecesidad tipo de necesidad médica
     * @param nombre nombre completo
     * @param edad edad del comprador
     * @param email correo electrónico
     * @param direccion dirección de residencia
     * @param telefono número de contacto
     * @param receta receta asociada
     */
    public Comprador(String idCliente, String tipoNecesidad, String nombre, int edad,
                     String email, String direccion, String telefono, Receta receta) {
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

    // 	 Getters & Setters 

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

    //  toString 

    @Override
    public String toString() {
        return "Comprador {" +
                "idCliente='" + idCliente + '\'' +
                ", tipoNecesidad='" + tipoNecesidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", receta=" + (receta != null ? receta.toString() : "Ninguna") +
                '}';
    }
}
