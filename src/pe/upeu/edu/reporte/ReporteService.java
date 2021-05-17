package pe.upeu.edu.reporte;

import java.util.Scanner;

public class ReporteService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String fechai;
		String fechaf;
		int idc;
		System.out.println("Ingrese la fecha de inicio: ");
		fechai = teclado.nextLine();
		System.out.println("Ingrese la fecha final: ");
		fechaf = teclado.nextLine();
		System.out.println("Ingrese id del cliente: ");
		idc = teclado.nextInt();
		System.out.print(fechai);
		System.out.println(fechaf);
		System.out.println(idc);
		ReporteImpService rp = new ReporteImpService();
		ReporteDao reporte = rp.getReporteImpPort();
		System.out.println("REPORTE: ");
		System.out.println(reporte.buscar(fechai, fechaf, idc));
	}

}
