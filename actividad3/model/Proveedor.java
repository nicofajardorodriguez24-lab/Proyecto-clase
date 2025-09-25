package co.edu.poli.actividad3.model;

/**
 * Clase que representa un proveedor de medicamentos
 * Contiene informacion sobre origen, certificaciones y pais de procedencia
 * @author Nicolas Fajardo
 */
public class Proveedor {

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
     * @author Nicolas Fajardo
     */
    public Proveedor(String nit, String origen, String producto, String certificacion, Pais pais) {
        this.nit = nit;
        this.origen = origen;
        this.producto = producto;
        this.certificacion = certificacion;
        this.pais = pais;
    }

    /**
     * @return nit del proveedor
     */
    public String getNit() { return nit; }

    /**
     * @param nit nit a asignar
     */
    public void setNit(String nit) { this.nit = nit; }

    /**
     * @return origen del proveedor
     */
    public String getOrigen() { return origen; }

    /**
     * @param origen origen a asignar
     */
    public void setOrigen(String origen) { this.origen = origen; }

    /**
     * @return producto que provee
     */
    public String getProducto() { return producto; }

    /**
     * @param producto producto a asignar
     */
    public void setProducto(String producto) { this.producto = producto; }

    /**
     * @return certificacion del proveedor
     */
    public String getCertificacion() { return certificacion; }

    /**
     * @param certificacion certificacion a asignar
     */
    public void setCertificacion(String certificacion) { this.certificacion = certificacion; }

    /**
     * @return pais de procedencia
     */
    public Pais getPais() { return pais; }

    /**
     * @param pais pais a asignar
     */
    public void setPais(Pais pais) { this.pais = pais; }

    /**
     * Representacion en texto del proveedor
     * @return cadena con los datos del proveedor
     */
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
