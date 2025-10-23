package Co.edu.poli.actividad1.servicios;

import Co.edu.poli.actividad1.model.Medicamento;

import java.io.*;
import java.util.Arrays;

public class ImplOperacionesCRUD implements OperacionesCRUD, Serializable {

    private static final long serialVersionUID = 1L;
    private static Medicamento[] medicamentos = new Medicamento[5];

    @Override
    public boolean create(Medicamento medicamento) {
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] == null) {
                medicamentos[i] = medicamento;
                serializar();
                return true;
            }
        }
    
        medicamentos = Arrays.copyOf(medicamentos, medicamentos.length + 5);
        medicamentos[medicamentos.length - 5] = medicamento;
        serializar();
        return true;
    }

    @Override
    public Medicamento read(String id) {
        for (Medicamento m : medicamentos) {
            if (m != null && m.getCodigoUnico().equals(id)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public boolean update(String id, Medicamento nuevoMedicamento) {
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] != null && medicamentos[i].getCodigoUnico().equals(id)) {
                medicamentos[i] = nuevoMedicamento;
                serializar();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] != null && medicamentos[i].getCodigoUnico().equals(id)) {
                medicamentos[i] = null;
                serializar();
                return true;
            }
        }
        return false;
    }

    @Override
    public Medicamento[] listar() {
        return medicamentos;
    }

    @Override
    public Medicamento[] readAll() {
        return medicamentos;
    }

    @Override
    public boolean serializar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("medicamentos.ser"))) {
            oos.writeObject(medicamentos);
            return true;
        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deserializar() {
        File archivo = new File("medicamentos.ser");
        if (!archivo.exists()) return false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            medicamentos = (Medicamento[]) ois.readObject();
            return true;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar: " + e.getMessage());
            return false;
        }
    }
}
