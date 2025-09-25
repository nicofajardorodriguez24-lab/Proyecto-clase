package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad3.model.Medicamento;

/**
 * Interfaz que define las operaciones CRUD basicas para el manejo de objetos de tipo Medicamento
 * CRUD significa Create, Read, Update y Delete
 * @author Nicolas Fajardo
 */
public interface OperacionesCRUD {

    /**
     * Crea un nuevo medicamento en la coleccion
     * @param medicamento medicamento a crear
     */
    void create(Medicamento medicamento);

    /**
     * Lee o consulta un medicamento a partir de su identificador unico
     * @param id identificador del medicamento
     * @return el medicamento encontrado o null si no existe
     */
    Medicamento read(String id);

    /**
     * Actualiza la informacion de un medicamento existente
     * @param id identificador del medicamento a actualizar
     * @param nuevoMedicamento objeto con la nueva informacion
     */
    void update(String id, Medicamento nuevoMedicamento);

    /**
     * Elimina un medicamento de la coleccion segun su identificador
     * @param id identificador del medicamento a eliminar
     */
    void delete(String id);

    /**
     * Lista todos los medicamentos almacenados en la coleccion
     */
    void listar();
}
