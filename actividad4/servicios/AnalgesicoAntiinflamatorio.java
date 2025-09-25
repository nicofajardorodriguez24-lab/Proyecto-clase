package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad3.model.*;

/**
 * Clase que representa un analgesico con propiedades antiinflamatorias
 * Extiende la clase Analgesico y agrega informacion sobre el compuesto activo
 * @author Nicolas Fajardo
 */
public class AnalgesicoAntiinflamatorio extends Analgesico {

    private String compuestoActivo;

    /**
     * Constructor vacio de la clase AnalgesicoAntiinflamatorio
     * @author Nicolas Fajardo
     */
    public AnalgesicoAntiinflamatorio() {
        super();
    }

    /**
     * Constructor con parametros de la clase AnalgesicoAntiinflamatorio
     * @param comprador comprador del medicamento
     * @param tratamiento tratamiento asociado
     * @param receta receta medica
     * @param proveedor proveedor del medicamento
     * @param sistema sistema al que pertenece
     * @param lote identificador del lote
     * @param fechaOrigen anio de origen
     * @param inventario cantidad en inventario
     * @param registro registro sanitario
     * @param presentacion arreglo de presentaciones
     * @param indicacion indicacion del medicamento
     * @param observacion arreglo de observaciones
     * @param tipoDolor tipo de dolor a tratar
     * @param compuestoActivo compuesto activo del medicamento
     * @author Nicolas Fajardo
     */
    public AnalgesicoAntiinflamatorio(Comprador comprador, String tratamiento, Receta receta, Proveedor proveedor,
                                      String sistema, int lote, int fechaOrigen, double inventario, String registro,
                                      Presentacion[] presentacion, String indicacion, Observacion[] observacion,
                                      String tipoDolor, String compuestoActivo) {
        super(comprador, tratamiento, receta, proveedor, sistema, lote, fechaOrigen, inventario, registro,
              presentacion, indicacion, observacion, tipoDolor, null);
        this.compuestoActivo = compuestoActivo;
    }

    /**
     * @return compuesto activo del medicamento
     */
    public String getCompuestoActivo() {
        return compuestoActivo;
    }

    /**
     * @param compuestoActivo compuesto activo a asignar
     */
    public void setCompuestoActivo(String compuestoActivo) {
        this.compuestoActivo = compuestoActivo;
    }

    /**
     * Calcula la dosis recomendada de acuerdo al peso del paciente
     * @param pesoPaciente peso del paciente
     * @return mensaje con la dosis recomendada en mg
     */
    @Override
    public String calcularDosis(double pesoPaciente) {
        double dosis = pesoPaciente * 0.12;
        return "Dosis recomendada (Analgesico Antiinflamatorio): " + dosis + " mg";
    }

    /**
     * Crea un medicamento de ejemplo de tipo AnalgesicoAntiinflamatorio
     * @return instancia de AnalgesicoAntiinflamatorio como ejemplo
     */
    @Override
    public Medicamento obtenerMedicamentoEjemplo() {
        AnalgesicoAntiinflamatorio med = new AnalgesicoAntiinflamatorio();
        med.setTratamiento("Ibuprofeno (ejemplo Antiinflamatorio)");
        med.setFechaOrigen(2023);
        med.setCompuestoActivo("Ibuprofeno");
        return med;
    }

    /**
     * Define el tipo de medicamento
     * @return cadena con el tipo de medicamento
     */
    @Override
    public String definirTipo() {
        return "Analgesico Antiinflamatorio";
    }

    /**
     * Representacion en texto del medicamento
     * @return cadena con los datos principales del medicamento
     */
    @Override
    public String toString() {
        return "AnalgesicoAntiinflamatorio {" +
                "compuestoActivo='" + compuestoActivo + '\'' +
                ", tratamiento='" + getTratamiento() + '\'' +
                ", fechaOrigen=" + getFechaOrigen() +
                '}';
    }
}
