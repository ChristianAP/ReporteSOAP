package pe.upeu.edu.reporte;

import javax.xml.ws.Endpoint;

public class ReportePublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:5050/soap/reporte", new ReporteImp());
		System.out.println("Levantado Correctamente");
	}

}
