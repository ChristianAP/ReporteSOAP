package pe.upeu.edu.Dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.upeu.edu.entity.Cliente;

@WebService
public interface ReporteDao {
	@WebMethod
	public Cliente buscar(String f1, String f2, int id);
}
