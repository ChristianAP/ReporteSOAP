package pe.upeu.edu.reporte;

import java.sql.Connection;

import pe.upeu.edu.Dao.ReporteDao;
import pe.upeu.edu.entity.Venta;
import pe.upeu.edu.reporte.ReporteImp;;
public class ReportePrin {
	static Conexion con;
	private ReporteDao reportesDao;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion.getConexion();
				ReporteImp re = new ReporteImp();
			re.buscar("2020/10/09 00:00:00", "2020/10/10 23:59:59",2);
			
			
			
}

}