package pe.upeu.edu.entity;

public class Venta {
		private int idventa;
		private String fecha; 
		private String tipodoc;
		private String numdoc;
		private int idcliente;
		public Venta() {
			
		}
		public Venta(int idventa, String fecha, String tipodoc, String numdoc, int idcliente) {
			super();
			this.idventa = idventa;
			this.fecha = fecha;
			this.tipodoc = tipodoc;
			this.numdoc = numdoc;
			this.idcliente = idcliente;
		}

		public Venta(int idventa, String fecha, int idcliente) {
			super();
			this.idventa = idventa;
			this.fecha = fecha;
			this.idcliente = idcliente;
		}
		public int getIdventa() {
			return idventa;
		}
		public void setIdventa(int idventa) {
			this.idventa = idventa;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		public String getTipodoc() {
			return tipodoc;
		}
		public void setTipodoc(String tipodoc) {
			this.tipodoc = tipodoc;
		}
		public String getNumdoc() {
			return numdoc;
		}
		public void setNumdoc(String numdoc) {
			this.numdoc = numdoc;
		}
		public int getIdcliente() {
			return idcliente;
		}
		public void setIdcliente(int idcliente) {
			this.idcliente = idcliente;
		}
		
}
