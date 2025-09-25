package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad3.model.Medicamento;
import java.util.Arrays;

/**
 * Implementacion de la interfaz OperacionesCRUD para gestionar objetos de tipo Medicamento
 * mediante operaciones de crear, leer, actualizar, eliminar y listar
 * Los medicamentos se almacenan en un arreglo dinamico
 * @author Nicolas Fajardo
 */
public class ImplOperacionesCRUD implements OperacionesCRUD {

    private static Medicamento[] medicamentos = new Medicamento[5];

    /**
     * Inserta un nuevo medicamento en el arreglo, expandiendolo si es necesario
     * @param medicamento medicamento a insertar
     */
    @Override
    public void create(Medicamento medicamento) {
        boolean insertado = false;
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] == null) {
                medicamentos[i] = medicamento;
                insertado = true;
                break;
            }
        }
        if (!insertado) {
            medicamentos = Arrays.copyOf(medicamentos, medicamentos.length + 5);
            medicamentos[medicamentos.length - 5] = medicamento;
        }
        System.out.println("Medicamento agregado con ID " + medicamento.getCodigoUnico());
    }

    /**
     * Busca un medicamento por su identificador unico
     * @param id identificador del medicamento
     * @return medicamento encontrado o null si no existe
     */
    @Override
    public Medicamento read(String id) {
        for (Medicamento m : medicamentos) {
            if (m != null && m.getCodigoUnico().equals(id)) {
                return m;
            }
        }
        System.out.println("Medicamento no encontrado con ID: " + id);
        return null;
    }

    /**
     * Actualiza un medicamento existente reemplazandolo por uno nuevo
     * @param id identificador del medicamento a actualizar
     * @param nuevoMedicamento nueva informacion del medicamento
     */
    @Override
    public void update(String id, Medicamento nuevoMedicamento) {
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] != null && medicamentos[i].getCodigoUnico().equals(id)) {
                medicamentos[i] = nuevoMedicamento;
                System.out.println("Medicamento actualizado con ID: " + id);
                return;
            }
        }
        System.out.println("No se pudo actualizar. Medicamento no encontrado con ID: " + id);
    }

    /**
     * Elimina un medicamento del arreglo segun su identificador unico
     * @param id identificador del medicamento a eliminar
     */
    @Override
    public void delete(String id) {
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] != null && medicamentos[i].getCodigoUnico().equals(id)) {
                medicamentos[i] = null;
                System.out.println("Medicamento eliminado con ID: " + id);
                return;
            }
        }
        System.out.println("No se pudo eliminar. Medicamento no encontrado con ID: " + id);
    }

    /**
     * Lista todos los medicamentos almacenados
     * Si no hay medicamentos, muestra un mensaje de arreglo vacio
     */
    @Override
    public void listar() {
        System.out.println("\nListado de medicamentos:");
        boolean vacio = true;
        for (Medicamento m : medicamentos) {
            if (m != null) {
                System.out.println(m);
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println("No hay medicamentos registrados.");
        }
    }
}
