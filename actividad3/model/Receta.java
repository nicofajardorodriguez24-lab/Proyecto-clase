package co.edu.poli.actividad3.model;

/**
 * Clase que representa una receta medica
 * Contiene informacion sobre la dosis, el paciente y el metodo de aplicacion
 * @author Nicolas Fajardo
 */
public class Receta {

    private String serial;
    private int dosis;
    private int peso;
    private String nombre;
    private String origen;
    private String metodoAplicacion;
    private int fechaOrigen;

    /**
     * Constructor con parametros de la clase Receta
     * @param serial identificador de la receta
     * @param dosis dosis indicada en la receta
     * @param peso peso del paciente
     * @param nombre nombre del paciente
     * @param origen origen de la receta
     * @param metodoAplicacion metodo de aplicacion del medicamento
     * @param fechaOrigen anio de origen de la receta
     * @author Nicolas Fajardo
     */
    public Receta(String serial, int dosis, int peso, String nombre, String origen, String metodoAplicacion, int fechaOrigen) {
        this.serial = serial;
        this.dosis = dosis;
        this.peso = peso;
        this.nombre = nombre;
        this.origen = origen;
        this.metodoAplicacion = metodoAplicacion;
        this.fechaOrigen = fechaOrigen;
    }

    /**
     * @return serial de la receta
     */
    public String getSerial() { return serial; }

    /**
     * @param serial serial a asignar
     */
    public void setSerial(String serial) { this.serial = serial; }

    /**
     * @return dosis indicada
     */
    public int getDosis() { return dosis; }

    /**
     * @param dosis dosis a asignar
     */
    public void setDosis(int dosis) { this.dosis = dosis; }

    /**
     * @return peso del paciente
     */
    public int getPeso() { return peso; }

    /**
     * @param peso peso a asignar
     */
    public void setPeso(int peso) { this.peso = peso; }

    /**
     * @return nombre del paciente
     */
    public String getNombre() { return nombre; }

    /**
     * @param nombre nombre a asignar
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * @return origen de la receta
     */
    public String getOrigen() { return origen; }

    /**
     * @param origen origen a asignar
     */
    public void setOrigen(String origen) { this.origen = origen; }

    /**
     * @return metodo de aplicacion del medicamento
     */
    public String getMetodoAplicacion() { return metodoAplicacion; }

    /**
     * @param metodoAplicacion metodo de aplicacion a asignar
     */
    public void setMetodoAplicacion(String metodoAplicacion) { this.metodoAplicacion = metodoAplicacion; }

    /**
     * @return anio de origen de la receta
     */
    public int getFechaOrigen() { return fechaOrigen; }

    /**
     * @param fechaOrigen anio de origen a asignar
     */
    public void setFechaOrigen(int fechaOrigen) { this.fechaOrigen = fechaOrigen; }

    /**
     * Representacion en texto de la receta
     * @return cadena con los datos de la receta
     */
    @Override
    public String toString() {
        return "Receta {" +
                "serial='" + serial + '\'' +
                ", dosis=" + dosis +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", metodoAplicacion='" + metodoAplicacion + '\'' +
                ", fechaOrigen=" + fechaOrigen +
                '}';
    }
}
