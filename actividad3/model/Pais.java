package co.edu.poli.actividad3.model;

/**
 * Clase que representa un país dentro del sistema de medicamentos.
 * <p>
 * Se utiliza como parte de la información de un proveedor.
 * </p>
 * 
 * @author Nicolas
 */
public class Pais {

    /** Identificador único del país */
    private String idPais;

    /** Nombre del país */
    private String nombre;

    /**
     * Constructor que inicializa un país con su identificador y nombre.
     *
     * @param idPais identificador único del país
     * @param nombre nombre del país
     */
    public Pais(String idPais, String nombre) {
        super();
        this.idPais = idPais;
        this.nombre = nombre;
    }

    // ================== Getters & Setters ==================

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //  toString 
    @Override
    public String toString() {
        return "Pais [idPais=" + idPais + ", nombre=" + nombre + "]";
    }
}
