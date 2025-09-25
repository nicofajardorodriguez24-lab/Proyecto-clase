package co.edu.poli.actividad3.model;

/**
 * Clase final que representa una observación asociada a un medicamento.
 * <p>
 * Una observación incluye el autor, descripción y fecha de origen,
 * con el fin de registrar notas médicas o comentarios relevantes.
 * </p>
 * 
 * 🔹 Al ser final, no puede ser heredada.
 * 
 * @author Nicolas
 */
public final class Observacion {
    
    /** Identificador único de la observación */
    private String serial;
    
    /** Persona que realiza la observación (médico, enfermero, etc.) */
    private String autor;
    
    /** Texto descriptivo de la observación */
    private String descripcion;
    
    /** Año en que se realizó la observación */
    private int fechaOrigen;

    /**
     * Constructor para inicializar una observación.
     *
     * @param serial identificador único
     * @param autor autor de la observación
     * @param descripcion detalle de la observación
     * @param fechaOrigen año en que se registró
     */
    public Observacion(String serial, String autor, String descripcion, int fechaOrigen) {
        super();
        this.serial = serial;
        this.autor = autor;
        this.descripcion = descripcion;
        this.fechaOrigen = fechaOrigen;
    }

    //  Getters & Setters 
    
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFechaOrigen() {
        return fechaOrigen;
    }

    public void setFechaOrigen(int fechaOrigen) {
        this.fechaOrigen = fechaOrigen;
    }

    // toString 
    
    @Override
    public String toString() {
        return "Observacion [serial=" + serial + 
               ", autor=" + autor + 
               ", descripcion=" + descripcion +
               ", fechaOrigen=" + fechaOrigen + "]";
    }
}
