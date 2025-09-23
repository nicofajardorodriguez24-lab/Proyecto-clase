package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.model.*;

public class Cliente {

    public static void main(String[] args) {

 
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

      
        Medicamento medicamento = new Medicamento();
        medicamento.setComprador(comprador);
        medicamento.setProveedor(proveedor);
        medicamento.setReceta(receta);
        medicamento.setPresentacion(presentaciones);
        medicamento.setObservacion(observaciones);
        medicamento.setTratamiento("Analgésico y antipirético");
        medicamento.setSistema("Nervioso Central");
        medicamento.setLote(202310);
        medicamento.setFechaOrigen(2022);
        medicamento.setInventario(150.5);
        medicamento.setRegistro("INVIMA-2023-001");
        medicamento.setIndicacion("Indicado para dolor y fiebre");

     
        System.out.println("=== Información del medicamento principal ===");
        System.out.println(medicamento);
        System.out.println("Antigüedad del medicamento: " + medicamento.calcularAntiguedad() + " años");
        System.out.println("Cálculo de dosis: " + medicamento.calcularDosis(70));

        
        MedicamentoNatural natural1 = new MedicamentoNatural();
        natural1.setTratamiento("Infusión de manzanilla");
        natural1.setFechaOrigen(2021);

        MedicamentoNatural natural2 = new MedicamentoNatural();
        natural2.setTratamiento("Extracto de valeriana");
        natural2.setFechaOrigen(2020);

        Analgesico analgesico = new Analgesico();
        analgesico.setTratamiento("Ibuprofeno 400mg");
        analgesico.setFechaOrigen(2022);

        System.out.println("\n=== Ejemplo de polimorfismo ===");

       
        System.out.println("Dosis natural1: " + natural1.calcularDosis(70));
        System.out.println("Dosis analgesico: " + analgesico.calcularDosis(70));

        

        
        Medicamento[] medicamentos = new Medicamento[5];
        medicamentos[0] = natural1;
        medicamentos[1] = natural2;
        medicamentos[2] = analgesico;
        medicamentos[3] = null; 
        medicamentos[4] = null; 

        System.out.println("\n=== Cálculo de dosis por polimorfismo en arreglo ===");
        for (Medicamento med : medicamentos) {
            if (med != null) {
                System.out.println(med.getTratamiento() + " -> " + med.calcularDosis(70));
            } else {
                System.out.println("Vacío");
            }
        }
    }
}

