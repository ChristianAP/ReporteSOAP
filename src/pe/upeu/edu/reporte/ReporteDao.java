
package pe.upeu.edu.reporte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import pe.upeu.edu.dao.Cliente;
import pe.upeu.edu.dao.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReporteDao", targetNamespace = "http://Dao.edu.upeu.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReporteDao {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns pe.upeu.edu.dao.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://Dao.edu.upeu.pe/", className = "pe.upeu.edu.dao.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://Dao.edu.upeu.pe/", className = "pe.upeu.edu.dao.BuscarResponse")
    @Action(input = "http://Dao.edu.upeu.pe/ReporteDao/buscarRequest", output = "http://Dao.edu.upeu.pe/ReporteDao/buscarResponse")
    public Cliente buscar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
