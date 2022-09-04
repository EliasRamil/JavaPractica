package modelo;

import java.util.List;

public class Util {
	public static void peliculasABuscar(INCAA incaa, String sPartePelicula) {
		List<Pelicula> peliculas = incaa.traerPeliculas(sPartePelicula);
		System.out.println("Lista de peliculas que contengan la frase \"" + sPartePelicula + "\"");
		if (peliculas.size() == 0) {
			System.out.println("\tNo hay peliculas dicha frase en el titulo del catalogo de peliculas.");
		}
		for (int i = 0; i < peliculas.size(); i++) {
			System.out.println("\t" + (i + 1) + ") " + peliculas.get(i).toString());
		}
	}
}
