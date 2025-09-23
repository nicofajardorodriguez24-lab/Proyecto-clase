package co.edu.poli.actividad3.model;
/**
 * 
 */
public class Analgesico extends Medicamento {
    private String tipoDolor;

    public Analgesico() { super(); }

    public Analgesico(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor, String sistema,
                      int lote, int fechaOrigen, double inventario, String registro, Presentacion[] presentacion,
                      String indicacion, Observacion[] observacion, String tipoDolor) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
                presentacion, indicacion, observacion);
        this.tipoDolor = tipoDolor;
    }

    public String getTipoDolor() { return tipoDolor; }
    public void setTipoDolor(String tipoDolor) { this.tipoDolor = tipoDolor; }

    @Override
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.1;
        return "Dosis recomendada (Analgesico): " + dosis + " mg";
    }

    @Override
    public Medicamento obtenerMedicamentoEjemplo() {
        Analgesico analg = new Analgesico();
        analg.setTratamiento("Paracetamol 500mg (ejemplo Analgésico)");
        analg.setFechaOrigen(2022);
        return analg;
    }

    public int calcularFechaCaducidad(int anosVigencia) {
        return getFechaOrigen() + anosVigencia;
    }

    @Override
    public String toString() {
        return "Analgesico [tipoDolor=" + tipoDolor + "]";
    }
}
