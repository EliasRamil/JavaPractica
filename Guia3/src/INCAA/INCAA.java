package INCAA;

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

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		String sTexto = "Peliculas del Catalogo del INCAA:\n";

		for (int i = 0; i < catalogo.size(); i++) {
			sTexto += (i+1) + ") " + catalogo.get(i).toString() + "\n";
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
		Pelicula retornoPelicula = null;
		boolean bEncontrado = false;
		int iPosición = 0;

		while (!bEncontrado) {
			if (sPelicula == catalogo.get(iPosición).getsNombrePelicula()) {
				retornoPelicula = catalogo.get(iPosición);
				bEncontrado = true;
			} else {
				iPosición++;
			}
		}

		return retornoPelicula;
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
			catalogo.remove(iIDPelicula-1);

			for (int i = 0; i < catalogo.size(); i++) {
				if (catalogo.get(i).getiIDPelicula() != i+1) {
					catalogo.get(i).setiIDPelicula(i + 1);
				}
			}
		} else {
			throw new Exception("No se puede eliminar la pelicula de ID " + iIDPelicula);
		}
	}

}
