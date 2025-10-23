package Co.edu.poli.actividad1.model;

import java.io.Serializable;

/**
 * Clase que representa una receta medica
 * Contiene informacion sobre la dosis, el paciente y el metodo de aplicacion
 */
public class Receta implements Serializable {

    private static final long serialVersionUID = 1L; // control de version

    private String serial;
    private int dosis;
    private int peso;
    private String nombre;
    private String origen;
    private String metodoAplicacion;
    private int fechaOrigen;

    /**
     * Constructor con parametros de la clase Receta
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


    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }
    public int getDosis() { return dosis; }
    public void setDosis(int dosis) { this.dosis = dosis; }
    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getMetodoAplicacion() { return metodoAplicacion; }
    public void setMetodoAplicacion(String metodoAplicacion) { this.metodoAplicacion = metodoAplicacion; }
    public int getFechaOrigen() { return fechaOrigen; }
    public void setFechaOrigen(int fechaOrigen) { this.fechaOrigen = fechaOrigen; }

  
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
