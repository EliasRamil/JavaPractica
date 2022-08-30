package test;

import INCAA.INCAA;
import INCAA.Pelicula;

public class testINCAA {

	public static void main(String[] args) throws Exception {
		
		INCAA incaa = new INCAA("Your Name");
		System.out.println(incaa.toString());
		
		incaa.agregarPelicula("A Silent Voice");
		incaa.agregarPelicula("Ninja Scroll");
		incaa.agregarPelicula("5 cent�metros por segundo");
		incaa.agregarPelicula("Violet Evergarden: La pel�cula");
		
		System.out.println(incaa.toString());
		
		Pelicula p1 = incaa.traerPelicula(4);
		System.out.println(p1.toString());
		
		p1 = incaa.traerPelicula("Violet Evergarden: La pel�cula");
		System.out.println(p1.toString());
		
		incaa.modificarPelicula(3, "Promare");
		System.out.println("\n" + incaa.toString());
		
		incaa.eliminarPelicula(1);
		System.out.println("\n" + incaa.toString());
	}

}