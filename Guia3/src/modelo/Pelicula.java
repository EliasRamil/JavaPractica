package modelo;

public class Pelicula {
	private int iIDPelicula;
	private String sNombrePelicula;
	

	public Pelicula(int iIDPelicula, String sNombrePelicula) {
		this.iIDPelicula = iIDPelicula;
		this.sNombrePelicula = sNombrePelicula;
	}


	public int getiIDPelicula() {
		return iIDPelicula;
	}
	
	
	protected void setiIDPelicula(int iIDPelicula) {
		this.iIDPelicula = iIDPelicula;
	}


	public String getsNombrePelicula() {
		return sNombrePelicula;
	}


	public void setsNombrePelicula(String sNombrePelicula) {
		this.sNombrePelicula = sNombrePelicula;
	}


	@Override
	public String toString() {
		return "Pelicula [ID= " + iIDPelicula + ", Nombre= " + sNombrePelicula + "]";
	}
	
	public boolean equals(Pelicula p) {
		return ( (iIDPelicula == p.iIDPelicula) && (sNombrePelicula.equalsIgnoreCase(p.sNombrePelicula)) ) ? true : false;
	}
}
