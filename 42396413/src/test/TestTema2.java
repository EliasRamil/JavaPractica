package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import modelo.Metrica;
import modelo.SistemaSaludDispositivos;

public class TestTema2 {

	public static void main(String[] args) {
		final String  LINEA = "\n------------------------------------------------------------------\n";

		SistemaSaludDispositivos sistema = new SistemaSaludDispositivos();
		
		System.out.println("1)");
		sistema.agregarEmpresa("Empresa 1");
		sistema.agregarEmpresa("Empresa 2");
		System.out.println(sistema.toString());
		
		System.out.println(LINEA + "2)");
		System.out.println(sistema.traerEmpresa("Empresa 1").toString());
		
		System.out.println(LINEA + "3)");
		try {
			sistema.agregarDispositivo("Sensor Calor", "A2020", sistema.traerEmpresa("Empresa 1"));
			sistema.agregarDispositivo("Sensor Presion", "A2325", sistema.traerEmpresa("Empresa 1"));
			sistema.agregarDispositivo("Sensor Temperatura", "B2021", sistema.traerEmpresa("Empresa 2"));
			sistema.agregarDispositivo("Sensor Humedad", "B2326", sistema.traerEmpresa("Empresa 2"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sistema.toString());
		
		System.out.println(LINEA + "5)");
		System.out.println(sistema.traerDispositivo("A2020").toString());
		
		System.out.println(LINEA + "6)");
		sistema.traerDispositivo("A2020").agregarMetrica(18, LocalDate.of(2022, 9, 18), LocalTime.of(10, 0));
		sistema.traerDispositivo("A2020").agregarMetrica(19, LocalDate.of(2022, 9, 19), LocalTime.of(12, 30));
		sistema.traerDispositivo("A2020").agregarMetrica(23, LocalDate.of(2022, 9, 20), LocalTime.of(15, 0));
		sistema.traerDispositivo("A2020").agregarMetrica(20, LocalDate.of(2022, 9, 21), LocalTime.of(18, 30));
		sistema.traerDispositivo("A2020").agregarMetrica(18, LocalDate.of(2022, 9, 22), LocalTime.of(22, 30));
		System.out.println(sistema.toString());
		
		System.out.println(LINEA + "7)");
		System.out.println(sistema.traerDispositivo("A2020").traerMetrica(LocalDate.of(2022, 9, 19), LocalTime.of(12, 30)).toString());
		
		System.out.println(LINEA + "8)");
		List<Metrica> lstMetricasAux = sistema.traerDispositivo("A2020").traeMetricas(LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21));
		for(int i = 0; i < lstMetricasAux.size(); i++) {
			System.out.println(lstMetricasAux.get(i).toString());
		}
		
		System.out.println(LINEA + "9)");
		lstMetricasAux = sistema.traerMetricas(sistema.traerDispositivo("A2020"), LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21), 22);
		for(int i = 0; i < lstMetricasAux.size(); i++) {
			System.out.println(lstMetricasAux.get(i).toString());
		}
	}

}
