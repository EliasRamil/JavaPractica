package test;

import static modelo.Util.peliculasABuscar;
import modelo.INCAA;

public class testINCAA {

	public static void main(String[] args) {
		final String LINEA = "-------------------------------------------------------------------------------------";

		INCAA incaa = new INCAA("Your Name", "Drama");
		System.out.println(incaa.toString());

		// ------------------------------------------------------------------------------------------------------------------------
		System.out.println(LINEA + "\n1) Prueba agregar");
		try {
			incaa.agregarPelicula("A Silent Voice", "Recuentos de la vida");
			incaa.agregarPelicula("Ninja Scroll", "Samaurais");
			incaa.agregarPelicula("Voice", "Crimen");
			incaa.agregarPelicula("5 centímetros por segundo", "Drama");
			incaa.agregarPelicula("Popovich and the Voice of the Fabled American West", "Comedia");
			incaa.agregarPelicula("Violet Evergarden: La película", "Romance");
			incaa.agregarPelicula("Ninja Scroll", "Samurais");
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

		// ------------------------------------------------------------------------------------------------------------------------
		String sBuscarNombre = "ni";
		System.out.println("\n" + LINEA + "\n3) Traer 1ra pelicula que en su nombre contenga: " + sBuscarNombre);
		try {
			System.out.println(incaa.traerPelicula(sBuscarNombre).toString());
		} catch (Exception e) {
			System.out.println("No existe la pelicula con la frase que desea encontrar");
		}

		// ------------------------------------------------------------------------------------------------------------------------
		System.out.println("\n" + LINEA + "\n3)El mismo caso anterior pero devolviendo una lista...");
		sBuscarNombre = "ice";
		peliculasABuscar(incaa, sBuscarNombre);

		// ------------------------------------------------------------------------------------------------------------------------
		iIDABuscar = 3;
		System.out.println("\n" + LINEA + "\n4) Modificar pelicula con ID: " + iIDABuscar);
		try {
			incaa.modificarPelicula(iIDABuscar, "Dragon Ball Super", "Acción");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("\n" + incaa.toString());

		// ------------------------------------------------------------------------------------------------------------------------
		iIDABuscar = 6;
		System.out.println("\n" + LINEA + "\n5) Eliminar pelicula con ID: " + iIDABuscar);
		try {
			incaa.eliminarPelicula(iIDABuscar);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("\n" + incaa.toString());
		 
		// ------------------------------------------------------------------------------------------------------------------------
		System.out.println("\n" + LINEA + "\n6)Traer pelicualas de un genero");
		sBuscarNombre = "Drama";
		peliculasABuscar(sBuscarNombre,incaa);

	}
	
	

}
