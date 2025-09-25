package co.edu.poli.actividad3.model;

import java.util.Arrays;

/**
 * Clase abstracta que representa un medicamento
 * @author Nicolas Fajardo
 */
public abstract class Medicamento {

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

    /**
     * Constructor vacio de la clase Medicamento
     * @author Nicolas Fajardo
     */
    public Medicamento() { }

    /**
     * Constructor con parametros de la clase Medicamento
     * @param comprador comprador asociado
     * @param tratamiento tratamiento asignado
     * @param receta receta del medicamento
     * @param proveedor proveedor del medicamento
     * @param sistema sistema al que pertenece
     * @param lote numero de lote
     * @param fechaOrigen anio de fabricacion
     * @param inventario cantidad disponible
     * @param registro registro sanitario
     * @param presentacion arreglo de presentaciones
     * @param indicacion indicaciones de uso
     * @param observacion observaciones medicas
     * @param codigoUnico identificador unico
     * @author Nicolas Fajardo
     */
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

    /**
     * @return comprador del medicamento
     * @author Nicolas Fajardo
     */
    public Comprador getComprador() { return comprador; }

    /**
     * @param comprador comprador del medicamento
     * @author Nicolas Fajardo
     */
    public void setComprador(Comprador comprador) { this.comprador = comprador; }

    /**
     * @return tratamiento asignado al medicamento
     * @author Nicolas Fajardo
     */
    public String getTratamiento() { return tratamiento; }

    /**
     * @param tratamiento tratamiento del medicamento
     * @author Nicolas Fajardo
     */
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

    /**
     * @return receta asociada al medicamento
     * @author Nicolas Fajardo
     */
    public Receta getReceta() { return receta; }

    /**
     * @param receta receta del medicamento
     * @author Nicolas Fajardo
     */
    public void setReceta(Receta receta) { this.receta = receta; }

    /**
     * @return proveedor del medicamento
     * @author Nicolas Fajardo
     */
    public Proveedor getProveedor() { return proveedor; }

    /**
     * @param proveedor proveedor del medicamento
     * @author Nicolas Fajardo
     */
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    /**
     * @return sistema asociado al medicamento
     * @author Nicolas Fajardo
     */
    public String getSistema() { return sistema; }

    /**
     * @param sistema sistema asociado
     * @author Nicolas Fajardo
     */
    public void setSistema(String sistema) { this.sistema = sistema; }

    /**
     * @return numero de lote
     * @author Nicolas Fajardo
     */
    public int getLote() { return lote; }

    /**
     * @param lote numero de lote
     * @author Nicolas Fajardo
     */
    public void setLote(int lote) { this.lote = lote; }

    /**
     * @return fecha de origen del medicamento
     * @author Nicolas Fajardo
     */
    public int getFechaOrigen() { return fechaOrigen; }

    /**
     * @param fechaOrigen anio de origen del medicamento
     * @author Nicolas Fajardo
     */
    public void setFechaOrigen(int fechaOrigen) { this.fechaOrigen = fechaOrigen; }

    /**
     * @return cantidad disponible en inventario
     * @author Nicolas Fajardo
     */
    public double getInventario() { return inventario; }

    /**
     * @param inventario cantidad en inventario
     * @author Nicolas Fajardo
     */
    public void setInventario(double inventario) { this.inventario = inventario; }

    /**
     * @return registro del medicamento
     * @author Nicolas Fajardo
     */
    public String getRegistro() { return registro; }

    /**
     * @param registro registro sanitario
     * @author Nicolas Fajardo
     */
    public void setRegistro(String registro) { this.registro = registro; }

    /**
     * @return presentacion del medicamento
     * @author Nicolas Fajardo
     */
    public Presentacion[] getPresentacion() { return presentacion; }

    /**
     * @param presentacion arreglo de presentaciones
     * @author Nicolas Fajardo
     */
    public void setPresentacion(Presentacion[] presentacion) { this.presentacion = presentacion; }

    /**
     * @return indicacion del medicamento
     * @author Nicolas Fajardo
     */
    public String getIndicacion() { return indicacion; }

    /**
     * @param indicacion indicacion de uso
     * @author Nicolas Fajardo
     */
    public void setIndicacion(String indicacion) { this.indicacion = indicacion; }

    /**
     * @return observacion asociada
     * @author Nicolas Fajardo
     */
    public Observacion[] getObservacion() { return observacion; }

    /**
     * @param observacion observacion del medicamento
     * @author Nicolas Fajardo
     */
    public void setObservacion(Observacion[] observacion) { this.observacion = observacion; }

    /**
     * @return codigo unico del medicamento
     * @author Nicolas Fajardo
     */
    public String getCodigoUnico() { return codigoUnico; }

    /**
     * @param codigoUnico identificador unico
     * @author Nicolas Fajardo
     */
    public void setCodigoUnico(String codigoUnico) { this.codigoUnico = codigoUnico; }

    /**
     * Calcula la antiguedad del medicamento
     * @return antiguedad en anios
     * @author Nicolas Fajardo
     */
    public int calcularAntiguedad() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - this.fechaOrigen;
    }

    /**
     * Calcula la dosis segun el peso del paciente
     * @param pesoPaciente peso en kilogramos
     * @return dosis recomendada en mg
     * @author Nicolas Fajardo
     */
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.1;
        return "Dosis recomendada: " + dosis + " mg";
    }

    /**
     * Genera un medicamento de ejemplo
     * @return medicamento generico de prueba
     * @author Nicolas Fajardo
     */
    public Medicamento obtenerMedicamentoEjemplo() {
        Medicamento med = new Medicamento() {
            @Override
            public String definirTipo() {
                return "Medicamento generico (ejemplo)";
            }
        };
        med.setTratamiento("Medicamento generico (ejemplo)");
        med.setFechaOrigen(2000);
        med.setCodigoUnico("M-EJEMPLO");
        return med;
    }

    /**
     * Metodo abstracto que define el tipo de medicamento
     * @return tipo de medicamento
     * @author Nicolas Fajardo
     */
    public abstract String definirTipo();

    /**
     * Representacion en texto del medicamento
     * @return cadena con los atributos del medicamento
     * @author Nicolas Fajardo
     */
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
}
