package pe.upeu.edu.entity;

public class Cliente {
		private int idcliente;
		private String nombre;
		private String apellidos;
		private String dni;
		private String direccion;
		private String fecha;
		private String nomprod;
		private int cantidad;
		private int stock;
		public Cliente() {
		
		}
		public Cliente(int idcliente, String nombre, String apellidos, String dni, String direccion, String fecha,
				String nomprod, int cantidad, int stock) {
			super();
			this.idcliente = idcliente;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
			this.direccion = direccion;
			this.fecha = fecha;
			this.nomprod = nomprod;
			this.cantidad = cantidad;
			this.stock = stock;
		}
		public int getIdcliente() {
			return idcliente;
		}
		public void setIdcliente(int idcliente) {
			this.idcliente = idcliente;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		public String getNomprod() {
			return nomprod;
		}
		public void setNomprod(String nomprod) {
			this.nomprod = nomprod;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		
		
}
