package test;

import modelo.*;

public class Test {

	public static void main(String[] args) throws Exception {
		Sistema sistema = new Sistema();
		
		System.out.println("1-1)");
		try {
			 sistema.agregarServicio("897323", "Mantenimiento maquina de cortar pasto", 2500, 15, true);
		} catch (Exception e) {
			System.err.println(e);
		}
		 
		System.out.println("\n1-2)");
		try {
			 sistema.agregarServicio("8973231", "Mantenimiento maquina de cortar pasto", 2500, 15, true);
		} catch (Exception a) {
			System.err.println(a);
		}
		System.out.println(sistema.toString());
		
		System.out.println("\n1-3)");
		try {
			sistema.agregarProducto("432597", "Manguera de desagote lavarropa", 650, 15, true);
		} catch (Exception b) {
			System.err.println(b);
		}
		
		System.out.println("\n1-4)");
		try {
			sistema.agregarProducto("4325971", "Manguera de desagote lavarropa", 650, 15, true);
		} catch (Exception c) {
			System.err.println(c);
		}
		System.out.println(sistema.toString());
		
		System.out.println("\n2-1)");
		System.out.println("Precio final del servicio: " + sistema.traerMercancia("8973231").calcularPrecioFinal());
		
		System.out.println("\n2-2)");
		System.out.println("Precio final del producto: " + sistema.traerMercancia("4325971").calcularPrecioFinal());
		
		System.out.println("\n3-1)");
		try {
			sistema.agregarProducto("3892871", "Aceite para maquinas", 430, 10, true);
			sistema.agregarServicio("3892815", "Mantenimiento de cortadora de ceped", 2520, 10, true);
			sistema.agregarProducto("9381925", "Tambor lavaropa", 7500, 25, false);
			sistema.agregarServicio("3481759", "Mantenimiento estufa", 1250, 10, false);
		} catch (Exception d) {
			System.err.println(d);
		}
		System.out.println(sistema.toString());
		
		System.out.println("\n3-2)");
		try {
			sistema.agregarServicio("3892815", "Mantenimiento de cortadora de ceped", 2520, 10, true);
		} catch (Exception f) {
			System.err.println(f);
		}
		
		System.out.println("\n3-3)");
		try {
			sistema.agregarProducto("9381925", "Tambor lavaropa", 7500, 25, false);
		} catch (Exception l) {
			System.err.println(l);
		}
		
		System.out.println("\n4)");
		System.out.println(sistema.traerMercanciasEnOferta());
	}

}
