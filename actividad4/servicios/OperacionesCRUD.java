package Co.edu.poli.actividad1.servicios;

import Co.edu.poli.actividad1.model.Medicamento;

/**
 * Interfaz que define las operaciones CRUD básicas para el manejo de objetos de tipo Medicamento.
 * Además incluye métodos para serializar y deserializar la colección de medicamentos.
 * 
 */
public interface OperacionesCRUD {

    /** Crea un nuevo medicamento en la colección */
    boolean create(Medicamento medicamento);

    /** Lee o consulta un medicamento a partir de su identificador único */
    Medicamento read(String id);

    /** Actualiza la información de un medicamento existente */
    boolean update(String id, Medicamento nuevoMedicamento);

    /** Elimina un medicamento de la colección según su identificador */
    boolean delete(String id);

    /** Devuelve un arreglo con todos los medicamentos almacenados */
    Medicamento[] listar();

    /** Serializa los medicamentos a un archivo */
    boolean serializar();

    /** Deserializa los medicamentos desde un archivo */
    boolean deserializar();

    /** Devuelve un arreglo con todos los medicamentos (igual que listar, se puede unificar) */
    Medicamento[] readAll();
}
