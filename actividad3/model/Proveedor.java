package co.edu.poli.actividad3.model;

public class Proveedor {

	
	   private String nit;
	    private String origen;
	    private String producto;
	    private String certificacion;
	    private Pais pais;
		
	    
	    public Proveedor(String nit, String origen, String producto, String certificacion, Pais pais) {
			super();
			this.nit = nit;
			this.origen = origen;
			this.producto = producto;
			this.certificacion = certificacion;
			this.pais = pais;
		}
		
	    
	    
	    public String getNit() {
			return nit;
		}
		public void setNit(String nit) {
			this.nit = nit;
		}
		public String getOrigen() {
			return origen;
		}
		public void setOrigen(String origen) {
			this.origen = origen;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public String getCertificacion() {
			return certificacion;
		}
		public void setCertificacion(String certificacion) {
			this.certificacion = certificacion;
		}
		public Pais getPais() {
			return pais;
		}
		public void setPais(Pais pais) {
			this.pais = pais;
		}



		@Override
		public String toString() {
			return "Proveedor [nit=" + nit + ", origen=" + origen + ", producto=" + producto + ", certificacion="
					+ certificacion + "]";
		}
	    
	    
	    
	
	
		
		
}
