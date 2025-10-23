package Co.edu.poli.actividad1.model;

import java.io.Serializable;

/**
 * Clase que representa un proveedor de medicamentos
 * Contiene informacion sobre origen, certificaciones y pais de procedencia
 * @author Nicolas Fajardo
 */
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L; // control de version

    private String nit;
    private String origen;
    private String producto;
    private String certificacion;
    private Pais pais;

    /**
     * Constructor con parametros de la clase Proveedor
     * @param nit numero de identificacion tributaria
     * @param origen origen del proveedor
     * @param producto producto que provee
     * @param certificacion certificacion de calidad
     * @param pais pais de procedencia
     */
    public Proveedor(String nit, String origen, String producto, String certificacion, Pais pais) {
        this.nit = nit;
        this.origen = origen;
        this.producto = producto;
        this.certificacion = certificacion;
        this.pais = pais;
    }

    
    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public String getCertificacion() { return certificacion; }
    public void setCertificacion(String certificacion) { this.certificacion = certificacion; }
    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }

   
    @Override
    public String toString() {
        return "Proveedor {" +
                "nit='" + nit + '\'' +
                ", origen='" + origen + '\'' +
                ", producto='" + producto + '\'' +
                ", certificacion='" + certificacion + '\'' +
                ", pais=" + pais +
                '}';
    }
}
