package co.edu.poli.actividad3.model;

// 🔹 Clase final: no se puede heredar
public final class Observacion {
    private String serial;
    private String autor;
    private String descripcion;
    private int fechaOrigen;

    // Constructor
    public Observacion(String serial, String autor, String descripcion, int fechaOrigen) {
        super();
        this.serial = serial;
        this.autor = autor;
        this.descripcion = descripcion;
        this.fechaOrigen = fechaOrigen;
    }

    // Getters y Setters
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

    @Override
    public String toString() {
        return "Observacion [serial=" + serial + ", autor=" + autor + ", descripcion=" + descripcion
                + ", fechaOrigen=" + fechaOrigen + "]";
    }
}
