package Co.edu.poli.actividad1.servicios;

import Co.edu.poli.actividad1.model.*;
import java.io.Serializable;

/**
 * Clase que representa un analgesico con propiedades antiinflamatorias
 * Extiende la clase Analgesico y agrega informacion sobre el compuesto activo
 */
public class AnalgesicoAntiinflamatorio extends Analgesico implements Serializable {

    private static final long serialVersionUID = 1L;

    private String compuestoActivo;

    public AnalgesicoAntiinflamatorio() {
        super();
    }

    public AnalgesicoAntiinflamatorio(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor,
                                      String sistema, int lote, int fechaOrigen, double inventario, String registro,
                                      Presentacion[] presentacion, String indicacion, Observacion[] observacion,
                                      String tipoDolor, String compuestoActivo) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
              presentacion, indicacion, observacion, tipoDolor, null);
        this.compuestoActivo = compuestoActivo;
    }

    public String getCompuestoActivo() {
        return compuestoActivo;
    }

    public void setCompuestoActivo(String compuestoActivo) {
        this.compuestoActivo = compuestoActivo;
    }

    @Override
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.12;
        return "Dosis recomendada (Analgesico Antiinflamatorio): " + dosis + " mg";
    }

    @Override
    public Medicamento obtenerMedicamentoEjemplo() {
        AnalgesicoAntiinflamatorio med = new AnalgesicoAntiinflamatorio();
        med.setTratamiento("Ibuprofeno (ejemplo Antiinflamatorio)");
        med.setFechaOrigen(2023);
        med.setCompuestoActivo("Ibuprofeno");
        return med;
    }

    @Override
    public String definirTipo() {
        return "Analgesico Antiinflamatorio";
    }

    @Override
    public String toString() {
        return "AnalgesicoAntiinflamatorio {" +
                "compuestoActivo='" + compuestoActivo + '\'' +
                ", tratamiento='" + getTratamiento() + '\'' +
                ", fechaOrigen=" + getFechaOrigen() +
                '}';
    }
}
