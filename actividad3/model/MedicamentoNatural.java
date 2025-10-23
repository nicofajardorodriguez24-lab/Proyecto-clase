package Co.edu.poli.actividad1.model;

/**
 * Clase que representa un medicamento natural
 * @author Nicolas Fajardo
 */
public class MedicamentoNatural extends Medicamento {

    private static final long serialVersionUID = 1L; // Opcional: control de versión

    private String tipoPlanta;

    /**
     * Constructor vacio de la clase MedicamentoNatural
     */
    public MedicamentoNatural() { super(); }

    /**
     * Constructor con parametros de la clase MedicamentoNatural
     */
    public MedicamentoNatural(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor,
                              String sistema, int lote, int fechaOrigen, double inventario, String registro,
                              Presentacion[] presentacion, String indicacion, Observacion[] observacion,
                              String tipoPlanta, String codigoUnico) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
                presentacion, indicacion, observacion, codigoUnico);
        this.tipoPlanta = tipoPlanta;
    }

    public String getTipoPlanta() { return tipoPlanta; }
    public void setTipoPlanta(String tipoPlanta) { this.tipoPlanta = tipoPlanta; }

    @Override
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.05;
        return "Dosis recomendada (Natural): " + dosis + " ml";
    }

    @Override
    public Medicamento obtenerMedicamentoEjemplo() {
        MedicamentoNatural natural = new MedicamentoNatural();
        natural.setTratamiento("Te de hierbas (ejemplo Natural)");
        natural.setFechaOrigen(2021);
        natural.setTipoPlanta("Manzanilla");
        return natural;
    }

    @Override
    public String definirTipo() {
        return "Medicamento Natural";
    }
}
