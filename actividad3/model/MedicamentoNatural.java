package co.edu.poli.actividad3.model;

/**
 * Clase que representa un medicamento natural
 * @author Nicolas Fajardo
 */
public class MedicamentoNatural extends Medicamento {

    private String tipoPlanta;

    /**
     * Constructor vacio de la clase MedicamentoNatural
     * @author Nicolas Fajardo
     */
    public MedicamentoNatural() { super(); }

    /**
     * Constructor con parametros de la clase MedicamentoNatural
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
     * @param tipoPlanta tipo de planta del medicamento
     * @param codigoUnico identificador unico
     * @author Nicolas Fajardo
     */
    public MedicamentoNatural(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor,
                              String sistema, int lote, int fechaOrigen, double inventario, String registro,
                              Presentacion[] presentacion, String indicacion, Observacion[] observacion,
                              String tipoPlanta, String codigoUnico) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
                presentacion, indicacion, observacion, codigoUnico);
        this.tipoPlanta = tipoPlanta;
    }

    /**
     * @return tipo de planta usado en el medicamento natural
     * @author Nicolas Fajardo
     */
    public String getTipoPlanta() { return tipoPlanta; }

    /**
     * @param tipoPlanta tipo de planta a asignar al medicamento
     * @author Nicolas Fajardo
     */
    public void setTipoPlanta(String tipoPlanta) { this.tipoPlanta = tipoPlanta; }

    /**
     * Calcula la dosis de un medicamento natural segun el peso
     * @param pesoPaciente peso en kilogramos
     * @return dosis recomendada en ml
     * @author Nicolas Fajardo
     */
    @Override
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.05;
        return "Dosis recomendada (Natural): " + dosis + " ml";
    }

    /**
     * Genera un ejemplo de medicamento natural
     * @return objeto MedicamentoNatural de prueba
     * @author Nicolas Fajardo
     */
    @Override
    public Medicamento obtenerMedicamentoEjemplo() {
        MedicamentoNatural natural = new MedicamentoNatural();
        natural.setTratamiento("Te de hierbas (ejemplo Natural)");
        natural.setFechaOrigen(2021);
        natural.setTipoPlanta("Manzanilla");
        return natural;
    }

    /**
     * Define el tipo del medicamento
     * @return "Medicamento Natural" como tipo de medicamento
     * @author Nicolas Fajardo
     */
    @Override
    public String definirTipo() {
        return "Medicamento Natural";
    }

    /**
     * Representacion en texto del medicamento natural
     * @return cadena con sus atributos principales
     * @author Nicolas Fajardo
     */
    @Override
    public String toString() {
        return "MedicamentoNatural {" +
                "tipoPlanta='" + tipoPlanta + '\'' +
                ", tratamiento='" + getTratamiento() + '\'' +
                ", fechaOrigen=" + getFechaOrigen() +
                '}';
    }
}
