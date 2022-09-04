package modelo;

import java.util.ArrayList;
import java.util.List;

public class INCAA {
	private List<Pelicula> catalogo;

	// Constructor:
	public INCAA(String sPeliculaMinimaYObligatoria) {
		this.catalogo = new ArrayList<Pelicula>();

		Pelicula pelicula = new Pelicula(1, sPeliculaMinimaYObligatoria);

		catalogo.add(pelicula);
	}

	// Getters, setters y toString:
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	@Override
	public String toString() {
		String sTexto = "Peliculas del Catalogo del INCAA:\n";

		for (int i = 0; i < catalogo.size(); i++) {
			sTexto += "\t" + (i + 1) + ") " + catalogo.get(i).toString() + "\n";
		}

		return sTexto;
	}

	// Metodos:
	public boolean agregarPelicula(String sPelicula) throws Exception {
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getsNombrePelicula() == sPelicula) {
				throw new Exception("La pelicula " + sPelicula + " ya existe en el catalogo.");
			}
		}

		Pelicula pelicula = new Pelicula(catalogo.size() + 1, sPelicula);

		return catalogo.add(pelicula);
	}

	public Pelicula traerPelicula(int idPelicula) {
		Pelicula retornoPelicula = null;

		if (idPelicula <= catalogo.size() && idPelicula > 0) {
			boolean bEncontrado = false;
			int iPosición = 0;

			while (!bEncontrado) {
				if (idPelicula == catalogo.get(iPosición).getiIDPelicula()) {
					retornoPelicula = catalogo.get(iPosición);
					bEncontrado = true;
				} else {
					iPosición++;
				}
			}

		}

		return retornoPelicula;
	}

	public Pelicula traerPelicula(String sPelicula) {
		Pelicula pelicula = null;

		boolean bHayDatos = false;

		for (int i = 0; i < catalogo.size() && !bHayDatos; i++) {
			boolean bCoinciden = false;

			Pelicula auxPelicula = catalogo.get(i);
			int iPosIni = 0;

			while ((iPosIni + sPelicula.length()) <= auxPelicula.getsNombrePelicula().length() && !bCoinciden) {
				if (sPelicula.equalsIgnoreCase(
						auxPelicula.getsNombrePelicula().substring(iPosIni, (iPosIni + sPelicula.length())))) {
					if (!bHayDatos) {
						bHayDatos = true;
					}
					bCoinciden = true;

					if (bCoinciden) {
						pelicula = auxPelicula;
					}

				} else {
					iPosIni++;
				}

			}

		}

		return pelicula;
	}

	public List<Pelicula> traerPeliculas(String sPelicula) {
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		boolean bHayDatos = false;

		for (int i = 0; i < catalogo.size(); i++) {
			boolean bCoinciden = false;

			Pelicula auxPelicula = catalogo.get(i);
			int iPosIni = 0;

			while ((iPosIni + sPelicula.length()) <= auxPelicula.getsNombrePelicula().length() && !bCoinciden) {
				if (sPelicula.equalsIgnoreCase(
						auxPelicula.getsNombrePelicula().substring(iPosIni, (iPosIni + sPelicula.length())))) {
					if (!bHayDatos) {
						bHayDatos = true;
					}
					bCoinciden = true;

					if (bCoinciden) {
						peliculas.add(auxPelicula);
					}

				} else {
					iPosIni++;
				}

			}

		}

		return peliculas;
	}

	public void modificarPelicula(int iIDPelicula, String sPelicula) throws Exception {
		Pelicula peli = traerPelicula(iIDPelicula);

		if (peli == null) {
			throw new Exception("La pelicula de id " + iIDPelicula + " no existe.");
		} else {
			peli.setsNombrePelicula(sPelicula);
		}
	}

	public void eliminarPelicula(int iIDPelicula) throws Exception {
		Pelicula peli = traerPelicula(iIDPelicula);

		if (peli != null && catalogo.size() > 1) {
			catalogo.remove(iIDPelicula - 1);

			for (int i = 0; i < catalogo.size(); i++) {
				if (catalogo.get(i).getiIDPelicula() != i + 1) {
					catalogo.get(i).setiIDPelicula(i + 1);
				}
			}
		} else if (catalogo.size() == 1) {
			throw new Exception("No se puede eliminar la pelicula de ID " + iIDPelicula + " ya que es el unico archivo minimo y obligatorio que queda.");
		} else {
			throw new Exception("No se puede eliminar la pelicula de ID " + iIDPelicula + " ya que no existe dicho elemento.");
		}
	}

}
