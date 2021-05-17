package pe.upeu.edu.reporte;

import java.sql.*;

public class Conexion {
	private static Connection cx = null;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/tienda?characterEncoding=latin1&useConfigs=maxPerformance";
	public  static Connection getConexion() {		
		try {
			Class.forName(driver);
			if(cx==null) {
				cx = DriverManager.getConnection(url, user, "root");
				System.out.println("OKS");
			}		
		} catch (Exception e) {
			System.out.println(e);
		}
		return cx;
	}
}
