package co.edu.poli.actividad3.model;

public class MedicamentoNatural extends Medicamento {
    private String tipoPlanta;

    public MedicamentoNatural() { super(); }

    public MedicamentoNatural(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor,
                              String sistema, int lote, int fechaOrigen, double inventario, String registro,
                              Presentacion[] presentacion, String indicacion, Observacion[] observacion,
                              String tipoPlanta) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
                presentacion, indicacion, observacion);
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
        natural.setTratamiento("Té de hierbas (ejemplo Natural)");
        natural.setFechaOrigen(2021);
        return natural;
    }

    @Override
    public String toString() {
        return "MedicamentoNatural [tipoPlanta=" + tipoPlanta + "]";
    }
}
