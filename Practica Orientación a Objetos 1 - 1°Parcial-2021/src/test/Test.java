package test;

import java.time.LocalDate;

import modelo.*;

public class Test {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		System.out.println("1)");
		sistema.agregarEmpleado("Melo", "Tomas", "3724", 430.0);
		sistema.agregarEmpleado("Navarro", "Mónica", "3125", 410.0);
		System.out.println(sistema.toString());
		
		System.out.println("2)");
		System.out.println(sistema.traerEmpleado("3125").toString());
		
		System.out.println("3)");
		sistema.agregarTarea("Reparación Catelli altura 1700-1800", LocalDate.of(2021, 5, 13), LocalDate.of(2021, 6, 21), sistema.getLstEmpleados().get(0), 6, true);
		sistema.agregarTarea("Reparación semaforo peatonal Alsina y Boedo", LocalDate.of(2021, 6, 17), LocalDate.of(2021, 7, 25), sistema.getLstEmpleados().get(1), 6, false);
		System.out.println(sistema.toString());
		
		System.out.println("4)");
		Tarea ceAuxTarea = sistema.traerTarea(1);
		System.out.println(ceAuxTarea.toString());
		
		System.out.println("5)");
		System.out.println(ceAuxTarea.calcularJornal());
		
		System.out.println("6)");
		System.out.println(ceAuxTarea.calcularCantidadDeDiasTrabajados(6, 2021));
		
		System.out.println("7)");
		System.out.println(ceAuxTarea.calcularHonorarios(6, 2021));
		
		System.out.println("8)");
		ceAuxTarea = sistema.traerTarea(2);
		System.out.println(ceAuxTarea.toString());
		
		System.out.println("9)");
		System.out.println(ceAuxTarea.calcularJornal());
		
		System.out.println("10)");
		System.out.println(ceAuxTarea.calcularCantidadDeDiasTrabajados(6, 2021));
		
		System.out.println("11)");
		System.out.println(ceAuxTarea.calcularHonorarios(6, 2021));
		
	}

}
