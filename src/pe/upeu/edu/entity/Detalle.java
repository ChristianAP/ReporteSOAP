package pe.upeu.edu.entity;

public class Detalle {
		private int iddetalle;
		private double precio;
		private int cantidad;
		private int idproducto;
		private int idventa;
		public Detalle() {
			
		}
		public Detalle(int iddetalle, double precio, int cantidad, int idproducto, int idventa) {
			super();
			this.iddetalle = iddetalle;
			this.precio = precio;
			this.cantidad = cantidad;
			this.idproducto = idproducto;
			this.idventa = idventa;
		}
		public int getIddetalle() {
			return iddetalle;
		}
		public void setIddetalle(int iddetalle) {
			this.iddetalle = iddetalle;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public int getIdproducto() {
			return idproducto;
		}
		public void setIdproducto(int idproducto) {
			this.idproducto = idproducto;
		}
		public int getIdventa() {
			return idventa;
		}
		public void setIdventa(int idventa) {
			this.idventa = idventa;
		} 
		
}
