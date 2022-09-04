package modelo;

import java.util.ArrayList;
import java.util.List;

public class INCAA {
	private List<Pelicula> catalogo;

	// Constructor:
	public INCAA(String sPeliculaMinimaYObligatoria, String sGeneroDeLaPeliculaMinYObligatoria) {
		this.catalogo = new ArrayList<Pelicula>();

		Pelicula pelicula = new Pelicula(1, sPeliculaMinimaYObligatoria, new Genero(1, sGeneroDeLaPeliculaMinYObligatoria));

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
	
	public boolean equals(INCAA incaa) {
		return  (this.toString()).equalsIgnoreCase(incaa.toString());
	}

	// Metodos:
	private List<Genero> listaDeGeneros(List<Pelicula> catalogo) {
		List<Genero> listaDeGeneros = new ArrayList<Genero>();

		for (int i = 0; i < catalogo.size(); i++) {
			boolean bExisteGenero = false;

			for (int j = 0; j < listaDeGeneros.size() && !bExisteGenero; j++) {

				if (catalogo.get(i).getGenero().getsGenero().equalsIgnoreCase(listaDeGeneros.get(j).getsGenero())) {
					bExisteGenero = true;
				}

			}

			if (!bExisteGenero) {
				listaDeGeneros.add(new Genero(listaDeGeneros.size() + 1, catalogo.get(i).getGenero().getsGenero()));
			}

		}

		return listaDeGeneros;
	}
	
	
	protected int codigoDeIDDelGeneroDePelicula(List<Pelicula> catalogo, String sGeneroPelicula){
		List<Genero> listaDeGeneros = listaDeGeneros(catalogo);
		boolean bExisteGenero = false;
		int iPos = 0;
		
		for (int i = 0; i < listaDeGeneros.size() && !bExisteGenero; i++) {
			if(listaDeGeneros.get(i).getsGenero().equalsIgnoreCase(sGeneroPelicula)) {
				bExisteGenero = true;
				iPos = listaDeGeneros.get(i).getiIDGenero();
			}
		}
		
		if(!bExisteGenero) {
			iPos = listaDeGeneros.size() + 1;
		}
		
		return iPos;
	}
	
	public boolean agregarPelicula(String sPelicula, String sGeneroPelicula) throws Exception {
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getsNombrePelicula().equalsIgnoreCase(sPelicula)) {
				throw new Exception("La pelicula " + sPelicula + " ya existe en el catalogo.");
			}
		}

		return catalogo.add(new Pelicula(catalogo.size() + 1, sPelicula, new Genero(codigoDeIDDelGeneroDePelicula(catalogo, sGeneroPelicula), sGeneroPelicula)));
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
	
	public List<Pelicula> traerPeliculas(Genero genero) {
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		boolean bHayDatos = false;

		for (int i = 0; i < catalogo.size(); i++) {
			boolean bCoinciden = false;

			Pelicula auxPelicula = catalogo.get(i);
			int iPosIni = 0;

			while (iPosIni < catalogo.size() && !bCoinciden) {
				if (auxPelicula.getGenero().equals(genero)) {
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
	
	private void reasignarIDGeneros() {
		for (int i = 0; i < listaDeGeneros(catalogo).size(); i++) {
			listaDeGeneros(catalogo).get(i).setiIDGenero(i+1);
		}
		
		for (int i = 0; i < catalogo.size(); i++) {
			for (int j = 0; j < listaDeGeneros(catalogo).size(); j++) {
				if(catalogo.get(i).getGenero().getsGenero().equalsIgnoreCase(listaDeGeneros(catalogo).get(j).getsGenero())) {
					catalogo.get(i).getGenero().setiIDGenero(j+1);
				}
			}
		}
	}

	public void modificarPelicula(int iIDPelicula, String sPelicula, String sGenero) throws Exception {
		Pelicula peli = traerPelicula(iIDPelicula);

		if (peli == null) {
			throw new Exception("La pelicula de id " + iIDPelicula + " no existe.");
		} else {
			peli.setsNombrePelicula(sPelicula);
			peli.setGenero(new Genero(codigoDeIDDelGeneroDePelicula(catalogo, sGenero), sGenero));
			
			reasignarIDGeneros();
		}
	}

	public void eliminarPelicula(int iIDPelicula) throws Exception {
		Pelicula peli = traerPelicula(iIDPelicula);

		if (peli != null && catalogo.size() > 1) {
			catalogo.remove(iIDPelicula - 1);

			for (int i = 0; i < catalogo.size(); i++) {
				if (catalogo.get(i).getiIDPelicula() != i + 1) {
					catalogo.get(i).setiIDPelicula(i + 1);
					
					reasignarIDGeneros();
				}
			}
		} else if (catalogo.size() == 1) {
			throw new Exception("No se puede eliminar la pelicula de ID " + iIDPelicula + " ya que es el unico archivo minimo y obligatorio que queda.");
		} else {
			throw new Exception("No se puede eliminar la pelicula de ID " + iIDPelicula + " ya que no existe dicho elemento.");
		}
	}

}
