package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.model.*;
import co.edu.poli.actividad4.servicios.*;   // CRUD

/**
 * Clase Cliente que sirve como punto de entrada para la aplicación de gestión de medicamentos.
 * Esta clase realiza lo siguiente:
 * <ul>
 *     <li>Creación de objetos base como Comprador, Proveedor, Receta y Presentación.</li>
 *     <li>Demostración de herencia y polimorfismo con Medicamento, Analgésico y MedicamentoNatural.</li>
 *     <li>Cálculo de dosis y antigüedad de los medicamentos.</li>
 *     <li>Pruebas de operaciones CRUD utilizando la interfaz OperacionesCRUD.</li>
 * </ul>
 * 
 * @author Nicolas Fajardo
 */
public class Cliente {

    /**
     * Método principal que ejecuta la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // ================== CREACIÓN DE OBJETOS BASE ==================
        Comprador comprador = new Comprador("C001", "Necesidad médica", "Ana Gómez", 35,
                "ana@email.com", "Bogotá", "3001234567", null);

        Pais pais = new Pais("PA001", "Colombia");
        Proveedor proveedor = new Proveedor("900123", "Nacional", "Medicamentos", "ISO9001", pais);

        Receta receta = new Receta("R001", 3, 70, "Paracetamol", "Natural", "Oral", 2023);

        Presentacion[] presentaciones = {
                new Presentacion("PR001", "Caja", 20, "Tabletas recubiertas", "Blíster",
                        "LabPharma", "2025-06-10", 101),
                new Presentacion("PR002", "Frasco", 1, "Extracto líquido 100ml", "Vidrio",
                        "MedNatural", "2026-01-01", 102)
        };

        Observacion[] observaciones = {
                new Observacion("O001", "Dr. Juan Pérez", "Mantener en lugar fresco", 2024),
                new Observacion("O002", "Enfermera Ruiz", "No administrar con alcohol", 2024)
        };

        // 🔹 Creación del medicamento principal
        Medicamento medicamento = new Analgesico(
                comprador, "Analgésico y antipirético", receta, proveedor, "Nervioso Central",
                202310, 2022, 150.5, "INVIMA-2023-001", presentaciones,
                "Indicado para dolor y fiebre", observaciones, "Dolor general", "M001"
        );

        System.out.println("=== Información del medicamento principal ===");
        System.out.println(medicamento);
        System.out.println("Antigüedad del medicamento: " + medicamento.calcularAntiguedad() + " años");
        System.out.println("Cálculo de dosis: " + medicamento.calcularDosis(70));

        // ================== POLIMORFISMO ==================
        MedicamentoNatural natural1 = new MedicamentoNatural(
                null, "Infusión de manzanilla", null, null,
                null, 0, 2021, 0, null, null,
                null, null, "Manzanilla", "M002"
        );

        MedicamentoNatural natural2 = new MedicamentoNatural(
                null, "Extracto de valeriana", null, null,
                null, 0, 2020, 0, null, null,
                null, null, "Valeriana", "M003"
        );

        Analgesico analgesico = new Analgesico(
                null, "Ibuprofeno 400mg", null, null,
                null, 0, 2022, 0, null, null,
                null, null, "Dolor muscular", "M004"
        );

        System.out.println("\n=== Ejemplo de polimorfismo ===");
        System.out.println("Dosis natural1: " + natural1.calcularDosis(70));
        System.out.println("Dosis analgesico: " + analgesico.calcularDosis(70));

        // ================== ARREGLO DE POLIMORFISMO ==================
        Medicamento[] medicamentos = new Medicamento[5];
        medicamentos[0] = natural1;
        medicamentos[1] = natural2;
        medicamentos[2] = analgesico;

        System.out.println("\n=== Cálculo de dosis por polimorfismo en arreglo ===");
        for (Medicamento med : medicamentos) {
            if (med != null) {
                System.out.println(med.getTratamiento() + " -> " + med.calcularDosis(70));
            } else {
                System.out.println("Vacío");
            }
        }

        // ================== CRUD ==================
        System.out.println("\n=== Pruebas CRUD ===");
        OperacionesCRUD crud = new ImplOperacionesCRUD();

        crud.create(medicamento);
        crud.create(natural1);
        crud.create(natural2);
        crud.create(analgesico);

        crud.listar();

        System.out.println("\nLeyendo medicamento con ID M002:");
        System.out.println(crud.read("M002"));

        System.out.println("\nActualizando medicamento con ID M003:");
        Medicamento actualizado = new MedicamentoNatural(
                null, "Valeriana 500mg cápsulas", null, null,
                null, 0, 2020, 0, null, null,
                null, null, "Valeriana", "M003"
        );
        crud.update("M003", actualizado);

        crud.listar();

        System.out.println("\nEliminando medicamento con ID M001:");
        crud.delete("M001");

        crud.listar();
    }
}
