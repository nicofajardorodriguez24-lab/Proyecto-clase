package co.edu.poli.actividad3.model;

/**
 * Clase que representa la presentacion de un medicamento
 * Incluye informacion sobre empaque, diseno, material y fabricante
 * @author Nicolas Fajardo
 */
public class Presentacion {

    private String id;
    private String diseno;
    private int cantidad;
    private String descripcion;
    private String material;
    private String fabricante;
    private String fechaVencimiento;
    private int lote;

    /**
     * Constructor con parametros de la clase Presentacion
     * @param id identificador unico de la presentacion
     * @param diseno diseno de empaque
     * @param cantidad cantidad de unidades
     * @param descripcion descripcion de la presentacion
     * @param material material del empaque
     * @param fabricante nombre del fabricante
     * @param fechaVencimiento fecha de vencimiento
     * @param lote numero de lote
     * @author Nicolas Fajardo
     */
    public Presentacion(String id, String diseno, int cantidad, String descripcion, String material, String fabricante,
                        String fechaVencimiento, int lote) {
        this.id = id;
        this.diseno = diseno;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.material = material;
        this.fabricante = fabricante;
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
    }

    /**
     * @return identificador de la presentacion
     */
    public String getId() { return id; }

    /**
     * @param id identificador a asignar
     */
    public void setId(String id) { this.id = id; }

    /**
     * @return diseno de la presentacion
     */
    public String getDiseno() { return diseno; }

    /**
     * @param diseno diseno a asignar
     */
    public void setDiseno(String diseno) { this.diseno = diseno; }

    /**
     * @return cantidad de unidades
     */
    public int getCantidad() { return cantidad; }

    /**
     * @param cantidad cantidad a asignar
     */
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    /**
     * @return descripcion de la presentacion
     */
    public String getDescripcion() { return descripcion; }

    /**
     * @param descripcion descripcion a asignar
     */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /**
     * @return material del empaque
     */
    public String getMaterial() { return material; }

    /**
     * @param material material a asignar
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * @return fabricante de la presentacion
     */
    public String getFabricante() { return fabricante; }

    /**
     * @param fabricante fabricante a asignar
     */
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    /**
     * @return fecha de vencimiento
     */
    public String getFechaVencimiento() { return fechaVencimiento; }

    /**
     * @param fechaVencimiento fecha a asignar
     */
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    /**
     * @return numero de lote
     */
    public int getLote() { return lote; }

    /**
     * @param lote numero de lote a asignar
     */
    public void setLote(int lote) { this.lote = lote; }

    /**
     * Representacion en texto de la presentacion
     * @return cadena con los datos de la presentacion
     */
    @Override
    public String toString() {
        return "Presentacion {" +
                "id='" + id + '\'' +
                ", diseno='" + diseno + '\'' +
                ", cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                ", material='" + material + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", lote=" + lote +
                '}';
    }
}
