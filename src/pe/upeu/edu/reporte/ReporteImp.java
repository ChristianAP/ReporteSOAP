package pe.upeu.edu.reporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.jws.WebService;
import javax.sound.midi.Soundbank;

import pe.upeu.edu.Dao.ReporteDao;
import pe.upeu.edu.entity.Cliente;
import pe.upeu.edu.entity.Venta;
import pe.upeu.edu.reporte.Conexion;

import java.sql.PreparedStatement;;
@WebService(endpointInterface = "pe.upeu.edu.Dao.ReporteDao")
public class ReporteImp implements ReporteDao {

	private  PreparedStatement ps;
	private  ResultSet rs;
	private  Connection cx;
	@Override
	public Cliente buscar(String f1, String f2, int id) {
			// TODO Auto-generated method stub
		Cliente cli = new Cliente();
			System.out.println("paso");
			try {
				System.out.println("paso2");
				cx = Conexion.getConexion();
				ps = cx.prepareStatement(" Select fecha,nombres, p.nomprod producto,cantidad, stock from detalle d, venta v  ,producto p, cliente c where v.idventa = d.idventa and p.idproducto = d.idproducto and v.idcliente = c.idcliente and v.fecha between ? and ? and c.idcliente = ?;");
				ps.setString(1, f1);
				ps.setString(2, f2);
				ps.setInt(3, id);
				rs = ps.executeQuery();
				System.out.println("correcto");
				while (rs.next()) {
					cli.setFecha(rs.getString("fecha"));;
					cli.setNombre(rs.getString("nombre"));
					cli.setNomprod(rs.getString("producto"));
					cli.setCantidad(rs.getInt("cantidad"));
					cli.setStock(rs.getInt("stock"));
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("valiste");
			}
			return cli;
		
	}


}
