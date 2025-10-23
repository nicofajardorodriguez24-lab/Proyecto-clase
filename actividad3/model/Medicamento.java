package Co.edu.poli.actividad1.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Clase abstracta que representa un medicamento
 * Autor: Nicolas Fajardo
 */
public abstract class Medicamento implements Serializable {

    private static final long serialVersionUID = 1L; 

    private Comprador comprador;
    private String tratamiento;
    private Receta receta;
    private Proveedor proveedor;
    private String sistema;
    private int lote;
    private int fechaOrigen;
    private double inventario;
    private String registro;
    private Presentacion[] presentacion;
    private String indicacion;
    private Observacion[] observacion;
    private String codigoUnico;

    public Medicamento() { }

    public Medicamento(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor, String sistema,
                       int lote, int fechaOrigen, double inventario, String registro, Presentacion[] presentacion,
                       String indicacion, Observacion[] observacion, String codigoUnico) {
        this.comprador = comprador;
        this.tratamiento = tratamiento;
        this.receta = receta;
        this.proveedor = proveedor;
        this.sistema = sistema;
        this.lote = lote;
        this.fechaOrigen = fechaOrigen;
        this.inventario = inventario;
        this.registro = registro;
        this.presentacion = presentacion;
        this.indicacion = indicacion;
        this.observacion = observacion;
        this.codigoUnico = codigoUnico;
    }

  
    public Comprador getComprador() { return comprador; }
    public void setComprador(Comprador comprador) { this.comprador = comprador; }
    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }
    public Receta getReceta() { return receta; }
    public void setReceta(Receta receta) { this.receta = receta; }
    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }
    public String getSistema() { return sistema; }
    public void setSistema(String sistema) { this.sistema = sistema; }
    public int getLote() { return lote; }
    public void setLote(int lote) { this.lote = lote; }
    public int getFechaOrigen() { return fechaOrigen; }
    public void setFechaOrigen(int fechaOrigen) { this.fechaOrigen = fechaOrigen; }
    public double getInventario() { return inventario; }
    public void setInventario(double inventario) { this.inventario = inventario; }
    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }
    public Presentacion[] getPresentacion() { return presentacion; }
    public void setPresentacion(Presentacion[] presentacion) { this.presentacion = presentacion; }
    public String getIndicacion() { return indicacion; }
    public void setIndicacion(String indicacion) { this.indicacion = indicacion; }
    public Observacion[] getObservacion() { return observacion; }
    public void setObservacion(Observacion[] observacion) { this.observacion = observacion; }
    public String getCodigoUnico() { return codigoUnico; }
    public void setCodigoUnico(String codigoUnico) { this.codigoUnico = codigoUnico; }

    // --- Métodos funcionales ---
    public int calcularAntiguedad() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - this.fechaOrigen;
    }

    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.1;
        return "Dosis recomendada: " + dosis + " mg";
    }

    public abstract String definirTipo();

    @Override
    public String toString() {
        return "Medicamento {" +
                "\n  CodigoUnico='" + codigoUnico + '\'' +
                "\n  Comprador=" + comprador +
                "\n  Tratamiento='" + tratamiento + '\'' +
                "\n  Receta=" + receta +
                "\n  Proveedor=" + proveedor +
                "\n  Sistema='" + sistema + '\'' +
                "\n  Lote=" + lote +
                "\n  FechaOrigen=" + fechaOrigen +
                "\n  Inventario=" + inventario +
                "\n  Registro='" + registro + '\'' +
                "\n  Presentacion=" + Arrays.toString(presentacion) +
                "\n  Indicacion='" + indicacion + '\'' +
                "\n  Observacion=" + Arrays.toString(observacion) +
                "\n}";
    }

	public Object getIdMedicamento() {
		
		return null;
	}
}
	
