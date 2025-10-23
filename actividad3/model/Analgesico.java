package Co.edu.poli.actividad1.model;

/**
 * Clase que representa un medicamento analgesico
 * @author Nicolas Fajardo
 */
public class Analgesico extends Medicamento {

    private String tipoDolor;

    /**
     * Constructor vacio de la clase Analgesico
     * @author Nicolas Fajardo
     */
    public Analgesico() { super(); }

    /**
     * Constructor con parametros de la clase Analgesico
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
     * @param tipoDolor tipo de dolor que trata
     * @param codigoUnico identificador unico
     * @author Nicolas Fajardo
     */
    public Analgesico(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor, String sistema,
                      int lote, int fechaOrigen, double inventario, String registro, Presentacion[] presentacion,
                      String indicacion, Observacion[] observacion, String tipoDolor, String codigoUnico) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
                presentacion, indicacion, observacion, codigoUnico);
        this.tipoDolor = tipoDolor;
    }

    /**
     * @return tipo de dolor tratado por el analgesico
     * @author Nicolas Fajardo
     */
    public String getTipoDolor() { return tipoDolor; }

    /**
     * @param tipoDolor tipo de dolor a tratar
     * @author Nicolas Fajardo
     */
    public void setTipoDolor(String tipoDolor) { this.tipoDolor = tipoDolor; }

    /**
     * Calcula la dosis de un analgesico segun el peso
     * @param pesoPaciente peso en kilogramos
     * @return dosis recomendada en mg
     * @author Nicolas Fajardo
     */
    @Override
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.1;
        return "Dosis recomendada (Analgesico): " + dosis + " mg";
    }

    /**
     * Genera un ejemplo de medicamento analgesico
     * @return objeto Analgesico de prueba
     * @author Nicolas Fajardo
     */
    @Override
    public Medicamento obtenerMedicamentoEjemplo() {
        Analgesico analg = new Analgesico();
        analg.setTratamiento("Paracetamol 500mg (ejemplo Analgesico)");
        analg.setFechaOrigen(2022);
        analg.setTipoDolor("Dolor general");
        return analg;
    }

    /**
     * Calcula la fecha de caducidad del medicamento
     * @param anosVigencia numero de anios de vigencia
     * @return anio de caducidad del medicamento
     * @author Nicolas Fajardo
     */
    public int calcularFechaCaducidad(int anosVigencia) {
        return getFechaOrigen() + anosVigencia;
    }

    /**
     * Define el tipo del medicamento
     * @return "Analgesico" como tipo de medicamento
     * @author Nicolas Fajardo
     */
    @Override
    public String definirTipo() {
        return "Analgesico";
    }

    /**
     * Representacion en texto del medicamento analgesico
     * @return cadena con sus atributos principales
     * @author Nicolas Fajardo
     */
    @Override
    public String toString() {
        return "Analgesico {" +
                "tipoDolor='" + tipoDolor + '\'' +
                ", tratamiento='" + getTratamiento() + '\'' +
                ", fechaOrigen=" + getFechaOrigen() +
                '}';
    }
}
