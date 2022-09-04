package test;

import static modelo.Util.peliculasABuscar;
import modelo.INCAA;

public class testINCAA {

	public static void main(String[] args) {
		final String LINEA = "-------------------------------------------------------------------------------------";
		
		INCAA incaa = new INCAA("Your Name");
		System.out.println(incaa.toString());
		
		//------------------------------------------------------------------------------------------------------------------------
		System.out.println(LINEA + "\n1) Prueba agregar");
		try {
			incaa.agregarPelicula("A Silent Voice");
			incaa.agregarPelicula("Ninja Scroll");
			incaa.agregarPelicula("Voice");
			incaa.agregarPelicula("5 centímetros por segundo");
			incaa.agregarPelicula("Popovich and the Voice of the Fabled American West");
			incaa.agregarPelicula("Violet Evergarden: La película");
			incaa.agregarPelicula("Ninja Scroll");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("\n" + incaa.toString());
		
		//-----------------------------------------------------------------------------------------------------------------------
		int iIDABuscar = 7;
		System.out.println("\n" + LINEA + "\n2) Traer pelicula con ID: " + iIDABuscar);
		try {
			System.out.println(incaa.traerPelicula(iIDABuscar).toString());
		} catch (Exception e) {
			System.out.println("No existe la pelicula con el id que desea encontrar");
		}
		
		//------------------------------------------------------------------------------------------------------------------------
		String sBuscarNombre = "Ni";
		System.out.println("\n" + LINEA + "\n3) Traer 1ra pelicula que en su nombre contenga: " + sBuscarNombre);
		try {
			System.out.println(incaa.traerPelicula(sBuscarNombre).toString());
		} catch (Exception e) {
			System.out.println("No existe la pelicula con la frase que desea encontrar");
		}
		
		//------------------------------------------------------------------------------------------------------------------------
		System.out.println("\n" + LINEA + "\n3)El mismo caso anterior pero devolviendo una lista...");
		sBuscarNombre = "vo";
		peliculasABuscar(incaa, sBuscarNombre);
		
		//------------------------------------------------------------------------------------------------------------------------
		iIDABuscar = 3;
		System.out.println("\n" + LINEA + "\n4) Modificar pelicula con ID: " + iIDABuscar);
		try {
			incaa.modificarPelicula(iIDABuscar,"Dragon Ball Super");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("\n" + incaa.toString());
		
		//------------------------------------------------------------------------------------------------------------------------
				iIDABuscar = 6;
				System.out.println("\n" + LINEA + "\n5) Eliminar pelicula con ID: " + iIDABuscar);
				try {
					incaa.eliminarPelicula(iIDABuscar);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("\n" + incaa.toString());
	}

}
