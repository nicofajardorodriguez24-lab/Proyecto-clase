package Co.edu.poli.actividad1.model;

import java.io.Serializable;

/**
 * Clase que representa la presentacion de un medicamento
 * Incluye informacion sobre empaque, diseno, material y fabricante
 * @author Nicolas Fajardo
 */
public class Presentacion implements Serializable {

    private static final long serialVersionUID = 1L; // control de version

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

   

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getDiseno() { return diseno; }
    public void setDiseno(String diseno) { this.diseno = diseno; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public int getLote() { return lote; }
    public void setLote(int lote) { this.lote = lote; }

   
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
