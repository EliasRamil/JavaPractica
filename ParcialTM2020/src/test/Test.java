package test;

import java.time.LocalDate;

import modelo.Gastronomia;
import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		System.out.println("1-1)");
		try {
			sistema.agregarGastronomia("4892", 15, true, "Hamburguesa criolla", 180, 4);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		System.out.println("\n1-2)");
		try {
			sistema.agregarGastronomia("489235", 15, true, "Hamburguesa criolla", 180, 4);
		} catch (Exception t) {
			System.err.println(t);
		}
		
		System.out.println(((Gastronomia)sistema.traerServicio("489235")).toString());
	}

}
