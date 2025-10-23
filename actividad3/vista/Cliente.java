package Co.edu.poli.actividad1.vista;

import Co.edu.poli.actividad1.model.*;
import Co.edu.poli.actividad1.servicios.*;

import java.util.Scanner;

public class Cliente {

    private static final Scanner sc = new Scanner(System.in);
    private static final ImplOperacionesCRUD crud = new ImplOperacionesCRUD();

    public static void main(String[] args) {

        cargarMedicamentosDesdeArchivo();

        int opcion;

        do {
            mostrarMenu();

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> crearMedicamento();
                    case 2 -> leerMedicamento();
                    case 3 -> actualizarMedicamento();
                    case 4 -> eliminarMedicamento();
                    case 5 -> listarMedicamentos();
                    case 6 -> guardarMedicamentosEnArchivo();
                    case 7 -> cargarMedicamentosDesdeArchivo();
                    case 0 -> {
                        guardarMedicamentosEnArchivo();
                        System.out.println("Saliendo del programa...");
                        return;
                    }
                    default -> System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número.");
            }

        } while (true);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú CRUD de Medicamentos ---");
        System.out.println("1. Crear medicamento (guardar en memoria)");
        System.out.println("2. Leer medicamento por ID");
        System.out.println("3. Actualizar medicamento");
        System.out.println("4. Eliminar medicamento");
        System.out.println("5. Listar medicamentos");
        System.out.println("6. Guardar medicamentos en archivo (.dat)");
        System.out.println("7. Cargar medicamentos desde archivo (.dat)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearMedicamento() {
        try {
            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Tratamiento: ");
            String tratamiento = sc.nextLine();

            System.out.print("Inventario: ");
            double inventario = Double.parseDouble(sc.nextLine());

            System.out.print("Tipo (1=Natural, 2=Analgésico): ");
            int tipo = Integer.parseInt(sc.nextLine());

            Receta receta = new Receta("R01", 1, 1, "MedicamentoX", "Desconocido", "Oral", 2023);
            Comprador comprador = new Comprador("C001", "Necesidad genérica", "Nombre genérico", 30,
                    "email@correo.com", "Ciudad", "0000000000", receta);
            Pais pais = new Pais("P001", "País genérico");
            Proveedor proveedor = new Proveedor("0001", "Origen genérico", "Producto genérico", "CertificadoX", pais);
            Presentacion[] presentaciones = {};
            Observacion[] observaciones = {};

            Medicamento nuevo;

            if (tipo == 1) {
                nuevo = new MedicamentoNatural(comprador, tratamiento, receta, proveedor, "General",
                        1000, 2020, inventario, "REG-001", presentaciones,
                        "Genérico natural", observaciones, "Planta genérica", id);
            } else if (tipo == 2) {
                nuevo = new Analgesico(comprador, tratamiento, receta, proveedor, "General",
                        1001, 2020, inventario, "REG-002", presentaciones,
                        "Genérico analgésico", observaciones, "Dolor genérico", id);
            } else {
                System.out.println("Tipo inválido. Solo 1 o 2.");
                return;
            }

            crud.create(nuevo);
            System.out.println("\nMedicamento creado correctamente con los siguientes datos:");
            imprimirResumenMedicamentoCreado(nuevo);

        } catch (NumberFormatException e) {
            System.out.println("Error en formato numérico. Intenta nuevamente.");
        }
    }

    private static void leerMedicamento() {
        System.out.print("ID a buscar: ");
        String id = sc.nextLine();
        Medicamento m = crud.read(id);
        if (m != null) {
            imprimirResumenMedicamentoCreado(m);
        } else {
            System.out.println("No se encontró ningún medicamento con ese ID.");
        }
    }

    private static void actualizarMedicamento() {
        System.out.print("ID del medicamento a actualizar: ");
        String id = sc.nextLine();

        Medicamento existente = crud.read(id);
        if (existente == null) {
            System.out.println("Medicamento no encontrado.");
            return;
        }

        try {
            System.out.print("Nuevo inventario: ");
            double nuevoInventario = Double.parseDouble(sc.nextLine());

            existente.setInventario(nuevoInventario);
            crud.update(id, existente);

            System.out.println("Medicamento actualizado correctamente:");
            imprimirResumenMedicamentoCreado(existente);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes ingresar un número.");
        }
    }

    private static void eliminarMedicamento() {
        System.out.print("ID a eliminar: ");
        String id = sc.nextLine();
        crud.delete(id);
        System.out.println("Medicamento eliminado si existía.");
    }

    private static void listarMedicamentos() {
        Medicamento[] lista = crud.readAll();
        if (lista == null || lista.length == 0) {
            System.out.println("No hay medicamentos registrados.");
        } else {
            for (Medicamento m : lista) {
                if (m != null) {
                    System.out.println("--- Medicamento ---");
                    imprimirMedicamentoListado(m);
                }
            }
        }
    }

    private static void guardarMedicamentosEnArchivo() {
        if (crud.serializar()) {
            System.out.println("Medicamentos guardados correctamente en archivo.");
        } else {
            System.out.println("Error al guardar medicamentos en archivo.");
        }
    }

    private static void cargarMedicamentosDesdeArchivo() {
        if (crud.deserializar()) {
            System.out.println("Medicamentos cargados correctamente desde archivo.");
        } else {
            System.out.println("No se encontraron datos previos. Iniciando con lista vacía.");
        }
    }

    private static void imprimirResumenMedicamentoCreado(Medicamento m) {
        String tipo = (m instanceof MedicamentoNatural) ? "Natural" :
                      (m instanceof Analgesico) ? "Analgésico" : "Desconocido";

        System.out.println("→ ID: " + m.getCodigoUnico());
        System.out.println("→ Tratamiento: " + m.getTratamiento());
        System.out.println("→ Inventario: " + m.getInventario());
        System.out.println("→ Tipo: " + tipo);
        System.out.println();
    }

    private static void imprimirMedicamentoListado(Medicamento m) {
        String tipo = (m instanceof MedicamentoNatural) ? "Natural" :
                      (m instanceof Analgesico) ? "Analgésico" : "Desconocido";

        System.out.println("→ Código único: " + m.getCodigoUnico());
        System.out.println("→ Tratamiento: " + m.getTratamiento());
        System.out.println("→ Inventario: " + m.getInventario());
        System.out.println("→ Tipo: " + tipo);
        System.out.println();
    }
}
